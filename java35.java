import java.util.Scanner;

public class java35 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the 1st string");
        String String1=sc.nextLine();
        System.out.println("enter the 2nd string");
        String String2=sc.nextLine();
        int result = String1.compareTo(String2);
        if(result == 0){
            System.out.println("strings are equal");
        }
        else{
            System.out.println("not equal");
        }
    }
}
