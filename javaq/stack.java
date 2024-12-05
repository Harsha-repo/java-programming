import java.util.Scanner;

public class stack {

    int maxsize;
    int value;
    int stackarray[];
    int top = -1;
    int flag;

    public stack(int size) {

        maxsize = size;
        stackarray = new int[maxsize];

    }

    public void push(int value) {

        if (top == maxsize - 1) {
            System.out.println("the stack limit is reached "+maxsize);
            System.out.println("the stack is full , overflow");
            System.out.println("the elements in the stack area :");
            for(int i=0;i<=top;i++){
                System.out.print(stackarray[i]);
            }
        } else {
            stackarray[++top] = value;
            System.out.println("pushed" + value);

        }
    }

    public void pop() {

        if (top == -1) {
            System.out.println("the stack is empty");
        } else {
            System.out.println("popped" + stackarray[top]);

            top--;
        }
        
        
    }

        // check the elements in the array are palindrome are not
       public void palindrome(){
        
        for (int i =0;i<=top/2;i++){
            if(stackarray[i]==stackarray[top-i]){
                 flag=1;
            }
            else{
                flag=0;
            }
        }
        if(flag==1){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not a paliindrome");
        }
        }

       

       public void display(){
        if (top!=-1){
            System.out.println("the elements in the array are:");
            for(int i=0;i<=maxsize;i++){
            System.out.print(stackarray[i]);
        }
       }
       else{
        System.out.println("no elements in the stack\nplease push elements to stack5");
       }
    }

    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stack obj = new stack(5);
        while (true) {
            System.out.println("1.push\n2.pull\n3.exit()\n 4.palindrome\n5.display");
            System.out.println("select your choice:");
            int choice = sc.nextInt();
            int len = obj.stackarray.length;
            
            
            switch (choice) {

                case 1:
                    System.out.println("enter the value to the stack:");
                    int n = sc.nextInt();
                    obj.push(n);
                    break;

                case 2:
                    obj.pop();
                    break;

                case 3:
                    break;
                case 4:
                    obj.palindrome();
                    break;
                case 5:
                    obj.display();
                    break;

                default:
                    System.out.println("enter the correct choice");

            }

        }
    }
}
