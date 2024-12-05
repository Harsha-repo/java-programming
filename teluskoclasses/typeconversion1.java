public class typeconversion1 {
    public static void main(String[] args) {
        int a =257;
        byte b;
        b = (byte)a;
        byte c = 127;
        int d;
        d=(int)c;
        System.out.println("the byte form of  "+a+" is "+b);
        System.out.println("the int form of  "+c+"  is "+d);
    }
    
}

// the range of numbers that byte can store is -128 t0 127 
// only numbers in this range can be converted to int 
// so the total byte size is 256 

// in conversion from int to byte if any int  number exeeding 256 
// the int number gets divided by 256 and tha returns reminder as the byte value refer the ex above