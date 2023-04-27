import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        int max=-21000000;
        int idx=-1;
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 9; i++) {
            int n = sc.nextInt();
            if(n>max){
                max = n;
                idx = i+1;
            }
        }
        System.out.println(max);
        System.out.println(idx);
    }
}