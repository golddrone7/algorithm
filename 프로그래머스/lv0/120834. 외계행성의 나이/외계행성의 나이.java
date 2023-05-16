class Solution {
    public String solution(int age) {
        String answer = "";
        String sAge = "" + age;
		for(int i=0; i<sAge.length(); i++) {
			answer += (char)(sAge.charAt(i)+49);
		}
        return answer;
    }
}