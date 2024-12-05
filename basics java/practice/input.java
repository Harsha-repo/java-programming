

import java.util.Scanner;  // this is compulsory when u are inputing using scanner
// scanner is the class inbuit which helps to input the user values
public class input {
    public static void main(String[] args) {
        
    
    
Scanner sc  = new Scanner(System.in);

System.out.println(" enter a number ;");
int n=sc.nextInt();
System.out.println("enter a string '");
String  s = sc.next();
System.out.println("enter a character ;");
char c = sc.next().charAt(0);
System.out.println("the number is "+n+",the string is :"+s+",the character is :"+c);

}
}
