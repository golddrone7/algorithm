import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] test = br.readLine().split(" ");
        int N=Integer.parseInt(test[0]);
        int M=Integer.parseInt(test[1]);
        int sum = 0;
        int kk=2100000000;
        int answer=0;
        String[] arr = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();
        for (String s : arr) {
            list.add(Integer.parseInt(s));
        }

        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                for (int k = 0; k < list.size(); k++) {
                    if(i==j || j==k || i==k) continue;
                    sum = list.get(i) + list.get(j) + list.get(k);
                    if(M-sum<=kk && M-sum>=0) {
                        kk = M-sum;
                        answer = sum;
                    }
                }
            }
        }
        System.out.println(answer);
    }
}