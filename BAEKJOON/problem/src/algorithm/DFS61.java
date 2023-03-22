package algorithm;

public class DFS61 {
	static int a[] = {2,4,6,8};
	static int M=12;
	static int N=4;
	static boolean F=false;
	public static void DFS(int L, int sum) {
		if(L==N+1) return;
		if(M<sum) return;
		if(sum==M) {
			F=true;
			return;
		}
		DFS(L+1, sum+a[L-1]);
		DFS(L+1, sum);
		DFS(L+1, sum-a[L-1]);
	}
	public static void main(String[] args) {
		DFS(1, 0);
		if(F==true) System.out.println("YES");
		else System.out.println("NO");
	}
}
