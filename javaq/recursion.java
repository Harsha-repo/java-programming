public class recursion {
    public int fibo(int n){
        if(n<=1){
            return n;
        }
        else{
            return fibo(n-1)+fibo(n-2);
        }
    }
    
    public static void main(String[] args) {
        recursion obj = new recursion();
        int n = 5;

        for(int i=0;i<n;i++){
       int result =  obj.fibo(i);
       System.out.println(result);

        }
    }
}
