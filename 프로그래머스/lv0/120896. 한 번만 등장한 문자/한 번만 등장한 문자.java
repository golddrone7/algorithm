import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
			String a = s.substring(i, i+1);
			String b = s.substring(0, i).concat(s.substring(i+1));
			if(b.indexOf(a) == -1)
				answer += a;
		}
        char[] array = answer.toCharArray();
		Arrays.sort(array);
        return new String(array);
    }
}