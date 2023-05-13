import java.util.*;

class Solution {
    public long solution(String numbers) {
        long answer = 0L;
        String tmp="";
		String correct="";
		Map<String, String> map = new HashMap<>();
		map.put("one", "1");
		map.put("two", "2");
		map.put("three", "3");
		map.put("four", "4");
		map.put("five", "5");
		map.put("six", "6");
		map.put("seven", "7");
		map.put("eight", "8");
		map.put("nine", "9");
		map.put("zero", "0");
		
		
		while(!numbers.equals("")) {
			tmp= numbers.substring(0, 3);
			if(map.containsKey(tmp)) {
				numbers = numbers.substring(3);
				correct+=map.get(tmp);
				continue;
			}
			tmp= numbers.substring(0, 4);
			if(map.containsKey(tmp)) {
				numbers = numbers.substring(4);
				correct+=map.get(tmp);
				continue;
			}
			tmp= numbers.substring(0, 5);
			if(map.containsKey(tmp)) {
				numbers = numbers.substring(5);
				correct+=map.get(tmp);
				continue;
			}
		}
		answer = Long.parseLong(correct);
        return answer;
    }
}