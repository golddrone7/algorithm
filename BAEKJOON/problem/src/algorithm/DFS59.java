package algorithm;

import java.util.Scanner;

public class DFS59 {
	static int n = 3;
	static int ch[] = new int[11];
	// 레벨의 개념으로 풀었고
	public static void DFS(int L) {
		if(L==n+1) {
			for(int i=1; i<=n; i++) {
				if(ch[i]==1)
					System.out.print(i + " ");
			}
			System.out.println();
		}
		else {
			ch[L]=1;	// 좌측 레벨은 1로 설정
			DFS(L+1);  
			ch[L]=0;    // 우측 레벨은 0으로 설정
			DFS(L+1);
		}
	}
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DFS(1); 	// Level의 개념, 1레벨부터 시작
		
	}

}
