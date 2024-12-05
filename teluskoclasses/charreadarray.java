import java.util.Scanner;
public class charreadarray {

    public static void main(String[] args) {
        System.out.println("enter the size of the array :");
        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt();
        char array[] = new char[n];

        System.out.println("enter the charaters for your enterd size");
        for (int i = 0; i < n; i++) {
       // System.out.println(array[i]);
            array[i] = sc.next().charAt(0);
        }
         for (int j = 0; j < n; j++) {
       System.out.print(array[j]);
            
        }
System.out.println("\n");
        System.out.println("the reverse order is :");
        
        for(int k = n-1;k>=0;k--){
            System.out.print(array[k]);
        }

    }
    
    }
