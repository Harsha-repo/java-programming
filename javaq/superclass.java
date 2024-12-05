 class Super {
int n = 50;
    Super(int n){
        System.out.println(n);
        System.out.println("this is super class constructor ");
    }
    
}
class A extends Super{
   
    A(int m){
        super(10);
        System.out.println(super.n);
        System.out.println(m);
        System.out.println("is subclass constructor");
    }
}
public class superclass{
    public static void main(String[] args) {
        A obj = new A(20);

    }
    

}