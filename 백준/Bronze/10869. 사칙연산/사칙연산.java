import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println((int)'Z'); // 65     90
        Scanner sc = new Scanner(System.in);
        String[] arr = sc.nextLine().split(" ");
        int a =Integer.parseInt(arr[0]);
        int b =Integer.parseInt(arr[1]);
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}