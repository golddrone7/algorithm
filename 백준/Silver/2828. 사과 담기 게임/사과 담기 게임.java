
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		int N = Integer.parseInt(st.nextToken()); // 스크린
		int M = Integer.parseInt(st.nextToken()); // 바구니(바구니는 스크린 좌측에 있음)
		int J = Integer.parseInt(br.readLine());
		int result = 0;
		Integer[] arr = new Integer[J];
		for(int i=0; i<J; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
		
		// 1칸일 땐 이동만하면 됨
		// 2칸일 땐? 
		// 3칸일 땐
		// 5칸일 땐 이동안해도됨
		// 현재 위치가 어디고, 몇칸을 차지하는지 구하는 것이 관건임
		// 첫번째 인덱스를 현재 위치라고 가정하자
		// 두번째 인덱스를 첫번째 인덱스 + (바구니 길이-1)를 더해주자
		// 타겟의 위치를 구하자! (첫번째 인덱스랑 두번째 인덱스 중에 가까운 값)
		// 타겟의 위치에 가면 첫번째 인덱스랑 두번째 인덱스를 더해줌. 
		// 그리고 이동해야 하는 거리의 최솟값을 더해주자!
		int firstIdx = 1;
		int secondIdx = 1+(M-1);
		for(int target : arr) {
			if(firstIdx<= target && target <= secondIdx) {
				continue;
			}
			
			// 두번째 값이 idx만큼 움직임
			 if(Math.abs(firstIdx-target)>Math.abs(secondIdx-target)) {
				 int idx = Math.abs(secondIdx-target);
				 result+=idx;
				 firstIdx = target-M+1;
				 secondIdx = target;
//				 System.out.println("hi");
			 } //첫번째 값이 인덱스만큼 움직임 
			 else {
				 int idx = Math.abs(firstIdx-target);
				 result+=idx;
				 firstIdx = target;
				 secondIdx = target+(M-1);
//				 System.out.println("bye");
			 }
		}
		System.out.println(result);
		
	}

}
