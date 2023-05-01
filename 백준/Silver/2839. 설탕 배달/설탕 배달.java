import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = -1;
        for (int i = 0; i <= N/5; i++) {
            int cnt = 0;
            int tmp = N;
            cnt = (tmp-(5*i)) / 5;
            tmp = tmp -5*cnt;
            if(tmp%3==0){
                cnt += tmp/3;
                answer = cnt;
                break;
            }
        }
        System.out.println(answer);
    }
}