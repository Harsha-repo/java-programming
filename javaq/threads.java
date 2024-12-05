 class MyRunnable implements Runnable{

    

    public void run(){
        for(int i=0;i<5;i++){
            
            System.out.println("computer science");
           
            try{

            Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
class myrun implements Runnable{
    @Override
   public void run(){ 
    for(int i=0;i<5;i++){
            
            System.out.println("information science");
           
            try{

            Thread.sleep(1000);
            }
            catch(InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}

public class threads{
    public static void main(String[] args) {

        Thread thread = new Thread(new MyRunnable());
        Thread thread1 = new Thread(new myrun());

        // threads obj = new threads("computer science");

        // threads obj1 = new threads("info");
       
       thread.setPriority(10);
        thread.start();
        try{
            Thread.sleep(5000);
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }
        thread1.setPriority(1);
       thread1.start();

    }
}
