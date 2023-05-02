import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<String> board = new ArrayList<>();
        String[] test = br.readLine().split(" ");
        int N = Integer.parseInt(test[0]);
        int M = Integer.parseInt(test[1]);
        // 첫번째가 B일 경우 cnt, W일경우 cnt 2번 세야함
        int min = 2100000000;
        for (int i = 0; i < N; i++) {
            board.add(br.readLine());
        }
        // WBWBWBWB

        for (int i = 0; i <= N-8; i++) {
            for (int j = 0; j <= M-8; j++) {

                for (int m=0; m<2; m++){
                    boolean flag;
                    int cnt = 0;
                    if(m==0){
                        flag=true;   // W로 시작할 경우
                    } else{
                        flag=false;    // B로 시작할 경우
                    }
                    for (int k = i; k < i + 8; k++) {
                        String str = board.get(k);

                        for (int l = j; l < j + 8; l++) {
                            if(flag) {
                                if((k-i)%2==0) {
                                    if (str.charAt(l) == 'B' && (l - j) % 2 == 0) {
                                        cnt++;
                                    } else if (str.charAt(l) == 'W' && (l - j) % 2 == 1) {
                                        cnt++;
                                    }
                                } else{
                                    if (str.charAt(l) == 'W' && (l - j) % 2 == 0) {
                                        cnt++;
                                    } else if (str.charAt(l) == 'B' && (l - j) % 2 == 1) {
                                        cnt++;
                                    }
                                }
                            }
                            else{
                                if((k-i)%2==0) {
                                    if (str.charAt(l) == 'W' && (l - j) % 2 == 0) {
                                        cnt++;

                                    } else if (str.charAt(l) == 'B' && (l - j) % 2 == 1) {
                                        cnt++;

                                    }
                                } else{
                                    if (str.charAt(l) == 'B' && (l - j) % 2 == 0) {
                                        cnt++;

                                    } else if (str.charAt(l) == 'W' && (l - j) % 2 == 1) {
                                        cnt++;

                                    }
                                }
                            }

                        }
                    }
                    if(min>cnt) min = cnt;
                }


            }
        }
        System.out.println(min);
    }
}