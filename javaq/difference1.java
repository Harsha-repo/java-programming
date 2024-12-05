// to find the largest difference between the elements of the array, after sortig them using bubble sort
import java.util.*;

public class difference1 {

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
    // lets sort out elements using bubble sort
    int temp=0;
    for(int i=0;i<a1.length;i++){
        for(int j=0;j<a1.length-1;j++){

        
        if(a1[j]>a1[j+1]){
             temp=a1[j];
            a1[j]=a1[j+1];
            a1[j+1]=temp;
        }
    }
}
System.out.println("\n");
    for(int i=0;i<a1.length;i++){
        System.out.println(a1[i]);

    }
// find the max difference
System.out.println("the maximum element difference ");
int res =a1[a1.length-1]-a1[0];
System.out.println(res);
}
}