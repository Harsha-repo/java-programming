import java.util.*;
public class nthfibo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int a = 0;
        int b = 1;
        
        int sum = 0;
        int result=0;
        for(int i=0;i<n-1;i++){
            
            a=b;
            b=sum;
            
            sum=a+b;
            result = sum;
            

        }
        System.out.println(result);
    }
}
