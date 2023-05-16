import java.util.*;
class Solution {
    public long solution(long n) {
        ArrayList<Long> list = new ArrayList<>();	
		while(n!=0) {
			list.add(n%10);
			n/=10;
		}
		long[] lNum = new long[list.size()];
		
		for(int i=0; i<lNum.length; i++) {
			lNum[i] = list.get(i);
		}
		Arrays.sort(lNum);
		String str="";
		for(int i=lNum.length-1; i>=0; i--) {
			str += lNum[i];
		}
        return Long.parseLong(str);
    }
}