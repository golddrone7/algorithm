package algorithm;

public class BottomUp_fibo {
	public static void main(String[] args) {
		System.out.println(bottomUp(10));
	}
	
	public static int bottomUp(int n) {
		int[] arr=new int[n];
		arr[0] = 0;
		arr[1] = 1;
		if(n==0) return arr[0];
		else if(n==1) return arr[1];
		else {
			for(int i=2; i<n+1; i++) arr[i] = arr[i-1] + arr[i-2];
			return arr[n];
		}
	
	}
}
