class Solution {
    public int solution(int slice, int n) {
        int pizza=1; // slice : 피자 한판당 조각 수, n : 먹는 사람 수
            //최소 한조각씩 먹어야됌.
        while(true){
         if(slice*pizza/n < 1)
             pizza++;
          else 
                break;
             
            
            
        }
        return pizza;
    }
}