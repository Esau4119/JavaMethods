/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Color.java
 * @author: Duc Ta
 * @author: Esau Bojorquez Medina
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Color {

    //
    // Static Data Fields
    //
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
   
    
    //
    // Instance Data Fields
    //
    private String text;
    private Language lang;
    //
    // Constructors
    //
    public Color (){
        
    }
    public void colorText(String text){
        this.text = text;
        System.out.print( ANSI_PURPLE_BACKGROUND + ANSI_YELLOW + this.text);
        System.out.print( ANSI_RESET);
    }

    //
    // Static Methods
    //

    //
    // Instance Methods
    //
public String getColorSequences() {
    lang = new Language();
    if (lang.getStringLanguage().equalsIgnoreCase("Alien")){
        return lang.populateAlienPhrases();
    }else{
        return("ANSI");
    }
        
    }
    //
    // Language
    //
}