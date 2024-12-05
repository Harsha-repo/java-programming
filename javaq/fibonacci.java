import java.util.*;
public class fibonacci {
    int n;
    int a=0;
    int b=1;
    int res=0;
    

    public void fibo(int n){
    System.out.println("the fibonacci series is :");
    for(int i=0;i<=n;i++){
    System.out.print(res+" ");
    a=b;
    b=res;
    res=a+b;
    }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the fibo limit:");
        int n =sc.nextInt();

        fibonacci obj = new fibonacci();
        obj.fibo(n);
        

        
    }
    
}
