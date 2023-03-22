package algorithm;

import java.util.Arrays;

public class N2M {

	public static int power(int N, int M) {
		if(M<2) return N;
		
		return N*power(N, M-1);
	}
	
	public static void lower(int N) {
		if(N==1) return;
		for(int i=2; i<=N; i++) {
			if(N%i==0) {
				System.out.print(i+", ");
//				System.out.println(N);
				lower(N/i);
				break;
			}
		}
	}
	
	
	
	public static void main(String[] args) {
		System.out.println(power(10, 2));
		lower(60);
		
		System.out.println();
		int arr[] = new int[10];
		arr[0] = 1;
		arr[1] = 1;
		
		for(int i=2; i<10; i++) {
			arr[i]=arr[i-2]+arr[i-1];
		}
		
		System.out.println(Arrays.toString(arr));
		
		
		
		
		
	}
}
