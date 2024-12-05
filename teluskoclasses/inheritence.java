// inheritence is the method where one class methods are used by the other class by inherting the methods 
// the class inherited is called the super(base)class , in which it is inherited is the sub class 
// for inheriting the class we dont need java file but class file is enough 
// if a one class is inherited by the another class where there are only two class then it is single level inheritence
// if the there three levels of inheritence then it is called multi level inheritence



// lets create class and inherit the classes to the other class 

class S{

    public S(){
        System.out.println("im in s");

    }
}

// think there is another class B to inherit S class in B class we use key word if 'extends'

class B extends S{

    public B(){

        System.out.println("im s inherited by  b, and im b");
    }
}

// lets take another class and inherit the class B into it and see multilevel inheritence

class H extends B{

    public H(){

        System.out.println("im s single inht by b and multi inheri at c , im b inherit by c from b, im c  ");
    }

}
public class inheritence {


    public static void main(String a[]){



new H();

    }
    
}
