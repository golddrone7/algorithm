import java.util.*;
class Solution {
    public int solution(String before, String after) {
        int answer=0;
        char[] array = before.toCharArray();
		char[] array2 = after.toCharArray();
        String beforeT ="";
		String afterT ="";
		Arrays.sort(array);
		Arrays.sort(array2);
        for(char c : array) {
			beforeT += c;
		}
		for(char c : array2) {
			afterT += c;
		}
        
		if(beforeT.equals(afterT))
			answer=1;
		
        return answer;
    }
}