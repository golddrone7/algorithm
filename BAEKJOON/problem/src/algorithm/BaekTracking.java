package algorithm;

import java.util.Arrays;
import java.util.Scanner;

public class BaekTracking {

	 static int N;
	    static int[][] map;
	    static int[] visited;

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        //1. 변수 선언 및 초기화
	        N = sc.nextInt();
	        map = new int[N][N];
	        visited = new int[N];
	        int row=0;

	        //2. 재귀함수 호출
	        locate(row);

	    }
	    private static void locate(int row) {
	        //3. 탈출 조건
	        if(row==N) {
	            printResult();
	            return;
	        }else {
	            //4. 경로 탐색
	            for(int col=0;col<N;col++) {
	                if(visited[col]!=1) {
	                    //4.1 값 바꾸기
	                    map[row][col]=1;
	                    visited[col]=1;
	                    row=row+1;
	                    //4.2 재귀호출
	                    locate(row);
	                    //4.3 값 원복
	                    row=row-1;
	                    visited[col]=0;
	                    map[row][col]=0;
	                }
	            }
	        }
	        return;
	    }

	    private static void printResult() {
	        for(int i=0;i<N;i++) {
	            System.out.println(Arrays.toString(map[i]));
	        }
	        System.out.println("---------------");
	    }
}
