package classes;

// let us see this example 

class humans{


    private int age;
    private String name;

    public int getage(){
         return age;
    }

    public void setage(int age){
       this.age = age;           // this is the key word that represents and is calling the object and equating it to local variable
                                 //bsically its differentiating the two same named variables 'age' , this,age is different
                                 // only age is different
                                 // differentiating the class variable age and local variable age
                                 
    }

    public String getname(){
         return name;

    
    }

    public void main(String n){

        this.name=n;
        
    }
}


public class thiskeyword {

    public static void main(String a[]){

      humans obj = new humans();
      obj.setage(34);
      obj.getage();
    System.out.println(obj.getage());
    }
    
}
