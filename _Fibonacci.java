import java.util.Scanner;

public class _Fibonacci {
      public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int a=0,b=1;
        System.out.println("enter term ");
        int term =sc.nextInt();
        System.out.println("printing fibonacci series");

        for(int i=0;i<=term;i++){
            System.out.println(+a+" ");
            int c = a+b;
            a=b;
            b=c;
        } 

            

        }

    
    }

