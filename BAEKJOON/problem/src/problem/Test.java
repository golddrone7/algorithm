package problem;

import java.util.ArrayList;
import java.util.Arrays;

public class Test {

	public static void main(String[] args) {
	
		int[] arr = {0,1,2,3,4,5};
		int[] ints1 = Arrays.copyOf(arr, arr.length);
		int[] ints2 = Arrays.copyOf(arr, 3);
		int[] ints3 = Arrays.copyOf(arr, 8);
		int[] ints4 = Arrays.copyOfRange(arr, 1, 5);
		int[] ints5 = Arrays.copyOfRange(arr, 5, 8);
		
		
		for(int i:ints3) {
			System.out.println(i);
		}
		
		
//		ArrayList<Integer> array = new ArrayList<>();
//		array.add(1);
//		array.add(2);
//		System.out.println(array.get(0));
//		
//		
		
//		System.out.println(Character.isDigit('l')); // 문자 정수형 판단

	}
}
