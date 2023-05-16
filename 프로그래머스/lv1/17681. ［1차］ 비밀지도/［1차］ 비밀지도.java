class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[n];
        String sArr1[] = new String[n];
		String sArr2[] = new String[n];
			
        for(int i=0; i<sArr1.length; i++) {
			sArr1[i]="";
			sArr2[i]="";
            answer[i]="";
		}
		
		
		for(int i=0; i<n; i++) {
			int k = (int)Math.pow(2, n-1);
			while(k!=0) {
				if(arr1[i] / k > 0)
					sArr1[i] += "#";
				else
					sArr1[i] += " ";
				arr1[i]%=k;
				
				if(arr2[i] / k > 0)
					sArr2[i] += "#";
				else
					sArr2[i] += " ";
				arr2[i]%=k;
				
				k/=2;
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(sArr1[i].substring(j,j+1).equals("#") || sArr2[i].substring(j,j+1).equals("#"))
					answer[i]+="#";
				else
					answer[i]+=" ";
			}
		}
		
        
        return answer;
    }
}