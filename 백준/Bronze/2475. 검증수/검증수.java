import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = sc.nextLine().split(" ");
        int total = 0;
        for (int i = 0; i < str.length; i++) {
            total += Integer.parseInt(str[i])*Integer.parseInt(str[i]);
        }
        System.out.println(total%10);
    }
}