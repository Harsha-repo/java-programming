class a extends Thread {     // mutlitasking

       public void run(){
        for(int i=1;i<10;i++){
            System.out.println("hi");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }

       }

    
}
class b extends Thread{
    public void run() {
        for (int i = 1; i < 10; i++) {
            System.out.println("hello");
            try 
            {    
                Thread.sleep(500);                                  // whenever the sleep is called is has to be in trycatch block so that we could handle the errors during execution
                Thread.sleep(500);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            
        }

    }

}
public class threads{
    public static void main(String[] args) {
        
        a obj = new a();
        b obj2 = new b(); 
        System.out.println(obj2.getPriority());      // getpriority is a method that geives the integer back so that we would know tha prio of that obj
        obj2.setPriority(Thread.MAX_PRIORITY);      // in thread class we have a vlaues to set priority to max or min 

        obj.start();       // start function of thread class that calls run and executes similarly as threads 
        try {
            Thread.sleep(100);               // this sleep is used to get the gap between these two objects exection , ensuring that we could get 
                                                    // the delay and alternate hi and hello 
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        obj2.start();    // after running we acan see that our output is not in sequence sometimes hii and sometimes hello is gettng printed
    }
}

// 
//threads are the light weight processs that are executing in the program , threads represents the flow of a execution of program
// our aim is to a make the two threads that are obj , obj2 the objects to exexute simulataneously
// in that way we could get the output hi and hello at the same time so we 
// make the class to extend the Threads class that helps to make the objects of the class as threads 
// class Threads has two methods namely start() and run () methods using these methods we could make the threads execution'
// and also our output resembling the simultanous execution of the threads printing hii and hello at the same time


// there are two methods for creating the flow of thread 
// 1. by extending the Thread class  2. by implementing the runnable interface 
// threads are created in each of the class,  we create thread objects and start running 