import java.util.Scanner;

public class java32 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter numbder of colunm in matrix");
        int m=sc.nextInt();
        System.out.println("enter numbder of rows in matrix");
        int n=sc.nextInt();
        int[][] mat1=new int[m][n];
        int[][] mat2=new int[m][n];
        int[][] mat3=new int[m][n];
        
        System.out.println("enter first matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter second matrix");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                mat3[i][j]=mat1[i][j] / mat2[i][j]; //replace with "*  -   +  / " for other operations
            }
        }
        System.out.println("addition of two matrix is");
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.println(mat3[i][j] + "\t");
            }
        }
       
    }
}
