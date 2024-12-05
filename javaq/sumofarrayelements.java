import java.util.*;
public class sumofarrayelements {
    int size;
    int array[];
        Scanner sc = new Scanner(System.in);
     
    sumofarrayelements(int n){
     
      array=new int[n];
    }
   

    public void input(){
        System.out.println();
         System.out.println("enter elements into arrray one by one:");
    for(int i=0;i<array.length;i++){
        array[i]=sc.nextInt();
    }

    }
    public int sum(){
        int add=0;
        for(int i=0;i<array.length;i++){
            add= add+array[i];
        }
        return add;
    }

public void show(){
    System.out.println("the array elements are:");
    for(int i=0;i<array.length;i++){
        System.out.println(array[i]);

}
}

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array size:");
    int n = sc.nextInt();
    sumofarrayelements obj = new sumofarrayelements(n);
    obj.input();
    obj.show();
    int sum = obj.sum();
    System.out.println("the sum of elements in the array:"+sum);
   

    
    }
}
    

