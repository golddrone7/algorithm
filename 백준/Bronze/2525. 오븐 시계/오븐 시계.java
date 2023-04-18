import java.io.*;
import java.util.*;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int hour = Integer.parseInt(st.nextToken());
		int minute = Integer.parseInt(st.nextToken());
		int yoriMinute = Integer.parseInt(br.readLine());
		
		hour+=(minute+yoriMinute)/60;
		hour= hour%24;
		minute=(minute+yoriMinute)%60;
		System.out.println(hour + " " + minute);
	
        
    }
    
    
}