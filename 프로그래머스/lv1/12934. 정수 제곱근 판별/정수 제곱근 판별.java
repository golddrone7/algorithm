class Solution {
    public long solution(long n) {    
        if(Math.sqrt(n)%1>0)
			return -1;
        return (long)Math.pow(Math.sqrt(n)+1, 2);
    }
}