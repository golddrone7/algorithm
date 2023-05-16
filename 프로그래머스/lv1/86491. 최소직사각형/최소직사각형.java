class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int maxWidth, maxHeight;
		for(int i=0; i<sizes.length; i++) {
			if(sizes[i][0]<sizes[i][1]) {
				int tmp = sizes[i][1];
				sizes[i][1] = sizes[i][0];
				sizes[i][0] = tmp;
			}
		}
		maxWidth = sizes[0][0];
		maxHeight = sizes[0][1];
		
		for(int i=1; i<sizes.length; i++) {
			for(int j=0; j<sizes[i].length; j++) {
				if(maxWidth<sizes[i][0]) {
					maxWidth = sizes[i][0];
				}
				if(maxHeight<sizes[i][1]) {
					maxHeight = sizes[i][1];
				}
			}
		}
        answer = maxWidth*maxHeight;
        return answer;
    }
}