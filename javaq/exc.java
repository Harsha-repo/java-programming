class myexce extends Exception{
    myexce(String s){
        super(s);
    }
}

public class exc {
    public static void main(String[] args) {
        try{
            throw new myexce("iam not well");
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    
}
