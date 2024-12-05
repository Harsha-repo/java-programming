package classes;

class sum{                                // declaration of the class

    int add(int num1, int num2){         // while creting the funciton we write its name with datatype w.r.t rerturn type

        System.out.print("iam performing addition ");
        int r = num1+num2;

        return r;
    }
    int sub(int num1 , int num2){
         int s = num1-num2;
        return s;
    }
}
public class classbasics {
    

    public static void main(String a[]){

        int n1 = 4;             // normal initialization of two variables 
        int n2 = 4;

        sum s = new sum(); // creation of class variable that helps too create , class object
         // the correct way of creating an object , sum is class , s is variable that stores the created object
        // new is the key word that is used and compulsarily used  that creates space for the object in memory
        // sum() is the object created
        // for calling function we use class variables(s) and using . operation we call the function inside the class
        //s.add(n1,n2); like this 
        // now assign a local varible and stores the answer inside it 

        int result = s.add(n1,n2);       // class objects used to call functions and print results 
        int result1 = s.sub(n1,n2);
        System.out.println(result);
        System.out.println(result1);

        




    }
}

// by creating differnt kinda of functions inside the class and creating objects of class , and make the code efficient
// 