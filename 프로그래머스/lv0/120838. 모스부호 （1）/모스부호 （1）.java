import java.util.*;

class Solution {
    public String solution(String letter) {
        String answer = "";
        String[] array = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."} ;
		
        StringTokenizer tk = new StringTokenizer(letter, " ");
		while(tk.hasMoreTokens()) {
			String mor = tk.nextToken();
			for(int i=0; i<array.length; i++) {
				if(mor.equals(array[i])) {
					answer += (char)(i+97);
					break;
				}
			}
		}
        
        return answer;
    }
}