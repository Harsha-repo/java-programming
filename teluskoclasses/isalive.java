public class isalive {
    public static void main(String[] args) {
        Thread thread = new Thread(()->{
            System.out.println("hii");

        });
thread.start();
boolean b = thread.isAlive();
System.out.println("status :"+b);

    }
        
    }
    

