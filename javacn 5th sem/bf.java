package javacn;
import java.util.*;
public class bf {

    private int n;
    private int[] D;
    private static int max=999;


    public bf(int n) {
        this.n = n;
        this.D=new int[n];
    }

    public void bford(int s,int a[][]){
        for(int i=0;i<n;i++){
            D[i]=max;
        }

        for(int i=1;i<=n-1;i++){

            for (int u = 1 ; u<=n;u++){
                for(int v = 1;v<=n;v++){
                    if(a[u][v]!=max){
                        if(D[u]>D[v]+a[u][v])
                        D[u]=D[v]+a[u][v];
                    }
                }
            }
        }

        for(int u=1 ;u<=n;u++){
            for (int v=1;v<=n;v++){
                if(a[u][v]!=max){
                    if(D[v]>D[u]+a[u][v])
                    System.out.println("there is negative cycle");
                }
            }
        }
    }



    public static void main(String[] args) {
        
        int s;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number of verticse:");
        int n=sc.nextInt();
        int a[][]=new int[n][n];
        System.out.println("enter the adjacency matrix:");
        for(int i =0;i<n;i++){
            for (int j=0;j<n;j++){
            a[i][j] = sc.nextInt();
            if(i==j){
                a[i][j]=0;
            }
            if(a[i][j]==0){
                a[i][j]=max;
            }
            }
        }

        System.out.println("enter the source matrix:");
        s=sc.nextInt();

        
        bf b = new bf(n);
        b.bford(s,a);


    }
    
}
