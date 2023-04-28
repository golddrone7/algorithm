import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        String answer=null;
        boolean asc = false, desc = false;
        for (int i = 0; i < arr.length-1; i++) {
            if(Integer.parseInt(arr[i+1])-Integer.parseInt(arr[i])>0){
                answer = "ascending";
                asc=true;
            } else if(Integer.parseInt(arr[i+1])-Integer.parseInt(arr[i])<0){
                answer = "descending";
                desc=true;
            }

            if(asc && desc){
                answer="mixed";
                break;
            }
        }
        System.out.println(answer);
    }
}