class Solution {
    public boolean solution(String s) {
        boolean answer = true;
        if(!(s.length()==4 || s.length() ==6))
			return false;
			
		for(int i=0; i<s.length(); i++) {
			char tmp = s.charAt(i);
			if(!(48<=tmp && tmp<=57))
                return false;
		}
        
        return answer;
    }
}