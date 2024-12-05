public class switchstatements
 {
    public static void main(String a[]){

int n = 6;
switch (n) {
    case 1:
        System.out.println("monday");
        break;

    case 2:
        System.out.println("tuesday");
        break;

    case 3:
        System.out.println("wednesday");
        
        break;
    case 4:
        System.out.println("thursday");
        break;
    case 5 :
        System.out.println("friday");



    case 6 :
        System.out.println("saturday");



    default:
        System.out.println("entre a case matching number");
        break;
}

    }
    
}
/*syntax:
switch (key:var) {
    case value:
        
        break;

    default:
        break;
}

switch will get the value from the user, then it matches with the value in case and ger 
*/