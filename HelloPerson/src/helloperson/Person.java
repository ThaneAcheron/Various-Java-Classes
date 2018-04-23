/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helloperson;

/**
 *
 * @author Thane_Acheron
 */
public class Person {
    private String name; 
    
    /**
     *
     */
    public Person(){
        System.out.println("I am born!");
    }

    /**
     *
     * @param name
     */
    public void setName(String name){
        this.name = name;
    }

    /**
     *
     * @return
     */
    public String getName(){
        return name;
    }
}
