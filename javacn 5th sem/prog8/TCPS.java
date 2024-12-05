
package prog8;
// inputs for our program .net.* , io.* 


import java.net.*;

import java.io.*;



public class TCPS {

    public static void main(String[] args) throws Exception {    // main function with and exception


        ServerSocket sersock = new ServerSocket(4000);   // creates the serversocket at port no 4000
        System.out.println("Server ready for connection");  // annonces the use about server connection


        Socket sock = sersock.accept();                       // using Socket create socket obj and to acccept connections from client
                                                            // actully it waits here untill client connects and announces the below msg

        System.out.println("Connection Is successful and waiting for chatting");


        InputStream istream = sock.getInputStream();               // a class to input the client sent infromation into istream obj created by class InputStream
        BufferedReader fileRead = new BufferedReader(new InputStreamReader(istream)); // BR takes args as ISR hence we pass our istream into ISR and then to BR

        String fname = fileRead.readLine();                       // now the client sent info is stored in fileread , that is copied to fname using fileread.readline
        BufferedReader ContentRead = new BufferedReader(new FileReader(fname)); // also same Filereader(fname) reads the file content of fname(ex sample.txt) and then using BR it 
                                                                                // it stores  the info in the contentread


        OutputStream ostream = sock.getOutputStream();                    // using OutputStream  get data into ostream using sock.getinputstream()
        PrintWriter pwrite = new PrintWriter(ostream, true);

        
        String str;
        while ((str = ContentRead.readLine()) != null) {
            pwrite.println(str);
        }

        sock.close();
        sersock.close();
        pwrite.close();
        fileRead.close();
        ContentRead.close();
    }
}


// create and object of a ServerSocket at 4000 port  then say connection is ready
// create a socket object that connects to client and accepts input using Socket class and sersockaccept() respectively