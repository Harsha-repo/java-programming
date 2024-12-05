/*type conversion and casting 
conversion : implicit conversion where a lower bytes value is converted to higher byte one 
like a bytevalue (2bytes ) is converted to int value(4 bytes) 

for a ex : a smaller box can fit inside a big one but vice versa it is not possible 

casting : is that making the bigger box to fit inside the smaller one ;

for ex: we know that float is bigger than int , now if we type cast the float value to the int 
value ,then we lose the decimal numbers  of float value hence its called casting */

public class typeconversion {

    public static void main(String a[]){
        byte b = 12 ;          // the maximum value that a byte can have(-128 to 127 )
        int r =512;
        byte g = (byte)r;      // converting the int value to byte,i.e..  num%256 
        float h = 7.9f;         
        int x = (int)h;         // converting float value to int 
        System.out.println(g);
        System.out.println(x);
        byte c = 10;
        int  res = b*c ;       // mathematical operation on byte promoted to int 
        int i = (byte)234;

        System.out.println(i);
        System.out.println(res);



    }
    
}
/* the value for converting the number 257 to bytes will give out put of 1 
 * bcz the range of byte is -127 to +128  where the number of values are 256
 * any number below  that can be represented in bytes same as int  but above that not possible
 * if we try to convert then any number above , that number  will get divided by 256 and the reminder 
 * is returned as the output (which is a byte form  of int) 
 * 
  */