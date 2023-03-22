package algorithm;

public class Muji {

	public static void main(String[] args) {
		int[] food_times = {3,1,2};
		long k = 5;
		int answer = 0;
		int p=-1;
		int cnt=0, tot=0;

		for(int i=0; i<food_times.length; i++) {
			tot+=food_times[i];
		}
		
		if(k>=tot) {
			System.out.println("-1");
			System.exit(0);
		}
		
		
		while(true) {
			p++;
			if(p>=food_times.length) p=0;
			if(food_times[p]==0) continue;
			food_times[p]--;
			cnt++;
			if(cnt==k) break;
		}
		
		while(true) {
			p++;
			if(p>=food_times.length) p=0;
			if(food_times[p]!=0) break;
		}
		
		System.out.println(++p);
		
		
	}

}
