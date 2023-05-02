import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] test = br.readLine().split(" ");
        StringBuilder sb = new StringBuilder();
        int M=Integer.parseInt(test[0]);
        int N=Integer.parseInt(test[1]);

        for (int i = M; i <= N ; i++) {
            if(i<=1) continue;
            boolean flag = false;
            for (int j = 2; j*j <= i ; j++) {
                if(i%j==0) {
                    flag=true;
                    break;
                }
            }
            if(!flag){
                sb.append(i).append("\n");
            }
        }
        System.out.print(sb.toString());
    }
}