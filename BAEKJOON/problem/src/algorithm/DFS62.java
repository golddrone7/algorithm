package algorithm;

public class DFS62 {
	
	static int data[] ={0, 7, 6, 3, 1, 5, 2, 4, 8};
	static int tmp[] = new int[10];
	
	public static void divide(int lt, int rt) {
		int mid;
		int p1, p2, p3;
		if(lt<rt) {
			mid=(lt+rt)/2;
			divide(lt, mid);
			divide(mid+1, rt);
			p1=lt;
			p2=mid+1;
			p3=lt;
			// 후위 순회
			while(p1<=mid && p2<=rt) {
				if(data[p1]<data[p2]) tmp[p3++]=data[p1++];
				else tmp[p3++]=data[p2++];
			}
			
			while(p1<=mid) tmp[p3++]=data[p1++];
			while(p2<=rt) tmp[p3++]=data[p2++];
			for(int i=lt; i<=rt; i++) {
				data[i] = tmp[i];
			}
		}
		
	}
	
	
	public static void main(String[] args) {
		int n=8;
			
		divide(1,n);
		
		for(int i:data) {
			System.out.print(i + ", ");
		}
		
		
	}

}
