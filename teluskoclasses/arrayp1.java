import java.util.Scanner;

class arrayp1 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

    System.out.println("enter the size of array :");
    int n = sc.nextInt();

    int array[] = new int[n];   // array object creation
    System.out.println("lenght of array :"+array.length);

    System.out.println("input the array elements:");
    for(int i = 0 ; i<array.length;i++){
        array[i]=sc.nextInt();

    }

    System.out.println("THE ARRAY ELEMENTS ARE :");
    for(int i =0 ;i<array.length;i++){
        System.err.println(array[i]);
    }


    int temp ;
    for(int i=0;i<array.length;i++){
        for(int j=0;j<array.length-1;j++){

            if(array[j]>array[j+1]){
                temp = array[j];
                array[j]=array[j+1];
                array[j+1]=temp;
            }
        }
    }
    System.out.println("the sorted arrray is :"+array);

  }
    
}
