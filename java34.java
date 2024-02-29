import java.util.Scanner;

public class java34 {
   public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        System.out.println("enter numbder of colunm in matrix");
        int m=sc.nextInt();
        System.out.println("enter numbder of rows in matrix");
        int n=sc.nextInt();
        int[][] mat1=new int[m][n];
        int[][] transpose=new int[m][n];


        System.out.println("enter matrix mat1");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                transpose[j][i]=mat1[i][j];
            }
        }
        System.out.println("transpose matrix is");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(transpose[i][j] + "\t");
            }
        }
   } 
}
