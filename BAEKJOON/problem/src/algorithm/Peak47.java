package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// 봉우리 문제
/*
	1. 배열을 선언하면 모든 값이 0으로 초기화된다.
	2. n을 입력받고 n*n 배열을 1,1부터 차례대로 채워준다.
	3. 현재 봉우리의 위치가 상, 하, 좌, 우보다 높은지 판단하고 높으면 cnt값을 1증가 시킴
	4. cnt 값 출력한다!
*/

public class Peak47 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[][] = new int[60][60];
		int dx[] = {-1, 0, 1, 0};
		int dy[] = {0, 1, 0, -1};
		int n, i, j, k, cnt=0, flag;
		n = Integer.parseInt(br.readLine());
		for(i=1; i<=n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(j=1; j<=n; j++) {
				a[i][j] =Integer.parseInt(st.nextToken());
			}
		}
		
		
//		for(i=1; i<=n; i++) {
//			for(j=1; j<=n; j++) {
//				flag = 0;
//				for(k=0; k<4; k++) {
//					if(a[i][j]<=a[i+dx[k]][j+dy[k]]) {
//						flag=1;
//						break;
//					}
//				}
//				if(flag==0) cnt++;
//			}
//		}
		
		
		for(i=1; i<=n; i++) {
			for(j=1; j<=n; j++) {
				if(a[i][j]>a[i+1][j] && a[i][j]>a[i-1][j]
						&& a[i][j]>a[i][j+1]
								&& a[i][j]>a[i][j-1]) {cnt++;}
			}
		}
		System.out.println(cnt);
		
	}
}
