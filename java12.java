// 12. Nested If Else clause in java
import java.util.Scanner;

public class java12 {
    public static void main (String args[]){
       int passing_marks= 40;
       char grade;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter your marks");
    int Marks_obtained=sc.nextInt();
   
    if(Marks_obtained > 90){
        grade ='A';
        System.out.println("you got "+grade);
    }
    else if(Marks_obtained > 75){
        grade ='B';
        System.out.println("you got "+grade);
       
    }
    else if(Marks_obtained > 60){
        grade='C';
        System.out.println("you got "+grade);
    }
    else{
        grade ='D';
        System.out.println("you got "+grade);
    }
   }
}
