package algorithm;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Injup63 {
	static int map[][] = new int[50][50];
	public static void main(String[] args) throws IOException {
		// 정점, 간선
		// 정점의 갯수, 간선의 갯수 5, 6
		// 무방향 그래프는 정점간에 이동 가능함
		// 행번호와 열번호가 정점 대응이 됨 1:1
		
		//행 출발정점, 열 도착정점
		//정점이 가중치가 있을 때, 가중치 방향 그래프
		
		// 1 2 3 을 읽는다고 한다면
		// map[a][b] = c; for문 6번 돌면서 함
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int vertex= Integer.parseInt(input[0]);
		int length = Integer.parseInt(input[1]);
		
		for(int i=1; i<=length; i++) {
			String[] graph= br.readLine().split(" ");
			int start = Integer.parseInt(graph[0]);
			int end = Integer.parseInt(graph[1]);
			int power = Integer.parseInt(graph[2]);
			map[start][end] = power;
		}
		
		for(int i=1; i<=vertex; i++) {
			for(int j=1; j<=vertex; j++) {
				System.out.print(map[i][j]+" ");
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
