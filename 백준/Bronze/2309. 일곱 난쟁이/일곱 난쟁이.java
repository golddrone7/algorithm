import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < 9; i++) {
            int num = sc.nextInt();
            sum+=num;
            list.add(num);
        }

        list = (ArrayList<Integer>) list.stream().sorted()
                .collect(Collectors.toList());


        outer:for(int i=0; i<9; i++){
            for(int j=0; j<9; j++){
                if(i==j) continue;
                if(sum-list.get(i)-list.get(j)==100){
                    list.remove(i);
                    list.remove(j-1);
                    break outer;
                }
            }
        }

        for (Integer i : list) {
            System.out.println(i);
        }
    }
}
