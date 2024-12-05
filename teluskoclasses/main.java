

import interfaces.H;
import interfaces.I;

public class main implements H , I{

    @Override
    public void test() {
        // TODO Auto-generated method stub
     System.out.println("im a method of interface I");  
    }

    @Override
    public void test2() {
        // TODO Auto-generated method stub
       System.out.println("iam a method of interface H");
    }
public static void main(String[] args) {
    main a = new main();
    a.test();
    a.test2();
}

    
}
