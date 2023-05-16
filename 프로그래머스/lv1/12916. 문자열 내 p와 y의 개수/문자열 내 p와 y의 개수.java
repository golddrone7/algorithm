class Solution {
    boolean solution(String s) {
        boolean answer = false;
        s=s.toLowerCase();
		int count[] = new int[2];
		
		for(int i=0; i<s.length(); i++) {
			if(s.substring(i, i+1).equals("p"))
				count[0]++;
			else if(s.substring(i, i+1).equals("y")) 
				count[1]++;
		}
		
		if(count[0]==count[1])
			answer = true;

        return answer;
    }
}