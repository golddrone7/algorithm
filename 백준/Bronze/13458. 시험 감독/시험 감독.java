import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N, B, C;
        long[] A;
        long total = 0;
        N = Long.parseLong(sc.nextLine());
        A = new long[(int)N];
        String[] str =  sc.nextLine().split(" ");
        for (int i = 0; i < N; i++) {
            A[i] = Long.parseLong(str[i]);
        }
        String[] temp = sc.nextLine().split(" ");
        B =  Long.parseLong(temp[0]);
        C =  Long.parseLong(temp[1]);

        for (long i : A) {
            total++;
            long d = (long)Math.ceil((i-B)/(double)C);
            if(d<0) continue;
            total+= d;
        }
        System.out.println(total);
    }
}