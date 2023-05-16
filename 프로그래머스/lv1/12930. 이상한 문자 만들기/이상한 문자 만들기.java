import java.util.*;
class Solution {
    public String solution(String s) {
       String answer = "";
       int count=0;
			
		for(int i=0; i<s.length(); i++) {
			if(s.substring(i, i+1).equals(" ")) {
				count=0;
                answer+= " ";
				continue;
			}
			if(count%2==0) {
				answer+=s.substring(i, i+1).toUpperCase();
			} else
				answer+=s.substring(i, i+1).toLowerCase();
			count++;
		}
		
        return answer;
    }
}