package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class Merge39_V1 {
	static int a[] = new int[101], b[] = new int[101], c[] = new int[101];
	
	public static void main(String[] args) {
		int n, m, i, p1=1, p2=1, p3=1;
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i=1; i<=n; i++) {
			a[i] = sc.nextInt();
		}
		m = sc.nextInt();
		for(i=1; i<=m; i++) {
			b[i] = sc.nextInt();
		}
		
		while(p1<=n && p2<=m) {
			if(a[p1]<b[p2]) {
				c[p3++]=a[p1++];
			} else {
				c[p3++]=b[p2++];
			}
		}
		while(p1<=n) c[p3++]=a[p1++];
		while(p2<=m) c[p3++]=b[p2++];
		
		
		System.out.println(Arrays.toString(c));
		
		
		
		
		
	}
}
