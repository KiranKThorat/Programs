import java.util.*;

public class java5 {
    public static void main(String[] args) {
        
    
    Scanner sc=new Scanner(System.in);
    System.out.println("enter temperature in degree");
    int celcius = sc.nextInt();
    int farenheit = ( celcius * 9/5) + 32;
    System.out.println("temperatuer in farenheit is "+farenheit);
}
}
