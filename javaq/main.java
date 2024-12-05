public class main {
    public static void method () throws IllegalAccessException{
        System.out.println("inside method ");
        throw new IllegalAccessException("access denied");
    }
    
    public static void main(String[] args) {
        try{
            method();
        }
        catch(IllegalAccessException e){
            System.err.println(e.getMessage());

        }
    }
}
