package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multi46 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[] = new int[2001];
		int n, k, i, p=0, cnt=0, tot=0;
		// n 작업갯수, k 정전 발생한 시간
		
		n =Integer.parseInt(br.readLine());
		for(i=1; i<=n; i++) {
			a[i] = Integer.parseInt(br.readLine());
			tot+=a[i];
		}
		k=Integer.parseInt(br.readLine());
		if(k>=tot) {
			System.out.println("-1\n");
			System.exit(0);
		}
		
		while(true) {
			p++;				// p=, n=3, 
			if(p>n) p=1;
			if(a[p]==0) continue;
			a[p]--;
			cnt++;				
			if(cnt==k) break;		// 정전 발생!!!!
		}					
		while(true) {	
			p++;	// 다음 p의 값을 가기
			if(p>n) p =1;	// p가 작업수보다 크면 1로 설정하기!
			if(a[p]!=0) break; // p인덱스 a가 0이아닐경우 빠져나온다!
		}
		System.out.println(p);
		
		
	}
}
