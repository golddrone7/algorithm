import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String answer = "";
		try {
			String s = br.readLine();
			s = s.replaceAll("XXXX", "AAAA");
			s = s.replaceAll("XX", "BB");
			if(s.contains("X")) {
				s = "-1";
			}
			System.out.println(s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
