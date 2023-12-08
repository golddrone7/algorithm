import java.util.*;


public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        String input = sc.nextLine();
        String[] answers = input.split(" ");

        String a = answers[0];
        int p = Integer.parseInt(answers[1]);

        list.add(Integer.parseInt(a));

        int k = 0;
        while (true) {
            int n = 0;
            String asd = String.valueOf(list.get(k));
            for (int i = 0; i < asd.length(); i++) {
                int temp = 1;
                for (int j = 0; j < p; j++) {
                    temp *= Integer.parseInt(asd.substring(i, i+1));
                }
                n += temp;
            }
           // System.out.println(list.toString());
            if (list.contains(n)){
                int i = list.indexOf(n);
                while (i<list.size()) {
                    list.remove(i);
               //     System.out.println(list.toString());
                }
                break;
            } else {
                list.add(n);
                k++;
            }
        }

        System.out.println(list.size());

    }
}
