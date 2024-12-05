
// this workswhen classes are in inheritence mode 

class A {


    public void show(){

        System.out.println("in A show");
    }

class B extends A{
    public void show(){

        System.out.println("in B show");
    }
class C extends A {

    public void show(){

        System.out.println("in C show");
    }
}
}
}
public class dynmethoddispatch {

    public static void main(String[] args) {
        // lets create objects to the class

        A obj = new A();   // type is A and objeecct is also A
        obj.show();

        // lets keep the type same and change the objects to B and C

        obj = new B();
    }
    
}
