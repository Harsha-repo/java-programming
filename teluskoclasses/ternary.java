public class ternary {
    public static void main(String a[]){

        int x = 2;
        int result = 0;
        //check whether the number is even if yes print Even

        result = x%2==0 ? 4 : 3;

      System.out.println(result); // since the condtion is true it prints the value next to ? mark


    }
    
}
/* ternary operator is to check the condition without if else 
 * that is helps only in certain conditions 
 * its syntax is " ?: ;"
 * ? --> checks the condition , if true then the statement next to the ? mark gets printed 
 * : --> if condition id wrong then the statement next to the colon is printed 
 * last semicolon is compulsory
 */