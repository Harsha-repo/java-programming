public class runnable implements Runnable{
    public void run(){
        System.out.println("the thread is running ");
    }
    
    public static void main(String[] args) {
        runnable obj = new runnable();
        Thread thread = new Thread(obj);

        thread.start();
    }
}


// also we can create using the lambda functions . directly implemented in the place of creation of object itself