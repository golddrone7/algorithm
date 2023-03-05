package problem;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Baek2164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		List<Integer> card = new LinkedList<>();
		
		for(int i=1; i<=num; i++) {
			card.add(i);
		}
		
		while(card.size()!=1) {
			card.remove(0);
			int temp = card.get(0);
			card.remove(0);
			card.add(temp);
		}
		System.out.println(card.get(0));
	}
}