import java.util.Scanner;
// 13. How to check Odd and Even Number in java.
public class java13 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        if(num % 2 == 0){
            System.out.println(num+" is even");
        }
        else{
            System.out.println(num+" is odd");

        }
    }
}
