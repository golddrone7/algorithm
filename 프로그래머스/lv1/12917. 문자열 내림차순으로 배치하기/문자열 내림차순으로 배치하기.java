import java.util.Arrays;

class Solution {
    public String solution(String s) {
        String answer = "";
        char array[] = s.toCharArray();
		Arrays.sort(array);
		for(int i=array.length; i>0; i--) {
			answer+=array[i-1];
		}
        
        return answer;
    }
}