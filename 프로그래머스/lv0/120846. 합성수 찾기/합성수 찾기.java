class Solution {
    public int solution(int n) {
        int answer = 0;
		for(int i=4; i<=n; i++) {
			int mea = 1;
			for(int j=2; j<=i; j++) {
				if(i%j==0) mea++;
				if(mea>=3) {
					answer++;
					break;
				}
			}	
		}
        return answer;
    }
}