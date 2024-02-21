// 9.Find Largest no in java Program
import java.util.*;
public class java9 {
   public static void main (String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("enter 1st no");
    int a=sc.nextInt();
    System.out.println("enter 2st no");
    int b=sc.nextInt();
    System.out.println("enter 3st no");
    int c=sc.nextInt();

    if(a>b && a>c){
        System.out.println(a+" is largest number");
    }
    else if(b>a && b>c){
        System.out.println(b+" is largest number");
    }
    else{
        System.out.println(c+" is largest number");

    }
   }
}
