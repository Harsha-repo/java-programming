// thisis a interaface describing example 
interface computer{
    public void code();
}
interface computer1{
    public void code();
}


class desktop implements computer,computer1{          // class implements the abstract methods or of the interface class
    public void code(){
        System.out.println("coding is done much faster");
    }
}
class laptop implements computer{

    public void code(){
        System.out.println("coding compiling running");
    }
}

 class developers{
    void dev(computer system){
        system.code();                            // by crearting the instance of class laptop we are passing it  as an argument and
                                                // implementing the method of the laptop 
    }

}

public class developer {
    public static void main(String[] args) {

        computer  desk = new desktop();
         computer lap = new laptop();
        developers n = new developers();

        n.dev(lap);
    }
    
}
