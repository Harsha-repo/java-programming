interface A{
    public void print();

    default void display(){
        System.out.println("this is default method of interface");

    }

    static void displays(){
        System.out.println("this is static method of interface ");
    }

    
}
class B implements A{

    @Override
    public void print() {
        System.out.println("this is normal method of interface");
    }

}

public class defaultinterface {
    public static void main(String[] args) {
        
    
    A a = new B();
    a.display();    // default 
    a.print();      // abstractt method
    A.displays();   // static method 
    
    }
}
