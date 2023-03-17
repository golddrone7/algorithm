package problem;

import java.util.Stack;

public class Pro2 {

	public static void main(String[] args) {
		boolean answer = true;
		Stack<Character> stk = new Stack<>();
		String s= ")()(";
		
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
		System.out.println(answer);
	}
		
		

}
