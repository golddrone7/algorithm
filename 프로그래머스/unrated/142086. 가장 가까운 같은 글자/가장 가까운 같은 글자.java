class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        int index;
        
		for(int i=1; i<s.length(); i++) {
			String temp = s.substring(i, i+1);
			index = 0;
			if(!(s.substring(0, i).contains(temp))) {
				answer[i] = -1;
				continue;
			} 
			
			for(int j=0; j<i; j++) {
				if(s.substring(j,j+1).equals(temp))
					index = j;
			}
			answer[i] = i-index;
		}
        return answer;
    }
}