class Solution {
    // DFS 문제, 같은 네트워크 상의 갯수를 구해야함
    static boolean[] isVisited = new boolean[10001];
    public int solution(int n, int[][] computers) {
        int answer = 0;
        for(int i=0; i<n; i++){
            if(!isVisited[i] ){
                answer += dfs(i, computers);
            }
        }
        return answer;
    }
    
    public static int dfs(int L, int[][] computers){
        // if(isVisited[L]) return 0;
        for(int i = 0; i< computers[L].length; i++){
            if(!isVisited[i] && computers[L][i] == 1 ){
               // System.out.println(i);
                isVisited[L] = true;        
                dfs(i, computers);
            }
        }
        return 1;
    }
}