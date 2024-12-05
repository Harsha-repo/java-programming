
// this workswhen classes are in inheritence mode 

class A {


    public void show(){

        System.out.println("in A show");
    }
}
class B extends A{
    public void show(){
        System.out.println("in B show");
    }
  

    }
class C extends B{

    public void show(){
        System.out.println("in c show");
    }
}



public class dynmethoddispatch {

    public static void main(String[] args) {
        // lets create objects to the class

        A obj = new B();   // type is A but hte object is created to B class. B method overides A method 
        obj.show();

        obj = new A();
        obj.show();    // here the method is class a is executed 

        obj = new C();
        obj.show();     // this rerturns the: in c show 

        //here we see the same object is polymorphed into 3 different objects and executing the 3 different methods 
        // of 3 diffferent classes hence this is called  " run time polymorphism "

        // lets keep the type same and change the objects to B and C
        // A obj1 = new B();
        // obj1.show();
        
        // A obj2 = new C();
        // obj2.show();
    }
    
}
