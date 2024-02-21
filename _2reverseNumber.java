import java.util.*;
public class _2reverseNumber {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number to reverse");
        int n =sc.nextInt();

    while(n>=1){
       int r = n%10;
       n = n/10;
       System.out.print(r);
    }

}
}
