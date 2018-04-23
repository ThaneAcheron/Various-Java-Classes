/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloperson;
import java.text.SimpleDateFormat; 
import java.util.*; 
/**
 *
 * @author Thane_Acheron
 */
public class HelloPerson {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        if (args.length != 1){
            System.out.println("Please enter one argument");
            System.exit(1); 
        }
        
        Person person = new Person(); 
        person.setName(args[0]);
        
        Date now = new Date(); 
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm:ss"); 
        System.out.println("Hello " + person.getName()); 
        System.out.println("The time is now: " + sdf.format(now));
    }
    
}
