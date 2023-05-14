class Solution {
    public int solution(int[][] lines) {
        int min = lines[0][0];
		int max = lines[0][0];
		int result=0;
		for(int i=0; i<lines.length; i++) {
			for(int j=0; j<lines[i].length; j++) {
				if(min > lines[i][j]) {
					min = lines[i][j];
				}
				if(max < lines[i][j]) {
					max = lines[i][j];
				}
			}
		}		
		for(int i=min; i<=max; i++) {
			int cnt=0;
			
			
			for(int j=0; j<lines.length; j++) {
				for(int k=lines[j][0]; k<lines[j][1]; k++) {
					if(i==k) cnt++;
				}
			}
			if(cnt>=2) {
				result++;
			}
		}
        return result;
    }
}