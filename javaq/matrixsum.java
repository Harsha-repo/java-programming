import java.util.*;
public class matrixsum {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the matrix:");
        int n = sc.nextInt();
        // for a square matrix no.of rows = no.of columns
        int a[][] = new int[n][n]; 
        int b[][] = new int[n][n];

        //taking input to the arrays 
        System.out.println("enter the elements to the matrix A:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println("enter the elements to the matrix A:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                b[i][j]=sc.nextInt();
            }
        }
        System.out.println("the matrix A:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("  "+a[i][j]);
            }
            System.out.println("\n");
        }
        System.out.println("the matrix b:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("  "+ b[i][j]);
            }
            System.out.println("\n");
        }

        // sum of matrix
        System.out.println("the sum matrix is :");
        int sum[][] = new int[n][n];

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                sum[i][j]=a[i][j]+b[i][j];
                System.out.print("  "+sum[i][j]);
            }
            System.out.println("\n");
        }
        
    }
    
}
