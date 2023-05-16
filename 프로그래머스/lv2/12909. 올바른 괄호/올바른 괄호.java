import java.util.Stack;

class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stk = new Stack<>();
        outer : for(int i=0; i<s.length(); i++) {
			char c = s.charAt(i);
			
			if(c == '(') {
				stk.push(c);	
			}
			if(c == ')') {
				if(stk.size()==0) {
					answer = false;
					break outer;
				}
				stk.pop();
			}
		}
		if(stk.size()!=0) {
			answer = false;
		}

        return answer;
    }
}