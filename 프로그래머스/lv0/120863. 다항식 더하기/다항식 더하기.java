import java.util.*;
class Solution {
    public String solution(String polynomial) {
        String answer = "";
        
        StringTokenizer tk = new StringTokenizer(polynomial, " + ");
		List<String> list = new ArrayList<String>();
		List<String> xList = new ArrayList<String>();
		int sum=0, xSum=0;
		
		while(tk.hasMoreTokens()) {
			String s = tk.nextToken();
			if(s.indexOf("x")!=-1) {
				xList.add(s);
			} else
				list.add(s);
		}
		
		for(String s : list) {
			sum += Integer.parseInt(s);
		}
		for(String s : xList) {
			if(s.length() == 1)
				xSum+=1;
			else{  
				xSum+= Integer.parseInt(s.substring(0,s.indexOf("x")));
            }
		}
		
        return sum==0 ? (xSum==1 ? "x" : xSum+"x"): (xSum==0 ? sum+"" : (xSum==1 ? "x" + " + " + sum:xSum+"x" + " + " + sum)) ;
    }
}