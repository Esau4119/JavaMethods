/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Person.java
 * Author: Duc Ta ( for setting this up )
 * Author: Esau Bojorquez Medina
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

// JAVA 15, 2020, added "sealed" and "permits" to Java classes.
// We are learning the new elements of JAVA 15.
// "sealed" and "permits" are used here so that we will have one more example to reference.
// We do not need to understand "sealed" and "permits" in order to start and complete this assignment.

public sealed abstract  class Person implements  Greeting permits Student, Player, President, GeneralManager, Manager{

    //
    // Instance Data Fields
    // 
    private static int numPeople = 0;
    private String fName;
    private String lName;
    
  
    //
    // Constructors
    //
public Person() {
        Person.numPeople++;
        this.fName = "NEED NAME";
        this.lName = "NEED LAST NAME";
    }
    public Person(String fName,String lName) {
        this.fName = fName;
        this.lName = lName;
        Person.numPeople++;
    }
    // Instance Methods
    
    public String getFirstName(){
        return this.fName;
    }
    public void setFirstName( String fName){
         this.fName = fName;
    }
    public String getLastName(){
        return this.lName;
    }
    public void setLastName( String lName){
         this.lName = lName;
    }
    //
    // Language
    //


    //
      @Override
    public void sayGreeting(String string){
   System.out.println("Hello from person class");
}
    //

}