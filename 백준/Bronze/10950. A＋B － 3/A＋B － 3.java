import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        System.out.println((int)'Z'); // 65     90
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < T; i++) {
            String[] arr = sc.nextLine().split(" ");
            int a =Integer.parseInt(arr[0]);
            int b =Integer.parseInt(arr[1]);
            list.add(a+b);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}