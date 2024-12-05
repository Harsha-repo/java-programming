public class exception 
{
    public static void main(String[] args) 
    {
        int i = 15;
        int j = 0;


        try
        {
            j = 12/i;

            if(j==0)
            {

                throw new ArithmeticException("denominator should be lesser than numerator:");
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);

        }
        
        System.out.println(j);
        System.out.println("done");

    }
    
}
