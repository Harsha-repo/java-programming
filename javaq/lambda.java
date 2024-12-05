public class lambda {
    public static void main(String[] args) {
        
        Thread thread = new Thread(()->{

            System.out.println("thread is running in lambda function");

        });
       
        thread.start();
        
    }
}
