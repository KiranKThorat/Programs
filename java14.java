// 14. Find factorial for given no Program in Java

import java.util.Scanner;

public class java14 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int fact=1;
        System.out.println("enter number");
        int num=sc.nextInt();
        if (num < 0){
            System.out.println("enter non-neagative value");
        }
        else if(num == 0){
            System.out.println("factorial of "+num+ " is 0");

        }
        else{
            for(int i=1;i<=num;i++){
                fact = fact * i;
            }
            System.out.println("factorial of "+num+ " is "+fact);
        }

    }
}
