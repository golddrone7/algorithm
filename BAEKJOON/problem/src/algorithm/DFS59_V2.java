package algorithm;

public class DFS59_V2 {
	static int n=3;
	static int ch[] = new int[11];
	
	public static void DFS(int L) {
		if(L==n+1) {
			for(int i=1; i<=n; i++) {
				if(ch[i]==1)
					System.out.print(i + " ");
			}
			System.out.println();
		} else {
			ch[L]=1;
			DFS(L+1);
			ch[L]=0;
			DFS(L+1);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DFS(1);
	}

}
