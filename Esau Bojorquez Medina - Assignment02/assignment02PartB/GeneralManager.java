/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: GeneralManager.java
 * Author: Duc Ta
 * Author: Esau Bojorquez Medina
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class GeneralManager extends Person {

    //
    // Instance Data Fields
    //
   private String firName;
   private String lasName;
    //
    // Constructors
    //
    public GeneralManager() {
        this.firName = "Scott";
        this.lasName = "Harris";
    }
    public GeneralManager(String firstName, String lastName) {
    super(firstName,lastName);
    }
    

    //
    // Instance Methods
    //
    
    public String getFName(){
        return this.firName;
    }

   
    
    public String getLName(){
        return this.lasName;
    }
    //
    // Language
    //

    //
    @Override
    public void sayGreeting(){
   System.out.println("Hello from generalManager class");
    }
    //
}