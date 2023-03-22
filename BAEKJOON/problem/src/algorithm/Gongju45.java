package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
1. n값을 입력받음
2. a[1]~a[n]까지 배열에 1을 채움
3. k값을 입력받음 
4. k번째마다 현재 배열의 값이 1이라면 차례대로 제거함
5. 1이 아니라면 다음 인덱스로 넘어감
6. 1명 남으면 해당 인덱스값 출력함
*/
public class Gongju45 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int a[] = new int[1001];
		int n, k, rs, p=0, cnt=0;
		
		
		// 1.
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		
		//2. 
		for(int i=1; i<=n; i++) {
			a[i] = 1;
		}
		//3.
		k = Integer.parseInt(br.readLine());
		
		//4. 5.   ??? k를 어디에 배치를 하지
		while(true) {
			p=p+k;
			if(p>n) p=p%n;
			if(a[p]==0) continue;
			a[p] = 0;
			cnt++;
			if(cnt==(n-1)) break;
//			System.out.println("hi");
//			System.out.println(p);
		}
		// 6.
		System.out.println(p);
		

		
	}	
}
