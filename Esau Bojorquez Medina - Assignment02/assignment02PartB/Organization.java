/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Organization.java
 * Author: Duc Ta
 * Author: <First Name> <Last Name>
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"


//

// Please DO NOT CHANGE this file.

// Please DO NOT CHANGE this file.

// Please DO NOT CHANGE this file.

//

public sealed abstract class Organization permits Club, University, OwnerGroup {

    //
    // Data Fields
    //
    private String name;
    private String address;

    //
    // Constructors
    //
    protected Organization(){
    }

    //
    // Abstract Methods
    //
    public abstract void displayAbout();
    public abstract void displayMission();
}

//

// Please DO NOT CHANGE this file.

// Please DO NOT CHANGE this file.

// Please DO NOT CHANGE this file.

//