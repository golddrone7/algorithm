class Solution {
    public int solution(int n) {
        int m = n;
        int answer = 0;
        while(true) {
			System.out.println(m);
			if(m%6==0)
				break;
			m+=n;
		}
        answer = m/6;
        return answer;
    }
}