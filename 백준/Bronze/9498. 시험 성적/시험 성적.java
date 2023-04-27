import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println((int)'Z'); // 65     90
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        switch (n / 10) {
            case 10:
            case 9:
                System.out.println("A");
                break;
            case 8:
                System.out.println("B");
                break;
            case 7:
                System.out.println("C");
                break;
            case 6:
                System.out.println("D");
                break;
            default:
                System.out.println("F");
        }
    }
}