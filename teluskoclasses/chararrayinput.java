import java.util.Scanner;
public class chararrayinput {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array size:");
        int n=sc.nextInt();
        char a []=new char[n];
        char rev[]=new char[n];


        System.out.println("enter the characters into the array:");
        for(int i=0;i<a.length;i++){

            a[i]=sc.next().charAt(0);

        }
         
        System.out.println("entered characters are :");
        for(int i=0;i<a.length;i++){

            System.out.print(a[i]);
        }

        System.out.println("\nreverse of the array is :\n");
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]);
            
        }




        
    }
    
}
