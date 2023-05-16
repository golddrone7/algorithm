import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        
		for(int i=0; i<commands.length; i++) {
			int len = commands[i][1] - commands[i][0] + 1;
			int[] array2 = new int[len];
			int m = commands[i][0] -1;
			for(int j=0; j<len; j++) {
				array2[j] = array[m++];
			}
			Arrays.sort(array2);
			answer[i] = array2[commands[i][2]-1];
		}
        return answer;
        
    }
}