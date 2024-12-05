import java.util.Scanner;
public class stringread {
    public static void main(String[] args) {
        System.out.println("enter the size of the array :");
        Scanner input = new Scanner(System.in);
      
        int n = input.nextInt();
    String array[]=new String[n];

     System.out.println("enter the charaters or strings for your enterd size");
     for(int i=0;i<n;i++){

            array[i] = input.next();
        }

       

        for(int i=0;i<n;i++){

            System.out.print(array[i]);
        }


    }
    
}
