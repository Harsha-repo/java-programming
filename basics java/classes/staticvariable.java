package classes;



class mobile{
  
// lets have some varibles (class members)
String name;
 static String brand ;
int price;

public void show(){

    System.out.println(name+":"+brand+":"+price);

}


}

public class staticvariable {


    public static void main(String a[]){

// creating objects to the class
 

mobile obj = new mobile();
obj.name="s23";
obj.price = 1000;


mobile obj1 = new mobile();
obj1.name="s22";
obj1.price = 1100;



mobile obj2 = new mobile();
obj2.name="note 20";
obj2.price = 1100;

// see i havent specified brands for each mobile in objects , only static is assigned to samsung 
// but since this is same for all objects even if u assign , therefore prints the same brand name for all models of samsung mobile

mobile.brand = "samasung";


obj.show();
obj1.show();
obj2.show();

System.out.println(student.name);
// for example think that iam having only one brand and different models of that so i need to keep the brand as static
// so i create brand as static variable  like : static brand = samsung 
// also while calling a static variable we need to use classname.static variable 
// even though the brand names are different the output is showing the same brands this is because the :static variable

    }
    
}
