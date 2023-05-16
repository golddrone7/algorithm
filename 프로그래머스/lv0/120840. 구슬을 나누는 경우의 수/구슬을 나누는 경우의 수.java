class Solution {
    public double solution(int balls, int share) {
        double temp=1;
		for(int i=0; i<share; i++) {
			temp*=(balls-i)/(double)(share-i);
		}
        temp = Math.round(temp);
        return temp;
    }
}