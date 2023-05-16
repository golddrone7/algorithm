class Solution {
    public int solution(int[] numbers, int k) {
        int answer = 0;
        int i=0;
		while(k!=1) {
			if(i+2<=numbers.length)
				i+=2;
			else if(i==numbers.length) {
				i=2;
			} else
				i=1;
			if(i==numbers.length) answer = numbers[i-1];
			else answer = numbers[i];
			k--;
		}
        
        return answer;
    }
}