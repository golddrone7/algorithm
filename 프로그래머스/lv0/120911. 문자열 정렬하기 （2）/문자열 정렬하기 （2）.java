import java.util.*;

class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        my_string = my_string.toLowerCase();
		char[] array = my_string.toCharArray();
		Arrays.sort(array);
        for(int i=0; i<array.length; i++) {
			answer+=array[i];
		}
        return answer;
    }
}