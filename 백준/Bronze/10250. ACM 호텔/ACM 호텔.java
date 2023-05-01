import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        int H, W, N;
        int answer;
        for (int i=0; i<T; i++) {
            String[] test= br.readLine().split(" ");
            H = Integer.parseInt(test[0]);  // 30층
            W = Integer.parseInt(test[1]);  // 1층당 방의 수 (50)
            N = Integer.parseInt(test[2]);  // 72번째 손님



            answer = N%H==0 ? H*100 : (N%H)*100;  // 층의 수를 구함
            answer += Math.ceil((double) N/H);// 몇호인가?
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }
}