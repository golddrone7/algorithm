import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Stack;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] num = new int[N];
        for (int i = 0; i < N; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(num);

        for (int i = 0; i < N; i++) {
            sb.append(num[i]).append("\n");
        }
        System.out.println(sb.toString());
    }
}