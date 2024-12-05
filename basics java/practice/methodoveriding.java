// this is for method overriding : it is a process where the methods during inheritence which is having the same 
// name as well as function but based on the object creation , it chooses the method of the class for which the 
// object is created 
// and overides the other method if the same name  this is a overriding feature in java


// lets say there is a class calcualtor



class Calc{

    public int add(int a , int b){

        return a+b;
    }

// another class scicalculator inherits the clac
class advcalc extends Calc{

public int add(int a , int b){

    return a+b;
}

}



}

public class methodoveriding {
    public static void main(String a[]){

        //Calc obj = new Calc();
        //int result = obj.add(2,3);
        //System.out.println(result);

        advcalc obj = new advcalc();
        obj.add(2,3);


    }
}
