import java.util.*;

class Solution {
    public int solution(int[] array, int n) {
        int answer = 0;
        int neer;
        Arrays.sort(array);
        neer = Math.abs(n-array[0]);

       
        int index=0;
		for(int i=1; i<array.length; i++) {		
			if(neer > Math.abs(n-array[i])) {
				index = i;
                neer = Math.abs(n-array[i]);
			}          
		} 
        answer = array[index];
        return answer;
    }
}