// interface are syntactically similar to classes but thy lack instance , we cannot create the oobjects of the interface .
// their methods are declared without defining  and (abstractt methods ) 
// once it is defined any number of classes can access the interface and a single class can also implement as many number of inerfaces 
// so by this use of interface we can achieve a kind of multiple inheritence 

/*
 *     class                          interface                 interface
 *       ^  extends                       ^ implements              ^extends
 *       |                                |                         |
 *     class                            class                    imterface
 */


interface A {
    public void print();
}

public class interfaces{
    public static void main(String[] args) {
        A obj = new A(){

            @Override
            public void print() {
            System.out.println("print");
            }
            
        };
        obj.print();
    }
}


// but here we are able to implement the instacne of the interface using anonymous class 
// with this we cna reallly implement the instance of the interface and now we can use it for calling the abstract method of 
// and also we implemeted the method at the stage of creation of the instance 

// we cna further simplify the anonymous function using lambda function 