package classes;
class company{

// lets consider these two are the parameters that has to be encapsulated 
// the key word used is private , before the primitive datatype 


int income ;
private String hod;

// these private vaiables cannote be accessed by the methods created to the class 

// lets create methods to access the private data and
 // to assign any value to the variables we create methods



// method to assign a value to income 
public void setincome(int a){

    income = a;
}


// to access the income 
public int getincome(){
    

    return income ;
}
// same way to the hod
public String gethod(){

return hod;

}

}


public class encapsulation {

    public static void main(String a[]){

company obj = new company();

// with this isam setting the value of the income and accessing it through the getincome method 
obj.setincome(1000);
obj.getincome();

    
//obj.hod ; gives me error because the variable is made private    }
// to access the private java says to access them by creating the methods 
// when u call the method the variable will be displayed 

    
}
}

// encapsulation mesans the security to the data provided 
// the varibles cannot be accessed through the class objects but through the class methods 
// so we create methods and then call those method in the main and access the private data