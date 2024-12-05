interface inter{
    public void add(int i,int j);
    

}
public class lambda {
   public static void main(String[] args) {
    
   
    inter in = (int i,int j) -> System.out.println("this is addition "+i+j);  // if we have only one varible then no need to assign brackets
    // it works directly
        
     in.add(3,4);

    };

    

   
    
}

