package algorithm;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Gongju45_2 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n, k, pos=0, bp=0, cnt=0;
		n=8;
		k=3;
		int[] prince = new int[n+1];
		while(true) {
			pos++;
			if(pos>n) pos = 1;
			if(prince[pos]==0) {
				cnt++;
				if(cnt==k) {
					prince[pos]=1;
					cnt=0;
					bp++;
				}
			}
			if(bp==n-1) break;
		}
		
		for(int i=1; i<=n; i++) {
			if(prince[i] == 0) {
				System.out.println(i);
				break;
			}
		}
		
		
		
		
		
		
		
	}

}
