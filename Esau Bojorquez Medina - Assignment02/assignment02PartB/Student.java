/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Student.java
 * Author: Duc Ta
 * Author: Esau Bojorquez Medina
 * **********************************************
 */

package assignment02PartB;
import java.util.InputMismatchException;
import java.util.Scanner; 
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Student extends Person {

    //
    // Instance Data Fields
    //
    private static String name;
    
    private static String studentEmail;
    private String schoolName;
    private static int numOfCards;
    private Card card;
    private static Config config;
   
    

    //
    // Constructors
    //
    public Student() {
    }
    public Student(String firstName, String lastName, String studentEmail, String schoolName){
        super(firstName,lastName);
        this.schoolName = schoolName;
        this.studentEmail = studentEmail;
    }
            
    //
    // Instance Methods
    //
    public String getStudentEmail(){
        return studentEmail;
    }
    public void setStudentEmail(String studentEmail){
        this.studentEmail = studentEmail;
    }
    public String getSchoolName(){
        return this.schoolName;
    }
    public void setSchoolName(String schoolName){
        this.schoolName = schoolName;
    }
    public String getName(){
        return this.name;
       
    }
    public void setName(String name){
        this.name = name;
        
    }
    public Language getConfigLang(){
        config = new Config();
        return config.getLanguage();
    }
        
    //Card
   public void setNumOfCard(int a){
          numOfCards = a; 
   }
   public static boolean isNum(String a) {
    if (a == null) {
       return false;
    }
    try {
        int d = Integer.parseInt(a);
    } catch (NumberFormatException nfe) {
        return false;
    }
    return true;
}
   public int getNumOfCards(){
       return numOfCards;
   }
        
   public void getCards() throws Exception{
       this.card = new Card();
       card.getCards();
      
    }
    

    //
    // Additional Methods
    //

    //
    // Language
    //

    //
    @Override
    public void sayGreeting(){
   System.out.println("Hello from student class");
    }
    //

   
}