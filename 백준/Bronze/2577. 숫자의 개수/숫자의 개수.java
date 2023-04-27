import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc=  new Scanner(System.in);
        int multi = 1;
        for (int i = 0; i < 3; i++) {
            multi = multi * sc.nextInt();
        }
        String result = String.valueOf(multi);
        for (int i = 0; i <= 9; i++) {
            int cnt = 0;
            for (int j = 0; j < result.length(); j++) {
                if(result.substring(j, j+1).equals(String.valueOf(i)))
                    cnt++;
            }
            System.out.println(cnt);
        }
    }
}