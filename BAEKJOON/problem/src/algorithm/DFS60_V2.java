package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class DFS60_V2 {
	static int n, total=0;
	static int a[] = new int[11];
	static int i;
	static boolean flag = false;
	
	public static void DFS(int L, int sum) {
		if(flag==true) return;
		if(sum>total/2) return;
		
		if(L==n+1) {
			if(sum==total-sum)
				flag=true;
		} else {
			DFS(L+1, sum+a[L]);
			DFS(L+1, sum);
		}
	}
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		for(int i=1; i<=n; i++) {
			a[i] = Integer.parseInt(st.nextToken());
			total+=a[i];
		}
		DFS(1, 0);
		
		if(flag)
			System.out.println("YES");
		else
			System.out.println("NO");
	}

}
