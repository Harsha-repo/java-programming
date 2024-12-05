package javacn;

import java.util.Scanner;

public class slidingwindow {
    public static final int Max_size = 4;

   private static int[] window;
   private static int windowsize;
   private static int sendbase;
   private static int nextnum;
   private static int totalframes;


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the num of frames to be sent:");
        totalframes=sc.nextInt();

        windowsize = Math.min(Max_size,totalframes);


        window = new int[windowsize];

        sendbase=0;
        nextnum=0;


        // simulate the sending frames

        while (sendbase<totalframes) {
            while(nextnum<sendbase+windowsize && nextnum<totalframes){
                sendFrame(nextnum);
                nextnum++;
            }

            recieveAck();
        }

        System.out.println("all frames has been sent and acknowldged");
        sc.close();



        
    }


    private static void  sendFrame(int framenum){
        System.out.println("sending frame :"+framenum);
    }
    
    private static void recieveAck(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the acknowledgment for frame " + sendbase + ": ");
        int ack = sc.nextInt();

        if(ack==sendbase){
            System.out.println("ack recived for frame "+sendbase);
            sendbase++;
        }else{

            System.out.println("ack not recieved for frames :"+sendbase+"restraining");
            nextnum=sendbase;
        }
    }
}


