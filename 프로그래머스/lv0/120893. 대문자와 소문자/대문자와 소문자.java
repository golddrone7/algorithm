class Solution {
    public String solution(String my_string) {
        String answer = "";
        for(int i=0; i<my_string.length(); i++) {
			if('a' <= my_string.charAt(i) && my_string.charAt(i) <= 'z') {
				answer += (char)(my_string.charAt(i) -32);
			}
			if('A' <= my_string.charAt(i) && my_string.charAt(i) <= 'Z') {
				answer += (char)(my_string.charAt(i) +32);
			}
		}
        
        return answer;
    }
}