package arrays;

//  this space ..here u can create your own class and run  by creating objects


//this is single dimensional array  
public class array {

    public static void main(String a[]){


    int array[] = {1,2,3,4};    // creation of array that is similar to c 
    int array1[] = new int[45];  // if the values are unknown and length of the array is known , we use this initialization

    // here the array values are made to 0 
    
    // by using loop we can access the array elements

    // we can change the arrray values using their index values as below
     array[0]= 6;     // no need to specify datatype second time


     // for array1[] i can give values in the same way since , they are initailized with zero 

    for(int i=0;i<=3;i++){          // if u dont know the length of the array then use 'arrray.length' 

     System.out.println(array[i]);
     
    }


    for(int i=0;i<=3;i++){          // if u dont know the length of the array then use 'arrray.length' 

     System.out.println(array1[i]);
     
    }


    }
    
}
