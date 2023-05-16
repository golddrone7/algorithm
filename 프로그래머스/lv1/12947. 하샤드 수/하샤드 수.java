class Solution {
    public boolean solution(int x) {
        int num=x;
		int temp=0;
		while(num!=0) {
			temp+=num%10;
			num/=10;
		}
        return x%temp==0;
    }
}