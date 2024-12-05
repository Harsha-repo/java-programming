class mythread extends Thread{
    public void run() {
       
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("thread 1 ");
        }
    }
}
class myrun implements Runnable{

    @Override
    public void run() {
        
        for(int i=0;i<10;i++){
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            System.out.println("thread 2");
        }
    }

}

public class threads1 {
   public static void main(String[] args) {
    
   
    mythread thread = new mythread();
    thread.setPriority(1);
    thread.start();
    

    myrun run = new myrun();
    Thread obj = new Thread(run);
    obj.setPriority(10);  // when you give the priority as as 0 that creates an exception that is handled by the java 
    // the priority range is ( 1-10)   1 is low  and 10 is high ;
    obj.start();
    
    
}
}

// because we have set the priority we know that there is simmultanous executions of threads which are now prioritized so that 
// according to the priority they undergo execution 
// inbetween we have kept the delays to observe the flow according to the priority ; 
// this is called the set priority methods 
// we can also get the priority of each threads using getpriotiy methods which returns the integer value in range (1-10)