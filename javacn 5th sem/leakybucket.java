package javacn;
import java.util.*;
public class leakybucket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int rem=0;
        System.out.println("enter the no of packets");
        int n =sc.nextInt();
        System.out.println("enter the max size of the bucket:");
        int size=sc.nextInt();
        System.out.println("enter the rate flow:");
        int rate=sc.nextInt();
        System.out.println("enter th packets :");
        int a [] = new int[n];
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        int sent,rec;
        System.err.println("\n time    size     accept     sent     rem ");
        for(int i=0;i<n;i++){

            if(a[i]!=0){
                if(rem+a[i]>size){
                    rec=-1;

                }
                else{
                    rem+=a[i];
                    rec=a[i];
                }
            }

            else{
                rec=0;
            }

            if(rem!=0){
                if(rem>rate){
                    rem=rem-rate;
                    sent=rate;
                }
                else{
                    sent=rem;
                    rem=0;
                }
            }
            else{
                sent=0;
            }
            
            if (rec==-1){
                System.out.println(+i+"    "+a[i] + "dropped"+ "    "+sent+ "   "+ rem);
            }
            else{
                System.out.println(i+"     "+a[i]+"     "+rec+"       "+sent+"      "+rem);
            }
        }
sc.close();
    }
}
