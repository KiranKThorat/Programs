// 25. Print Multiplication table Program in java
import java.util.Scanner;
public class java25 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to print table");
        int num=sc.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(i+" * "+num+" = "+num*i);
        }
    }
}
