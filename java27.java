// 27. Check no is Armstrong or not in java
import java.util.Scanner;
public class java27 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter number");
        int num=sc.nextInt();
        int t1=num;
        int length=0;
        while (t1 !=0) {
           length = length+1;
            t1=t1/10;
        }
            int t2=num;
            int arm=0;
            int rem;
            while (t2!=0) {
                int mul=1;
                rem=t2%10;
                for(int i=1;i<=length;i++){
                    mul=mul*rem;
                }
                arm=arm+mul;
                t2=t2/10;
            }
            if(arm==num){
                System.out.println(num+" is armstronng number");
            }
            else{
                System.out.println(num+" is not a armstronng number");

            }
    }
}
