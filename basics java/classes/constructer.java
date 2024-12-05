package classes;
// in this we are studying constructer methods

class student{

    private int age;

    // constructer method posses the same name as class 
    // no need of specifying the datatype
    public student(){

     System.out.println("this is constructer");
    }


    public student(int a){
      
     age = a;
    }

  public int getage(){

    return age;
  }


}

public class constructer {

    public static void main(String a[]){

// now lets create an object 
student obj = new student(45);  // using the parameterized constructer we can assign value to the variable while creating object
student obj1 = new student();

System.out.println(obj.getage());
// to run the code inside the constructer no need to call its method 
// by default whenever the obj is created the constructer runs automatically and give its output

    }
    
}

// we know aboout the overloading of the methods i.e. the same method names with different number of parameters
// can we do the same thing in the constructer method too? 
// we ccan also pass the parameters into the constructer it is called parameterized constructer 
// the one with no parameters is called default constructer 
// we can pass as many parameters required to the constructer with same name