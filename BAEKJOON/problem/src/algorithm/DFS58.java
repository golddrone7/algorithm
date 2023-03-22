package algorithm;

public class DFS58 {

	
	public static void D(int v) {
		if(v>7) return;
		else {
			// 전위 순회
			D(v*2);
			// 중위 순회
			D(v*2+1);
			// 후위 순회
			System.out.println(v);
			// 병합정렬이 후위순회를 사용함
		} 		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		D(1);
		
	}
}
