import java.util.*;

class Solution {
    public int solution(String my_string) {
        int answer = 0;
        String[] results = my_string.split("[A-Z|a-z]");
        for (int i = 0; i < results.length; i++) {
            if(!results[i].equals("")) {
				answer+=Integer.parseInt(results[i]);
			}
		}
        return answer;
    }
}