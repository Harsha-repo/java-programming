import other.A;

class A{


    public int show;
    public char[] marks;

    public A(){

        System.out.println("in A");
    }
}

public class anonymousclass {

    public static void main(String a[]){


        //object creation is a two step thing 
       // A obj;
       // obj = new A();  // this is the step where object creation happens but obj acts as refernece variable 
    // we can also create object in the heap memory without refernece variable
    new A(); // thhis is where the object is ready but it don't have reference variable pointing to it


    }
    
}



// this kind of object of class is called anonymous objects of class