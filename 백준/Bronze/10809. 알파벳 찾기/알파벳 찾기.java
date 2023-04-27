import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        for (int i = 0; i <26; i++) {
            System.out.print(S.indexOf('a'+i) + " ");
        }
//        System.out.println((int)'z'-(int)'a');   // 97 ~ 122 (a~z)  26
    }
}