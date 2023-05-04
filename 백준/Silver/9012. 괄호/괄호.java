import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;



public class Main {


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < T; i++) {
            String test = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean flag = false;
            for (int j = 0; j < test.length(); j++) {
                char c = test.charAt(j);
                if(c == '(') {
                    stack.push(c);
                    continue;
                }
                if(!stack.empty() && c == ')')
                    stack.pop();
                else{
                    flag=true;
                    break;
                }
            }
            if(flag){
                sb.append("NO").append("\n");
                continue;
            }

            if(stack.empty()){
                sb.append("YES").append("\n");
            } else {
                sb.append("NO").append("\n");
            }
        }

        System.out.println(sb.toString());
    }
}