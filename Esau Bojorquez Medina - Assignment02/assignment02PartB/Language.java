/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Language.java
 * @author: Duc Ta
 * @author: Esau Bojorquez Medina
 * **********************************************
 */

package assignment02PartB;
import java.util.Scanner;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

// java.util.ResourceBundle
// - ResourceBundle is a valid approach to internalization.
// - ResourceBundle is not required.
// - Other approaches to internalization are available. Some of these approaches are
// more straightforward and more relevant to new CSC 220 students then ResourceBundle is.
// - Yet, curiosity for intelligence is always highly encouraged:
// https://docs.oracle.com/en/java/javase/16/docs/api/java.base/java/util/ResourceBundle.html

public final class Language {
    //
    // Static Data Fields
    //
    private static String language;
    private static Language lang;
    private static Config config;
    
    //
    // Instance Data Fields
    //
    
    private University univercity;
    private Club club;
    
    
    //
    // Constructors
    //
    public Language() {
//        this.language = config.getDefaultLanguage(); 
        this.univercity = new University();
        this.club = new Club();
      
    }
    
    public Language( String language) {
           this.language = language;
        this.univercity = new University();
        this.club = new Club();
        if (this.language.equalsIgnoreCase("English")) {         // Supported
            this.populateEnglishPhrases();
//        } else if (language.equalsIgnoreCase("Chinese")) {  // Future implementation
//            this.populateChinesePhrases();
//        } else if (language.equalsIgnoreCase("French")) {   // Future implementation
//            this.populateFrenchPhrases();
//        } else if (language.equalsIgnoreCase("Spanish")) {  // Future implementation
//            this.populateSpanishPhrases();
        } else if (language.equalsIgnoreCase("Alien")) {    // Supported
            this.populateAlienPhrases();
        } //else {
//            this.populateYourLanguagePhrases();             // Future implementation
//        }
    }

    //
    // Static Methods
    //
   
    public static String populateAlienPhrases(){
        return " ~ ąļīæń ~ ";
    }
    
    //
    // Additional Static Methods
    //
//    public String populateChinesePhrases(){
//        return "";
//      
//    }
//    public String populateFrenchPhrases(){
//        return "";
//      
//    }
//    public String populateSpanishPhrases(){
//        return "";
//      
//    }
//    public String populateYourLanguagePhrases(){
//        return "";
//   
//    }
    
    // config stuff
    public static Language setLanguagePreference(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Language: ");
        language = sc.nextLine();
        
        if (language.equalsIgnoreCase("English")||language.equalsIgnoreCase("Alien")){
            
        }else{
        while (!language.equalsIgnoreCase("English")||!language.equalsIgnoreCase("Alien")){
            System.out.print("Language: ");
            System.out.println("UNSUPPORTED language. Please enter your language.");
            System.out.print("Language: ");
            System.out.println("English or Alien");
            System.out.print("Language: ");
            language = sc.nextLine();
            if (language.equalsIgnoreCase("English")||language.equalsIgnoreCase("Alien")){
                break;
            }
        }
            
        }
        lang = new Language(language);
        return lang;
    }
    public static void displayAppHeader(){
      System.out.println(Config.getOfficialAppHeader());
      
    }
    public String getUniversityPhrase(int a){
        if(language.equalsIgnoreCase("Alien")){
            String[] uniAlienPhrases = {" ~ ąļīæń ~","-".repeat(70),"~ ąļīæń ~","~ ąļīæń ~","~ ąļīæń ~","~ ąļīæń ~",
            "~ ąļīæń ~","~ ąļīæń ~","~ ąļīæń ~","~ ąļīæń ~",
            "~ ąļīæń ~","~ ąļīæń ~","~ ąļīæń ~","~ ąļīæń ~","~ ąļīæń ~"};
            return uniAlienPhrases[a];
                
        }else{
                String[] uniPhrases = {univercity.getName(),"-".repeat(70),"Official Name:","Motto in Latin:","Motto in English:","Type:",
            "Year of Establishment:","Location:","Address:","Colors:",
            "Nickname:","Mascot:","President:","Website:"};
            return uniPhrases[a];
        }
        
    }
    public String getClubPhrase(int a){
        if(language.equalsIgnoreCase("Alien")){
            String[] clubAlienPhrases = {" ~ ąļīæń ~","-".repeat(70),"~ ąļīæń ~","~ ąļīæń ~","~ ąļīæń ~","~ ąļīæń ~",
            "~ ąļīæń ~","~ ąļīæń ~","~ ąļīæń ~","~ ąļīæń ~",
            "~ ąļīæń ~","~ ąļīæń ~","~ ąļīæń ~","~ ąļīæń ~","~ ąļīæń ~"};
            return clubAlienPhrases[a];
                
        }else{
            String[] clubPhrases = {club.getName(),"-".repeat(70),"Club:","Short Name:","Established in:","Colors: ",
            "Ballpark: ","World Series Titles:","NL Pennants:","Division Titles:",
            "Wild Card Berths:","Owners: ","President:","General Manager: ","Manager:"};
            return clubPhrases[a];
        }
    }
    public String getPlayerPhrase(int a){
      
        if(language.equalsIgnoreCase("Alien")){
            String[] playerAlienPhrases = {"-".repeat(70),"~ ąļīæń ~","~ ąļīæń ~","~ ąļīæń ~","~ ąļīæń ~",
            "~ ąļīæń ~","~ ąļīæń ~","~ ąļīæń ~",};
            return playerAlienPhrases[a];
                
        }else{
            String[] playerPhrases = {"-".repeat(70),"Player:","Club:","Position:","Number:",
            "Bats:","Throws:","MLB Debut: "};
            return playerPhrases[a];
        }
    }

    //
    // Instance Methods
    //
    public String getLanguage(){
      if(language.equalsIgnoreCase("Alien")){
          return populateAlienPhrases();
      }else{
          return "English";
      }
        
    }
    public String getStringLanguage(){
        return language;
    }
 public String populateEnglishPhrases(){
     
        return "" ;
      
    }
 public static String getGreetingPhrase(int a){
     return "";
 }
 public static String getConfigPhrase(int a){
     if(language.equalsIgnoreCase("Alien")){
         String[]configAlienPhrases = {"~ ąļīæń ~","~ ąļīæń ~", "~ ąļīæń ~",
        "~ ąļīæń ~","~ ąļīæń ~", "~ ąļīæń ~",
        "~ ąļīæń ~","~ ąļīæń ~", "~ ąļīæń ~", "~ ąļīæń ~"
    };
         return configAlienPhrases[a];
     }else{ 
         String[]configPhrases = {"-".repeat(70),"Language: ", "Time Zone:",
        "Color Sequences:","Standard Output Log:", "Standard Error Log:",
        "Receipt Log:","Receipt-*-*.log", "Default University:", "Default Club:"
    };
     return configPhrases[a];
     }
    
   
 }
    //
    // Language
    //
}