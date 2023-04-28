import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] test = br.readLine().split(" ");
        int N =Integer.parseInt(test[0]);
        int M = Integer.parseInt(test[1]);
        int[] list = new int[N];
        for (int i = 1; i <= N; i++) {
            list[i-1] = i;
        }
        for (int k = 0; k < M; k++) {
            String[] reverse = br.readLine().split(" ");
            int i =Integer.parseInt(reverse[0])-1;    // 1
            int j = Integer.parseInt(reverse[1])-1;   // 2
            int cnt = (j-i)%2==0 ? (j-i)/2 : (j-i)/2+1;
          //  System.out.println(cnt);
            for (int l = 0; l < cnt; l++) {
                int tmp = list[i+l];
                list[i+l] = list[j-l];
                list[j-l] = tmp;
            }
//            System.out.println();
        }
            for (Integer integer : list) {
                System.out.print(integer+ " ");
            }

    }
}