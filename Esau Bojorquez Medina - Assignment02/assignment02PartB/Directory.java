/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Directory.java
 * Author: Duc Ta
 * Author: Esau Bojorquez Medina
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Directory {

    //
    // Static Data Fields
    //
    private static Config config;
    
    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    public Directory() {
    }

    //
    // Static Methods
    //
    public static String getPath(){
        config = new Config();
        if (config.getLanguage().getStringLanguage().equalsIgnoreCase("Alien")){
            return config.getLanguage().populateAlienPhrases();
        }else{
             return Config.getDefaultLogDirectoryPath();
        }
            
            
       
    }
    //
    // Instance Methods
    //

    //
    // Language
    //
}
