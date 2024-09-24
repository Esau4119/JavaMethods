/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: FrontOffice.java
 * Author: Duc Ta
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
public final class FrontOffice {

    //
    // Instance Data Fields
    //
    private GeneralManager generalManager;
    private Manager manager;
    private President president;
    //
    // Constructors
    //
    public FrontOffice() {
        this.generalManager = new GeneralManager();
        this.manager = new Manager();
        this.president = new President();
    }    //
    // Instance Methods
    //
 public String getGeneralManagerFirstName(){
        return generalManager.getFName();
    }
    public String getManagerFirstName(){
        return manager.getFName();
    }
    public String getPresidentFirstName(){
        return president.getFName();
    }
    public String getGeneralManagerLastName(){
        return generalManager.getLName();
    }
    public String getManagerLastName(){
        return manager.getLName();
    }
    public String getPresidentLastName(){
        return president.getLName();
    }
    //
    // Language
    //
}