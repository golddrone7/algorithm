class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        int[] answer = new int[photo.length];
        
        for(int i=0; i<photo.length; i++){
            for(int j=0; j<photo[i].length; j++){
                // 현재 photo i, j의 name값에 포함이 되는지를 확인한다.
                // name의 index를 포함한다,
                int index = -1;
                for(int k=0; k<name.length; k++){
                    if(photo[i][j].equals(name[k])){
                        index = k;
                        break;
                    }
                }
                if(index == -1) continue;
                
                answer[i] += yearning[index];
                
            }
        }
        
        
        
        return answer;
    }
}