package algorithm;

public class MergeSort39 {
	public static void main(String[] args) {
		int p1=0, p2=0, p3=0;
		int a[] = {1, 3, 5};
		int b[] = {2, 3, 6, 7, 9};
		int c[] = new int[a.length+b.length]; 
		
		outer: while(true) {
			if(a[p1]>b[p2]) c[p3++]=b[p2++];
		    else c[p3++]=a[p1++];
			if(p1==a.length || p2==b.length) {
				if(p1==a.length) {
					while(true) {
						c[p3++] = b[p2++];
						if(p2==b.length) break outer;
					}
				} else {
					while(true) {
						c[p3++] = a[p1++];
						if(p2==a.length) break outer;
					}
				}
			}
		}
		for(int i:c) {
			System.out.print(i+", ");
		}
		
		
		
		
		
		
		
		
	}
}
