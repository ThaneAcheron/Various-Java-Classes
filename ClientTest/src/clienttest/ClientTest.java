/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clienttest;
import java.io.*; 
import java.net.*; 
/**
 *
 * @author Thane_Acheron
 */
public class ClientTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Variables
        Socket clientSocket = null; 
        PrintWriter out = null; 
        BufferedReader in = null; 
        
        //Attempt connection
        try {
        clientSocket = new Socket("127.0.0.1" , 16000); 
        out = new PrintWriter (clientSocket.getOutputStream(), true); 
        in = new BufferedReader (new InputStreamReader (clientSocket.getInputStream()));
        
        //Send a message 
        out.println("Hello World");
        out.close(); 
        in.close(); 
        clientSocket.close(); 
        } 
        catch(IOException e) {
            System.err.println("An error occured " + e);
        }
        
    }
    
}
