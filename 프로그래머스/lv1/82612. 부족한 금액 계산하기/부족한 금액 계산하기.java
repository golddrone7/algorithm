class Solution {
    public long solution(int price, long money, int count) {
        long answer = 0;
        for(int i=0; i<count; i++) {
			money-=price*(i+1);
		}
		
		if(money<0)
			answer = Math.abs(money);
        return answer;
    }
}