package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
/*
 * 
 *	1) 각행의 평균을 구함
	2) |평균 - 값| = 최소인 것을 구함 
	3) 출력함
 * 
 * 
 */
public class RowAvg48 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[][] = new int[9][9];
		int avg[] = new int[9];
		int tot, min, near;
		for(int i=0; i<9; i++) {
			tot = 0;
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<9; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
				tot += a[i][j];
			}
			avg[i] = (int) Math.round(tot/9.0);
		}
		
		for(int i=0; i<9; i++) {
			min = Math.abs(a[i][0]-avg[i]);
			near = a[i][0];
			for(int j=1; j<9; j++) {
				int curr = Math.abs(a[i][j]-avg[i]);
				if(min==curr) {
					if(near<a[i][j]) {
						near = a[i][j];
					}
				} else if(min>curr) {
					min = curr;
					near = a[i][j];
				}
			}
			System.out.println(avg[i] + " " + near);
		}
	}
}
