import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] test = br.readLine().split(" ");
        int year = Integer.parseInt(test[0]);
        int month = Integer.parseInt(test[1]);
        int day = Integer.parseInt(test[2]);
        LocalDate a = LocalDate.of(year, month, day);
        test = br.readLine().split(" ");
        year = Integer.parseInt(test[0]);
        month = Integer.parseInt(test[1]);
        day = Integer.parseInt(test[2]);
        LocalDate b = LocalDate.of(year, month, day);
        if(ChronoUnit.YEARS.between(a, b)>=1000) System.out.println("gg");
        else System.out.println("D-"+ChronoUnit.DAYS.between(a, b));
    }
}