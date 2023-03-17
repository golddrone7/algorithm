package problem;

import java.util.Arrays;

public class Pro1 {
	public static void main(String[] args) {
		int answer = 0;
		int[] A = {1,4,2};
		int[] B = {5,4,4};
		Arrays.sort(A);
		Arrays.sort(B);
		
		for(int i=0; i<A.length; i++) {
			answer+= A[i] * B[A.length-i-1];
		}
		
		
		System.out.println(answer);
	}
}
