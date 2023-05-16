class Solution {
    public int[] solution(int n, int m) {
        int[] answer = new int[2];
        
        int r=0, a=n,b=m;
        if(a>b){
            int tmp = a;
            a = b;
            b = tmp;
        }    
		while(a%b!=0) {
			r = a%b;
			a = b;
			b = r;
		}
        
        answer[0] = r;
        answer[1] = (n*m)/answer[0];
        
        return answer;
    }
}