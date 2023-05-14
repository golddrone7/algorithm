class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int m = Math.max(sides[0], sides[1]); // 가장 큰 긴변
		int n = Math.min(sides[0], sides[1]);
		for(int i=m-n+1; i<=m; i++) {
			answer++;
		}
		
		// i가 가장 큰 긴변일땐
		for(int i=m+1; m+n>i; i++) {
			answer++;
		}
        return answer;
    }
}