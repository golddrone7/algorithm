class Solution {
    public int[] solution(int n, int[] numlist) {
        int[] answer= new int[100];
        int top = 0;
        for(int i=0; i<numlist.length; i++) {
			if(numlist[i]%n==0) {
				answer[top++] = numlist[i];
			}
		}
        int[] correct = new int[top];
		
		for(int i=0; i<correct.length; i++) {
			correct[i] = answer[i];
		}
        
        return correct;
    }
}