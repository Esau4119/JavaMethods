/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: OwnerGroup.java
 * Author: Duc Ta
 * Author: Esau Bojorquez Medina
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class OwnerGroup extends Organization{
    //
    // Data fields
    //
    private String owners;
    //
    // Constructors
    //
    public OwnerGroup() {
        owners = "San Francisco Baseball Associates LLC";
    }
     public OwnerGroup(String name, String address){
        super();
    }

    //
    // Instance Methods
    //
     public String getOwnerGroup(){
         return owners;
     }
    //
    
    //

    @Override
    public void displayAbout() {
        
    }
    public void displayMission() {
       
    }
}