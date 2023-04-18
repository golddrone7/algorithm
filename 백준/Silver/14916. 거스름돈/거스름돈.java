import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int count = 0;
		// 15원일땐 5원 3개
		// 14원일땐 5원 2개 2원 2개
		// 13원일때 5원 2개를 먼저 했는데 안나눠진다? 그러면 5원 1개
		
		if(a>=5 && a%5==0) {
			count += a / 5;
			a = a%5;
		} else if(a>=5 &&(a%5)%2!=0){
			count += (a-5) /5;
			a = a%5;
			a+=5;
			count += a/2;
			a = a%2;		
		}else if(a>=5 &&(a%5)%2==0){
			count += a/5;
			a = a%5;
			count += a/2;
			a = a%2;
		} else if(a<5 && a%2==0){
			count += a/2;
			a = a%2;
		} else {
			count = -1;
		}
		System.out.println(count);
	}
}
