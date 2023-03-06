package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class Baek1620 {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String[] answer = br.readLine().split(" ");
			int num = Integer.parseInt(answer[0]);
			int result = Integer.parseInt(answer[1]);
			
			Map<Integer, String> dogam = new HashMap<>();
			Map<String, Integer> dogam2 = new HashMap<>();
			String[] results = new String[result];
			
			
			for(int i=1; i<=num; i++) {
				String s = br.readLine();
				dogam.put(i, s);
				dogam2.put(s, i);
			}
			
			
			for(int i=0; i<result; i++) {
				results[i] = br.readLine();
			}
			
			for(int i=0; i<result; i++) {
				try {
					int index = Integer.parseInt(results[i]);
					System.out.println(dogam.get(index));
				} catch(NumberFormatException e){
					System.out.println(dogam2.get(results[i]));
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("hello");
	}
}
