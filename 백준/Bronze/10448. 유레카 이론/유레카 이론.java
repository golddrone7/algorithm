

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Integer> uList = new ArrayList<>();
        ArrayList<Integer> result= new ArrayList<>();
        int sum = 0;
        int testcase = sc.nextInt();
        for (int i = 0; i < testcase; i++) {
            int num = sc.nextInt();
            list.add(num);
        }

        for (int i = 1; i < 1000; i++) {
            if(i*(i+1)/2>1000) break;
            uList.add(i*(i+1)/2);
        }

        for (Integer i : list) {
            boolean flag= false;

            outer:for(int j=0; j<uList.size(); j++){
                for(int k=0; k<uList.size(); k++){
                    for(int m=0; m<uList.size(); m++){
                       if(uList.get(j)+uList.get(k)+uList.get(m)==i){
                            flag = true;
                            break outer;
                        }
                    }
                }
            }
            if(flag){
                result.add(1);
            } else {
                result.add(0);
            }
        }

        for (Integer integer : result) {
            System.out.println(integer);
        }
    }
}
