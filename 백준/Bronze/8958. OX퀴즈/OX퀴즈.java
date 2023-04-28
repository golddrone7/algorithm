import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        String[] arr = new String[T];
        for (int i = 0; i < T; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < T; i++) {
            int sum=0;
            int ox = 1;
            for (int j = 0; j < arr[i].length(); j++) {
                if(arr[i].charAt(j) == 'O'){
                    sum=sum+ox++;
                } else {
                    ox = 1;
                }
            }
            System.out.println(sum);
        }
    }
}