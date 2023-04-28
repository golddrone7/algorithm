import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] test = br.readLine().split(" ");
        int N = Integer.parseInt(test[0]);
        int X = Integer.parseInt(test[1]);
        String[] A = br.readLine().split(" ");
        for (int i = 0; i < N; i++) {
            if(Integer.parseInt(A[i])<X)
                sb.append(A[i] + " ");
        }
        System.out.println(sb);
    }
}