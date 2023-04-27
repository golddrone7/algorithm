import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
//        System.out.println((int)'Z'); // 65     90
        Scanner sc=  new Scanner(System.in);
        int[] num = new int[26];
        String N = sc.nextLine().toUpperCase();
        for (int i = 0; i < N.length(); i++) {
            num[N.charAt(i)-65]++;
        }
        int max=-1000000;
        int idx=0;
        boolean isTrue = false;
        for (int i = 0; i < num.length; i++) {
            if (max < num[i]) {
                max = num[i];
                idx = i;
                isTrue = true;
            } else if (max == num[i]) {
                isTrue = false;
            }
        }
        if(!isTrue){
            System.out.println("?");
        } else {
            System.out.println((char)(idx+65));
        }
    }
}