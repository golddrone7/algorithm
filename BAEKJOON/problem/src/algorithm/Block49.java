package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Block49 {
	/*
		1. N값을 입력받는다(블록의 크기)
		2. N값의 만큼 정면의 높이 정보를 대입
		3. N값의 만큼 오른쪽 측면 높이 정보를 대입
		4. O(N*N)만큼 순회해서 right 배열, center배열의 최솟값을 구함.
		5. total 변수에 더해주자!
	
		2 0 3 1	  3 [3]	0,3 1,3 2,3 3,3
		----------
		2 0 2 1	  2 [2] 0,2 1,2 2,2 3,2
		----------
		1 0 1 1   1 [1]
		----------
		1 0 1 1	  1 [0]
		
		2 0 3 1
		
		0 1 2 3
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N, total=0;
		// 1.
		N = Integer.parseInt(br.readLine());
		int center[] = new int[N];
		int right[] = new int[N];
//		int arr[][] = new int[N][N];
		// 2.
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			center[i] = Integer.parseInt(st.nextToken());
		}
		// 3.
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			right[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				total += Math.min(center[j], right[N-i-1]);
			}
		}
		System.out.println(total);
			
	}

}
