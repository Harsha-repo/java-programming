import java.util.*;
public class numberrepeat{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count=0;
    
        String str =Integer.toString(n);

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)==str.charAt(j)){
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);

    }
}

       
   
        
        

       
