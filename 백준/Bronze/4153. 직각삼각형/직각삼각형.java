import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true){
            String[] arr = br.readLine().split(" ");
            int[] num = new int[3];
            for (int i = 0; i < 3; i++) {
                num[i] = Integer.parseInt(arr[i]);
            }
            Arrays.sort(num);
            int a = num[0];
            int b = num[1];
            int c = num[2];
            if(a==0 && b==0 && c==0) break;
            if(a*a + b*b == c*c) sb.append("right").append("\n");
            else sb.append("wrong").append("\n");
        }
        System.out.println(sb.toString());
    }
}