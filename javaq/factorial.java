import java.util.*;
public class factorial {

    
    public int fact(int n){
        int fact=1;
        System.out.println(n);
        for(int i=1;i<=n;i++){
            fact = fact*i;
        }


        return fact;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        System.out.println("enter a number:");
         int n = sc.nextInt();
        factorial obj = new  factorial();
        int result = obj.fact(n);
        System.out.println(result);
    }
    
}
