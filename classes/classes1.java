package classes;
    class student{


    // a string outputing function 
   public String name(String s){

        System.out.println("iam a string outputing funtion");
            return s;

        }

    // a integer outputing function
    public int number(int a){

        System.out.println("iam a integer outputing function");
        return a;
    }

    }


public class classes1 {
    public static void main(String a[]){


String s = "ram";

student obj = new student();   // creation of object 
System.out.println(obj.name(s));  // printing the output of the function using object

     
    }
    
}


// during the creation of functions inside the class we need to specify their datatype based on their return type 
// hence we write function name with datatype that helps to sync with the return type 
