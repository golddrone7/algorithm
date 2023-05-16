class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++) {
			if(s.charAt(i)==' ') {
				answer += " ";
			}else {	
				if(65<=s.charAt(i)&&s.charAt(i)<=90) {
					if(s.charAt(i)+n>90)
						answer += (char)((s.charAt(i) + n)%91+65);
					else
						answer += (char)(s.charAt(i) + n);
				}
				else {
					if(s.charAt(i)+n>122)
						answer += (char)((s.charAt(i) + n)%123+97);
					else
						answer += (char)(s.charAt(i) + n);
				}
			}		//122 + 4 = 126 > 
		}		
        
        return answer;
    }
}