import java.util.StringTokenizer;
class Solution {
    public String solution(String s) {
        String answer = "";
        String[] arr = s.split(" ");
		
         if(s.substring(s.length() - 1, s.length()).equals(" ")) {
            arr[arr.length-1] += " ";
           }
		for(int i=0; i<arr.length; i++) {      
			for(int j=0; j<arr[i].length(); j++) {           
				if(j==0) {
					answer += arr[i].substring(0, 1).toUpperCase();
				}  else {
					answer += arr[i].substring(j, j+1).toLowerCase();
				}
			}
    
		     if(i+1<arr.length)
			    answer += " ";
		}
        return answer;
    }
}