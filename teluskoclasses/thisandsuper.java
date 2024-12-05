
class A
{   
//default constructer   
    

    public A(){                      // constructer has the same name as its class
    super();                         // in every constructer there is a hiddden super method by default
    System.out.println("in default A");

    }

// parameterized constructer
    public A(int a){
    super();                          // in every constructer there is a hiddden super method by default  
    System.out.println("in A parameterized");
    }

}
class B extends A
{
// default constructer
    public B(){
    super();                           // in every constructer there is a hiddden super method by default
    System.out.println("in B");
    }

// parametrized constructer
    public B(int b){
    this();             // here this is a method that helps to execute the default constructer of its own class and then jumps tothe next statement 
    System.out.println("in parametrized B");   
    }
}
public class thisandsuper {
    public static void main(String a[]){


    B obj = new B(4);

    }
}

/*the process is the super method is always prioritize the super class i.e here , class A
 * now if we give some parameter inside the super method 
 * then it selects and executes the parameterized constructer with superclass else default constructer is called and executed 
 * if we dont mention the parameter it always points to the default one and starts its execution
 * 
 * if you want both the constructer of a single class to be executed and printed 
 * however by giving the parameter u will print the parametrized constructer of B  but how to print default 
 constructer of B
 * here we use 'this method' that actually executes the default cosntructer of its own class but do not points
 * to the super class constructer
 */