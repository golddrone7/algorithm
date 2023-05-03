import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;



public class Main {
    public static int gcd(int a, int b){
        while(b>0){
            int tmp=a%b;
            a = b;
            b = tmp;
        }
        return a;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] test = br.readLine().split(" ");
        int a = Math.max(Integer.parseInt(test[0]),Integer.parseInt(test[1]));
        int b = Math.min(Integer.parseInt(test[0]),Integer.parseInt(test[1]));
        System.out.println(gcd(a, b));
        System.out.println(a*b/gcd(a, b));
    }
}