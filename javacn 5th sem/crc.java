package javacn;
import java.util.*;
import java.io.*;
public class crc {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("enter message bits:");
        String msg= sc.nextLine();

        System.out.println("etner generator:");
        String gn = sc.nextLine();

        int data[]=new  int[msg.length()+gn.length()-1];
        int div[]=new int[gn.length()];

        for (int i=0;i<msg.length();i++)
            data[i]=Integer.parseInt(msg.charAt(i)+""); //here we add " " to avoid error if u want to know what error remove " " from it 
             
        
           for (int i=0;i<gn.length();i++)
            div[i]=Integer.parseInt(gn.charAt(i)+"");


            //calculation of crc

            for(int i=0;i<msg.length();i++){
                if(data[i]==1){
                    for(int j=0;j<div.length;j++){
                        data[i+j]^=div[j];
                    }
                }
            }
            //display of checksome code
            System.out.println("the checksome code is :");
            for (int i = 0; i < msg.length(); i++)
                data[i] = Integer.parseInt(msg.charAt(i) + "");
            for (int i=0;i<msg.length();i++)
                System.out.println(data[i]);



         System.out.println("enter check some  bits:");
       msg= sc.nextLine();

        System.out.println("etner generator:");
       gn = sc.nextLine();

         data=new  int[msg.length()+gn.length()-1];
         div=new int[gn.length()];

        for (int i=0;i<msg.length();i++)
            data[i]=Integer.parseInt(msg.charAt(i)+""); //here we add " " to avoid error if u want to know what error remove " " from it 
             
        
           for (int i=0;i<gn.length();i++)
            div[i]=Integer.parseInt(gn.charAt(i)+"");

            //calculation of crc

            for(int i=0;i<msg.length();i++){
                if(data[i]==1){
                    for(int j=0;j<div.length;j++){
                        data[i+j]^=div[j];
                    }
                }
            }
    
            boolean valid = true;
            for (int i=0;i<msg.length();i++)
                if(data[i]==1){
                valid=false;
                break;
                
            }


            if (valid==true) {
                System.out.println("data valid");
                
            }
            else{
                System.out.println("invalid");
            }
}

}