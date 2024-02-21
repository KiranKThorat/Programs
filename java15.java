// 15. How to complete 2 string in Java program
import java.util.Scanner;
public class java15 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first string");
        String S1 =sc.nextLine();
        System.out.println("enter Second string");
        String S2 =sc.nextLine();
        int result = S1.compareTo(S2);
        if(result > 0 ){
            System.out.println(S1+" is lexicographically greater than "+S2);
        }
        else if(result < 0 ){
            System.out.println(S2+" is lexicographically greater than "+S1);

        }
        else{
            System.out.println("both strings are same ");

        }

    }
}
