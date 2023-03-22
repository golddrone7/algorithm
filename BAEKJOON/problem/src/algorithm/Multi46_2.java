package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Multi46_2 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a[] = new int[2001];
		int n, k, i, tot=0, cnt=0, p=0;
		n = Integer.parseInt(br.readLine());
		for(i=1; i<=n; i++) {
			a[i] = Integer.parseInt(br.readLine());
			tot+=a[i];
		}
		k = Integer.parseInt(br.readLine());
		
		if(k>=tot) {
			System.out.println("-1");
			System.exit(0);
		}
		
		while(true) {
			p++;
			if(p>n) p=1;
			if(a[p]==0) continue;
			a[p]--;
			cnt++;
			if(cnt==k) break;
		}
		while(true) {
			p++;
			if(p>n)p=1;
			if(a[p]!=0) break;
		}
		
		System.out.println(p);
			
		
	}

}
