// to find the largest difference of elements in an array
import java.util.*;

public class difference {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array:");
        int n = sc.nextInt();
        int a1[]=new int[n];


        System.out.println("enter elements int array;");
        for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }

        System.out.println("the array is ");
        for(int i=0;i<a1.length;i++){
            System.out.print(a1[i]+" ");

        }
        System.out.println("\n");
         int diff[]=new int[50],len=0;
        for(int i=0;i<a1.length;i++){

            for( int j=0;j<a1.length;j++){
              // System.out.print(a1[i]-a1[j]+" ");
              diff[j]=a1[i]-a1[j];
              len++;
              
              System.out.print(diff[j]+" ");

            }
        
        }
    System.out.println("\n");
    System.out.println(len);
   
    

        }
    }



