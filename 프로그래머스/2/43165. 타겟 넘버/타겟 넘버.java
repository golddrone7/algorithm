import java.util.*;

class Solution {
    int answer;
    int targetAck;
    public void dfs(int[] numbers, int sum, int depth){
     
        if(depth == numbers.length){
            if(sum==targetAck) answer++;
            return;
        } 
        dfs(numbers, sum+numbers[depth], depth+1);
        dfs(numbers, sum-numbers[depth], depth+1);
    }
    
    public int solution(int[] numbers, int target) {
        targetAck = target;
        dfs(numbers, 0, 0);
        return answer;
    }
}