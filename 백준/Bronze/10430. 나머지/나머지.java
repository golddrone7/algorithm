import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			String nums[] = br.readLine().split(" ");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			int c = Integer.parseInt(nums[2]);
			
			System.out.println((a+b)%c);
			System.out.println(((a%c)+(b%c))%c);
			System.out.println((a*b)%c);
			System.out.println(((a%c)*(b%c))%c);	
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
