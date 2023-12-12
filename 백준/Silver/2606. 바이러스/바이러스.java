import java.util.Scanner;

public class Main {
    static int n, m, result = 0;
    static boolean[][] map = new boolean[1001][1001];
    static boolean[] isVisited = new boolean[1001];
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        m = Integer.parseInt(sc.nextLine());

        for (int i = 1; i <= m ; i++) {
            String[] temp = sc.nextLine().split(" ");
            map[Integer.parseInt(temp[0])][Integer.parseInt(temp[1])] = true;
            map[Integer.parseInt(temp[1])][Integer.parseInt(temp[0])] = true;
        }
        isVisited[1] = true;
        dfs(1);

        System.out.println(result);
    }

    public static void dfs(int v){

        for (int i = 1; i <= n; i++) {

            if(map[v][i] && !isVisited[i]){
                result++;
                isVisited[i] = true;
                dfs(i);
            }
        }
    }
}
