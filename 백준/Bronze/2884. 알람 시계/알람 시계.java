import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] test = br.readLine().split(" ");
        int hour = Integer.parseInt(test[0]);
        int minute = Integer.parseInt(test[1]);
        if(minute<45) {
            if(hour==0) hour = 23;
            else hour--;
            minute = minute + 60 - 45;
        } else {
            minute -= 45;
        }
        System.out.println(hour + " " + minute);
    }
}