import java.util.*;
class Solution {
    public String[] solution(String[] quiz) {
        String[] answer = new String[quiz.length];
		
		for(int i=0; i<quiz.length; i++) {
			StringTokenizer st = new StringTokenizer(quiz[i], " ");
			int a = Integer.parseInt(st.nextToken());
			String oper = st.nextToken();
			int b = Integer.parseInt(st.nextToken());
            st.nextToken();
			int c = Integer.parseInt(st.nextToken());
			if(oper.equals("+")) {
				answer[i] = a+b==c? "O" : "X";
			} else {
				answer[i] = a-b==c? "O" : "X";
			}
		}
		
        return answer;
    }
}