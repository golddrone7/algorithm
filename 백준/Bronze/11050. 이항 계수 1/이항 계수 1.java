import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> board = new ArrayList<>();
        String[] test = br.readLine().split(" ");
        int N=Integer.parseInt(test[0]);
        int K=Integer.parseInt(test[1]);
        double answer=1;
        for (int i = 1; i <= K ; i++) {
            answer *= (double)(N-i+1) /i;
        }


        System.out.println((int)answer);
    }
}