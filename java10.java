// 10. If Else clause in java with leap year
import java.util.Scanner;

public class java10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter yearo");
        int year = sc.nextInt();
        if ((year % 4 == 0 && year % 100 != 0) || (year % 100 == 0)) {
            System.out.println(year + " is a leap year");
        } else {
            System.out.println(year + " is a not a leap year");

        }
    }
}
