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
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < N; i++) {
            String s = br.readLine();
            switch (s){
                case "top":
                    if(stack.isEmpty()){
                        System.out.println(-1);
                    } else {
                        System.out.println(stack.peek());
                    }
                    break;
                case "size":
                    System.out.println(stack.size());
                    break;
                case "empty":
                    if(stack.isEmpty())
                        System.out.println(1);
                    else
                        System.out.println(0);
                    break;
                case "pop":
                    if(!stack.isEmpty())
                        System.out.println(stack.pop());
                    else
                        System.out.println(-1);
                    break;
                default:
                    String[] test = s.split(" ");
                    stack.push(Integer.parseInt(test[1]));
            }
        }

    }
}