import java.util.*;

class Solution {
    public int[] solution(int n) {
        List<Integer> list = new ArrayList<>();
        for(int i=2; i<=n; i++) {
			int cnt = 1;
			for(int j=2; j<=i; j++) {
				if(i%j==0) cnt++;
			}
			if(cnt>2) continue;
			if(n%i==0) {
				list.add(i); 
			}
		}
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++){
            answer[i] = list.get(i);
        }
        return answer;
    }
}