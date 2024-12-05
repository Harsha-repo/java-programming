// interface are syntactically similar to classes but thy lack instance , we cannot create the  objects of the interface .
// their methods are declared without initialization and (abstractt methods ) 
// once it is defined any number of classes can access the interface and a single class can also implement as many number of inerfaces 
// so by this use of interface we can achieve a kind of multiple inheritence 

/*
 *     class                          interface                 interface
 *       ^  extends                       ^ implements              ^extends
 *       |                                |                         |
 *     class                            class                    imterface
 */
package interfaces;
public interface I {
    
    abstract void test();


}



// called at main class 
//check below files



// dafault interface 
/*introduced in jdk 8th version and useful one
using default interfaces will allow us to define method at the declaration of the it , so 
it is possible to givve the interface body  
rather being abstract



and also static method introduced in latest java versions that allow us to define the  methods inside the interface without being
abstract 
 */ 
