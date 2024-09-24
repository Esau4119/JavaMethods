/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: President.java
 * Author: Duc Ta
 * Author: Esau Bojorquez Medina
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class President extends Person {

    //
    // Instance Data Fields
    //
   private int numPresidents = 0;
   private String firName;
   private String lasName;
    //
    // Constructors
    //
   public President() {
       this.firName = "Farhan";
       this.lasName = "Zaidi";
     
    }
    public President(String firstName, String lastName) {
    this.firName = firstName;
    this.lasName = lastName;
    

        
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
    public void sayGreeting(String string) {
        System.out.println("Hello from President cals");
    }
    //
}
