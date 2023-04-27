import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = Integer.parseInt(sc.nextLine());
        String[] num = sc.nextLine().split(" ");
        int max = -2100000000;
        int min = 2100000000;

        for (int i = 0; i < num.length; i++) {
            int compare = Integer.parseInt(num[i]);
            if(compare>max) max = compare;
            if(compare<min) min = compare;
        }
        System.out.println(min + " " + max);
//        System.out.println((int)'z'-(int)'a');   // 97 ~ 122 (a~z)  26
    }
}