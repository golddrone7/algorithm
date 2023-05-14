class Solution {
    public int[] solution(int[] numbers, String direction) {
        int[] answer = new int[numbers.length];
        
        if(direction.equals("right")){
      	for(int i=0; i<numbers.length; i++) {	//right
			if(i==0)
				answer[i] = numbers[numbers.length-1];	// 3
			else
				answer[i] = numbers[i-1];
		}
        }
        if(direction.equals("left")){
            for(int i=0; i<numbers.length; i++) {	//left
			if(i==0)
				answer[numbers.length-1] = numbers[0];	
			else
				answer[i-1] = numbers[i];
		}
            
        }
        
            
        
        return answer;
    }
}