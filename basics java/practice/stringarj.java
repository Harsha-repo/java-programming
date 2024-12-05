import java.util.Scanner;
public class stringarj {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String st = sc.next();
        String st1 = "";
        System.out.println(st1);
        for(int i=0;i<st.length();i++){

            st1 = st.charAt(i)+st1;
        }
        System.out.println(st1);

    }
    
}
