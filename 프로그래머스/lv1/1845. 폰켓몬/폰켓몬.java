import java.util.*;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        Set<Integer> set = new HashSet<>();
		int select = nums.length/2;
		
		for(int i=0; i<nums.length; i++)
			set.add(nums[i]);
		
		if(set.size()>=select) {
			answer=select;
		} else {
			answer=set.size();
		}
        return answer;
    }
}