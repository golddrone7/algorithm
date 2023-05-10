class Solution {
    public String[] solution(String my_str, int n) {
        String[] answer = my_str.length()%n == 0 ?  new String[my_str.length()/n] : new String[my_str.length()/n+1];
		int i=0;
		while(!my_str.equals("")) {
			if(n<=my_str.length()) {
				answer[i++] = my_str.substring(0, n);
				my_str = my_str.substring(n);
			}
			else {
                answer[i++] = my_str.substring(0);
			    my_str = "";
			}
		}
        
        return answer;
    }
}