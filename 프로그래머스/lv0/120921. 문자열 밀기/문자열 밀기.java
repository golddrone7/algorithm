class Solution {
    public int solution(String A, String B) {
        int count=0;
        if(A.equals(B)) {
				return 0;
		}
		while(true) {
			A = A.substring(A.length()-1, A.length())+A.substring(0, A.length()-1);
			count++;
            if(B.equals(A)) {
				return count;
			}			
			
			if(count>100)
				break;
		}
        return -1;
    }
}