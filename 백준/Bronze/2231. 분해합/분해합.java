import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isflag = false;
        int num = sc.nextInt();
        for (int i = 1; i < num; i++) {
            int sum=0;
            int temp = i;
            sum+=i;
            while (temp!=0){
                int k = temp%10;
                sum+=k;
                temp/=10;
            }
            if(sum==num) {
                System.out.println(i);
                isflag = true;
                break;
            }
        }

        if(!isflag) System.out.println(0);
    }
}