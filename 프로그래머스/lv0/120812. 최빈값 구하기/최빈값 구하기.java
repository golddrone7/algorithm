import java.util.*;

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        Arrays.sort(array);
        int[] temp = new int[array[array.length-1]+1];		
		for(int i=0; i<array.length; i++) {
			temp[array[i]]++;
		}
     	int max = temp[0];
		int maxNum = 0;

        for(int i=1; i<temp.length; i++) {
			if(max<temp[i]) {
				maxNum = i;
				max = temp[i];
			}
		}

		Arrays.sort(temp);

		if(temp[temp.length-1]==temp[temp.length-2])
			answer = -1;
		else
			answer =maxNum;
        return answer;
    }
}