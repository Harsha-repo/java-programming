package classes;

// here we have static method and static block explained

class mobile{


    int i = 4;
    static String str= "harsha"; // when i add static infront then it becomes static variable 

    public void show(){

        System.out.println(i+str);

    }

    // creating a static method 
    public static void show1(){

    System.out.println(i+str);    // but here i is showing the error because in static methods only static variables
    // can be accessed and not any others
    // why because ,when objects are created different objects has different values for instance variable, but only one 
    // same value for the static variable-
    // during accessing that leads to error
    }


    // creating a static block 
    static {

        System.out.println("this is from static block");


    }

/* when we see the out put we get that static block is executed first and its statement is print even the 
 static method is above the static block 
 * because in a programmme   the class is loaded  only once  and after this objects get created 
 * same way only once in a  progamme the static block runs and executed simulataneously with the load of class
 * even if the objects are not created and only class gets loaded, the static block gets executed
 */
}

public class staticmethod {

    public static void main(String a[]){


      //  mobile obj = new mobile();
      //  obj.show();

      // so to load the class without any objects we have this special statement
        Class.forName("mobile"); // with this u can load your class but here its showing the exception 

        // we will dicuss in up coming classes
    }
    
};
