import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> nums = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        while (true){
            int num = Integer.parseInt(sc.nextLine());
            if(num==0) break;
            nums.add(num);
            for (int i = 0; i < num; i++) {
                list.add(sc.nextLine());
            }
        }


        int m = 0;

        for (int k=0; k<nums.size(); k++) {
            boolean isFlag = false;
            System.out.println("Group " + (k+1));
            for (int i=m; i<nums.get(k)+m; i++) {
                String s = list.get(i);
              
                if(s.contains("N")){    // 해당하는 i에 N이 있으면 실행한다
                    String[] temp = s.split(" ");
                    for (int j = 1; j < temp.length; j++) {
                        if(temp[j].equals("N")){
                            System.out.println(list.get( ( (nums.get(k)+(i-m)-j)%nums.get(k)) + m).split(" ")[0]+" was nasty about "+temp[0]);
                            isFlag = true;
                        }
                    }
                }
            }
            if(!isFlag) System.out.println("Nobody was nasty");
            System.out.println();
            m+=nums.get(k);
        }
    }
}
