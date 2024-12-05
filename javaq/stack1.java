import java.util.*;
public class stack1 {
       int top=-1;
       int maxsize=5;
       int stack[]=new int[maxsize]; // maxsize is taken 5 
       public void push(){
        if(top==maxsize-1){
            System.out.println("overflow");

        }
        else{
           Scanner sc = new Scanner(System.in);
            System.out.println("enter the value to push:");
            int value = sc.nextInt();
            top++;
            stack[top]=value;
            System.out.println("pushed : "+value);
        }
    }
        public void pop(){
            if(top==-1){
                System.out.println("underflow");
            }
            else{
                int pop = stack[top];
                System.out.println("popped :"+pop);
                top--;
            }

        }

        public void display(){
            System.out.println("the stack elements are :");
            if(top!=-1){
                for(int i=0;i<stack.length;i++){
                    System.out.println(+stack[i]);

                }

            }
            else{
                System.out.println("stack is empty");
            }
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            stack1 obj = new stack1();
        
 
            while(true){
            System.out.println("1.push  2. pop  3 . display ");
            System.out.println("enter your choice:");
            int choice=sc.nextInt();
            switch(choice){

                case 1 :
                obj.push();
                break;

                case 2 :
                obj.pop();
                break;

                case 3 :
                obj.display();
                break;

            }

        }
    }
       }
    

