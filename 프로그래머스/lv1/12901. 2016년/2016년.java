class Solution {
    public String solution(int a, int b) {
        String[] weekday = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};
		int[] day = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int c = 5;
        
        for(int i=0; i<a-1; i++) {
			c+=day[i];
		}
        c+=b-1;
        
        return weekday[c%7];
    }
}