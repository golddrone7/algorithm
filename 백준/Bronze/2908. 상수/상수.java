import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] test = br.readLine().split(" ");
        char[] A = test[0].toCharArray();
        char[] B = test[1].toCharArray();
        String aStr = String.valueOf(A[2])+String.valueOf(A[1])+String.valueOf(A[0]);
        String bStr = String.valueOf(B[2])+String.valueOf(B[1])+String.valueOf(B[0]);
        int aInt = Integer.parseInt(aStr);
        int bInt = Integer.parseInt(bStr);
        System.out.println(aInt>bInt? aInt : bInt);
    }
}