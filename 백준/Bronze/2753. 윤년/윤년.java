import java.util.*;
import java.io.*;


public class Main{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int answer = 0;
		int year = 0;
		try {
			year = Integer.parseInt(br.readLine());
			if((year%4==0 && year%100!=0)|| year%400==0)
				answer = 1;
			else 
				answer = 0;
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println(answer);
    }
}  
