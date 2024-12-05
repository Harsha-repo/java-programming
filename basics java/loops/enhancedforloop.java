package loops;



// we are dicussing about an enhanced for loop , this is similar to for loop and is efficient also
// her we say for loop to pick its iteration on its own however it runs, similar to the for loop 


public class enhancedforloop {

    public static void main(String a[]){


int array[] = new int[4]; // an array of size four
array[0]= 1;
array[1]=2;
array[2]=3;
array[3]=4;

/*noraml for loop , for printing array elements
for(int i = 0;i<array.length;i++){

    System.out.println(array[i]);
}
*/

// enhanced for loop for same thing 

for(int n : array){        // colons says that pick the elements from the array , we are not supposed to use =

    System.out.println(array[n]);


}

    }
    
}


// using this enhanced for loop we can also iterate over the objects of class , how we done using noraml loop
// while using noraml loop we use int as datatype, but when its objects of class we use class name as the datatype of n  
