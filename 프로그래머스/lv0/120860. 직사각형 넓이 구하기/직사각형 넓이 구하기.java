class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        int width=0, height=0;
        for(int i=0; i<dots.length; i++) {
			for(int j=0; j<dots[i].length; j++) {
				if(dots[0][0] == dots[i][0] )
					width = Math.abs(dots[0][1] - dots[i][1]);
				if(dots[0][1] == dots[i][1])
					height = Math.abs((dots[0][0] - dots[i][0]));
			}
		}
        answer = width*height;
        return answer;
    }
}