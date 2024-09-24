/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Timer.java
 * @author: Duc Ta
 * @author: Esau Bojorquez Medina
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.TimeZone;


public class Timer {

    //
    // Static Data Fields
    //
       private static DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss [ms ");
       private static DateFormat amPM = new SimpleDateFormat("a ");  
       private static String tZ;
       private static Language lang;
    //
    // Instance Data Fields
    // 
     
       
    //
    // Constructors
    //
       
    public Timer() {  
        if (tZ.equalsIgnoreCase("EST")){
            
            tZ = "EST";
            Timer.dateFormat.setTimeZone(TimeZone.getTimeZone(("America/New_York")));
            
        }else if(tZ.equalsIgnoreCase("CST")||tZ.equalsIgnoreCase("CDT")){
            
            tZ = "CDT";
            Timer.dateFormat.setTimeZone(TimeZone.getTimeZone("America/Chicago"));
            
        }else{
            
            tZ = "PDT";
             Timer.dateFormat.setTimeZone(TimeZone.getTimeZone("America/Los_Angeles"));
             
        }
    }
    
    public Timer(String tZ){
       
    }
           
    //
    // Static Methods
    //
    public String getTimeZoneFormatted(){
        
        if (lang.getStringLanguage().equalsIgnoreCase("Alien")){
            return lang.populateAlienPhrases();
        }else{
            if (tZ.equalsIgnoreCase("EST")){      
             
                 return "Eastern Standard Time not in Day Light Saving";
            
             }else if (tZ.equalsIgnoreCase("CST")||tZ.equalsIgnoreCase("CDT")){
             
                 return "Central Standard Time in Day Light Saving";
            
             }else{
             
                 return "Pacific Standard Time in Day Light Saving " ; 
           
        } 
        }
        
    }
    
    public static Timer setTimeZonePreference(){
        Scanner sc = new Scanner(System.in);
        lang = new Language();
        if (lang.getStringLanguage().equalsIgnoreCase("Alien")){
            System.out.print(lang.populateAlienPhrases());
        }else{
            System.out.print("Time Zone: ");
        }
        tZ = sc.nextLine();
        if (tZ.equalsIgnoreCase("CST")||tZ.equalsIgnoreCase("EST")||tZ.equalsIgnoreCase("PST")||tZ.equalsIgnoreCase("CDT")||tZ.equalsIgnoreCase("PDT")){
             Timer t = new Timer(tZ);

            }else{
            
            while (!tZ.equalsIgnoreCase("CST")||!tZ.equalsIgnoreCase("EST")||!tZ.equalsIgnoreCase("PST")||!tZ.equalsIgnoreCase("CDT")||!tZ.equalsIgnoreCase("PDT")){
            System.out.print("Time Zone: ");
            System.out.println("INVALID time zone. Please enter your time zone.");
            System.out.print("Time Zone: ");
            tZ = sc.nextLine();
            if (tZ.equalsIgnoreCase("CST")||tZ.equalsIgnoreCase("EST")||tZ.equalsIgnoreCase("PST")||tZ.equalsIgnoreCase("CDT")||tZ.equalsIgnoreCase("PDT")){
                break;
                    }
                }
            }
        Timer t = new Timer(tZ);
        return t;
       
    }

    //
    // Additional Static Methods
    //
    //
    // Instance Methods
    //
    public static String getTimeZone(){
       return tZ;
        
    }
    
    public void setTimeZone(String tZ){
        this.tZ = tZ;
    }
    //
    // Additional Instance Methods
    //

    //
    // Language
    //
    @Override
    public String toString() {
        return Timer.dateFormat.format(new Date())+"ms] "+ Timer.amPM.format(new Date())+tZ;
        
    }

}