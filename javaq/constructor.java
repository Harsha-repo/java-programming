//  class  C {

//     public C(){
//         System.out.println("this is  c constructor");
//     }
// } 


// class A extends C{
//     public A(){
//         System.out.println("constructor of A");
//     }

// }

// class B extends A{
//     public B(){
//         System.out.println("constructor of B");
//     }
// }
abstract public class A{
    constructor(){
        System.out.println("inside abstract constructor");
    }

    void print(){
        System.out.println("inside the anstact method");

    }
}
class B extends A{

}
public class constructor{
public static void main(String[] args){
    B obj = new B();
}
}
