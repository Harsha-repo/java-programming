
import java.util.Scanner;

public class reversenumberarjun {


    

    
    public static void main(String[] args) {
        
        System.out.println("enter a number :"); 
        Scanner sc = new Scanner(System.in);// creating a input varible using Scanner module
        String n = sc.next(); // inputing a string from the user 
        String reverse=""; // taking an empty string that holds no string 
        System.out.println("the reverse number is :");
        for(int i=0;i<n.length();i++){
            reverse = n.charAt(i) + reverse;

        }
        System.out.println(reverse);
    }
}
