package arrays;

// in this code lets create a class and then create multiple objects for the class and then 
//we try to create an  array of objects



class student{

    int roll ;
    int marks ;
    String name ;

    // these are the variables of the class(instances) but not the varibles of the methods 

}
public class array2 {

public static void main(String a[]){



student s1 = new student();  // 1st object
s1.name = "ram";
s1.marks = 45;

student s2 = new student();   // 2nd object
s2.name = "lax";
s2.marks = 67;

student s3 = new student();  // 3rd object
s3.name = "barath";
s3.marks = 89;


// now we create array of objects

student array[] = new student[3]; // class name  arrayname[] = new classname[] : syntax

array[0]= s1;
array[1]=s2;
array[2]=s3;

// for fetching the data  of all the student 

for(int i=0; i<array.length;i++){


System.out.println(array[i].name +":"+array[i].marks);


}

}
    
}

// this is one of the application of the array's