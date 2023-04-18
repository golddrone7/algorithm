import java.util.*;
import java.io.*;
public class Main{
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n=0;
		try {
			n = Integer.parseInt(br.readLine());
			double arr[] = new double[n];
			StringTokenizer st = new StringTokenizer(br.readLine(), " ");
			for(int i=0; i<n; i++) {
				arr[i] = Double.parseDouble(st.nextToken());
			}
			Arrays.sort(arr);
			
			double sum = 0;
			double avg = 0;
			for(int i=0; i<n; i++) {
				sum += arr[i]/arr[n-1]*100;
			}
			avg = sum/n;
			System.out.println(avg);
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}          
    }
}