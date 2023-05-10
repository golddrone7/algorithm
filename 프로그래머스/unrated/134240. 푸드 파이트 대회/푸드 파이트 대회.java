class Solution {
    public String solution(int[] food) {
        String answer = "";
        for(int i=1; i<food.length; i++) {
			for(int j=0; j<food[i]/2; j++) {
				answer+=i;
			}
		}
		String reverse = "";
		for(int i=0; i<answer.length(); i++) {
			reverse+=answer.substring(answer.length()-i-1, answer.length()-i);
		}
		answer=answer+"0"+reverse;
        return answer;
    }
}