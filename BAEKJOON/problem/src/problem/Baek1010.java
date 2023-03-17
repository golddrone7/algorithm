package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Baek1010 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		long answer[][] = new long[n][2];
		for(int i=0; i<n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			answer[i][0] = Long.parseLong(st.nextToken());
			answer[i][1] = Long.parseLong(st.nextToken());
		}
		
		for(int i=0; i<n; i++) {
			long result = factorial(answer[i][0])/(factorial(answer[i][0] - answer[i][1])*factorial(answer[i][1]));
			System.out.println(result);
		}
	
		
		
	}
	public static long factorial(long num) {
		if(num==1) {
			return 1;
		}
		return num * factorial(num-1);
	}

}
