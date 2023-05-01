import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb= new StringBuilder();
        String test;
        while (!(test = br.readLine()).equals("0")){
            boolean flag = true;

            for (int i = 0; i < test.length()/2; i++) {
                if(test.charAt(i) != test.charAt(test.length()-1-i)){
                    flag=false;
                    break;
                }
            }
            if(flag)sb.append("yes").append("\n");
            else sb.append("no").append("\n");

        }
        System.out.print(sb);
    }
}