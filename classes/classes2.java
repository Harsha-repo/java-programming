package classes;

class student{


    // a string outputing function > with single parameter 
   public String name(String s){

        System.out.println("iam a string outputing method");
            return s;

        }

    // with same method name another string outputing function > with 2 parameters
    public String name(String a , String b){

        System.out.println("iam a string  outputing method");
        String r = a+b;
        return r;
    }
    
    // another one with same name  > with 3 parameters
    public String name(String a , String b,String c,String d){

        System.out.println("iam a string outputing method");
        String r = a+b+c;
        return r;
    }
}
// in this way we can create as many we can which is called method overloading 
// important thing is we see that iin each method there are different number of paramters passed 
// we need to ensure that during method overloading the number of parameters should not be same ,for atleast one 

public class classes2 {


    public static void main(String args){


       String l = "h";
       String m = "a";
       String n = "r";
       String o = "s";

       // creating an object 
       student obj = new student(); // obj isa reference variable that addresses obj which is in heap memory*
       System.out.println(obj.name(l,m,n,o));




    }
    
}

// this  is called the method overloading method and is same method names with different  size of parameters
/* stack and heap memory  
 * the methods inside class, created  ,  are stack memory that is (last in first out kind of )
 * also the main method is form of stack memory 
 * but the object which is created is occupies space in heap memory which can be accessed any time quickly
 * stack is sequenced type of memory ( last in first out )
 * heap is an expandable memory 
 * all these memories are present inside the JVM (JAVA VIRTUAL MACHINE)
*/
// jaggged array is also possible like 
/*125
  1223
  12
 drawbacks of array 
 > it creates objects in the heap memory
 > also  once created  we cannot increase the size of an array afterwards
 >  only homogenous elements are allowed inside array
 > for insertion and searching the array performance is low
 > collecton is solution for this */