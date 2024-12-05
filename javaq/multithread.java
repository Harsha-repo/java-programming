class MyRunnable implements Runnable{

    public void run(){

        for(int i=0;i<5;i++){
            System.out.println(Thread.currentThread().getName()+"is running");
      
            try{
           Thread.sleep(500);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class multithread {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new MyRunnable(),"thread1");
        Thread thread2 = new Thread(new MyRunnable(),"thread2");
        Thread thread3 = new Thread(new MyRunnable(),"thread3");
         
        thread1.setPriority(10);
        thread1.start();

        try{
        Thread.sleep(300);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

       thread2.setPriority(5);

        thread2.start();
        try {
            Thread.sleep(300);
        } catch (InterruptedException e){
            e.printStackTrace();
        }
       
        thread3.setPriority(1);
        thread3.start();

    }
}
