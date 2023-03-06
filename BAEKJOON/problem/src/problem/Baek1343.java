package problem;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Baek1343 {

	public static void main(String[] args) {
		String result = "";
		String answer;
		String temp = "";
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = br.readLine();		
			for(int i=0; i<answer.length(); i++) {
				
				if(answer.charAt(i)=='.') {
					if(temp.length()==2) {
						result += "BB";
						temp = "";
					} else if(temp.length()%2==1) {
						result = "-1";
						break;
					}
					result+=".";
					continue;
				}
				
				temp += answer.charAt(i);
				if(temp.length()==4) {
					result += "AAAA";
					temp = "";
				} 
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		if(temp.length()==2) {
			result += "BB";
		} else if(temp.length()%2==1) {
			result = "-1";
		}
		System.out.println(result);
	}
}
