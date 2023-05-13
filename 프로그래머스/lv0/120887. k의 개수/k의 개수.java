class Solution {
    public int solution(int i, int j, int k) {
        int answer = 0;
        for(; i<=j; i++) {
			if((String.valueOf(i).indexOf(String.valueOf(k))) != -1) {
				String str = String.valueOf(i);
				for(int m=0; m<str.length(); m++) {
					if(str.substring(m, m+1).equals(String.valueOf(k)))
							answer++;
				}
			}
		}
        
        return answer;
    }
}