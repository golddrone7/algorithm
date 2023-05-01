import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String []test = br.readLine().split(" ");
        int x = Integer.parseInt(test[0]);
        int y = Integer.parseInt(test[1]);
        int w = Integer.parseInt(test[2]);
        int h = Integer.parseInt(test[3]);

        int answer = (int)Math.min(Math.abs(x-w), Math.abs(y-h));
        int answer2 = (int)Math.min(x, y);
        int result = (int)Math.min(answer,answer2);
        System.out.println(result);
    }
}