class Solution {
    public int solution(int num, int k) {
        int answer = 0;
        String str = num+"";
        answer = str.indexOf(""+k);
        if(answer>=0) answer+=1;
        return answer;
    }
}