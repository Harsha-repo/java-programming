class A {

    int count;

    public void counter()
    {
        count++;
    }
}

public class threads3 {
public static void main(String[] args) throws InterruptedException {

    A a = new A();

    Runnable obj = ()->
    {
        for(int i=0;i<1000;i++){
       a.counter();
        }
    };

    Runnable obj1 = ()->
    {
        for(int i=0;i<1000;i++){
       a.counter();
        } 
    };

    Thread t1 = new Thread(obj);
    Thread t2  = new Thread(obj1);

    t1.start();
    t2.start();

    t1.join();
    t2.join();

    System.out.println(a.count);
}
    
}


// here we try to access the same method count using two thread t1 and t2 simultanously 
// then we print the total value of count , like each and every time when a count is accessed its calue gets increased 
// when we try to acces more times like 1000 tiimes then we need to get print output as 2000 because two threads accessing count gets twice 
// 
// but we see the outputs different 
// because we are accessing the counter method using two threads at a time 
// it is seen that there is racecondition that giving the unpredictable outputs 

// when two threads try to access the same resource there is deadlocking that occurs 
// what we have to do is to make sure that only one thread access the resource at a time 
// 
// so we use the synchronize key word that is helping to ensure that only one thread could access
// by this we can achieve the complete execution of the process using limitied resources
// 