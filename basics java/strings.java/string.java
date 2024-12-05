// in this we study about the strings class creation and their types 
// immutable and mutables 
// buffer strings and buildup strings 
// different functions on strings that are inbuilt


public class string {


    public static void main(String a[]){
    String s = new String();
    String s1 = "harsha";

    // this is actual way of string creation 
    // but we diretly  take String datatype and assign string to it
    // at that time it creates object on its own and then put that string inside it
    
    String l = "ram";

    System.out.println(l+s+s1);

    StringBuffer sb = new StringBuffer(); // this is the way they create the object of stringbuffer
                                          // inside brackets we can fill the strings that are required 
                                         // when no string is written then it shows the capacity of 16 bits
                                         // here stringbuffer is also creating the class in its own
                                         // buffer strings allow us to do string slicing

    // now lets print the capacity of the string buffer 
    System.out.println(sb.capacity());
    System.out.println(sb.length());
    sb.append("rama");
    System.out.println(sb);
    //sb.  buffering variable with dot operator will show the all possible string modifications that can be  done
    String str =sb.toString();// this will convert the buffer string into the noraml string
    System.out.println(sb.getClass());
    sb.getClass();
    sb.append("sita");
    System.out.println(str);
    System.out.println(sb);
    
}  
}
// mutable strings : can be changed 
// immutable strings : cannot be changed 


// to make string mutable use a special kind of string that is string buffer 

/* string buffer and string builder 
 * 
 *string buffer gives u capacity of 16 bits 
 we can  change the created string inside the string buffer 
 above we can see how the string buffer object is being created

 only difference between the string buffer and builder is buffer is thread safe and builder is not safe
 */