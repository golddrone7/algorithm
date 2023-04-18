import java.io.*;

public class Main{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
			String nums[]=br.readLine().split(" ");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			System.out.println(a+b);
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}