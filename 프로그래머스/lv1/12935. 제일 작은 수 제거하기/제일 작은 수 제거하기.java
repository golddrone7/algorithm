class Solution {
    public int[] solution(int[] arr) {
        int[] answer = arr.length > 1 ? new int[arr.length-1] : new int[1];
		
		if(answer.length==1){
			answer[0] = -1;
            return answer;
        }
		
		int min =arr[0];
		int index=0;
		for(int i=1; i<arr.length; i++) {
			if(min>arr[i]) {
				min = arr[i];
				index = i;
			}
		}
		int to=0;
		for(int i=0; i<arr.length; i++) {
			if(i==index)
				continue;
			answer[to++] = arr[i];
		}
		
        return answer;
    }
}