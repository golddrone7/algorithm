class Solution {
    public int solution(int n) {
        int answer = 1;
        while(((double)answer*7)/n<1){
            answer++;
        }
        return answer;
    }
}