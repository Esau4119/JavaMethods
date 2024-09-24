/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Quiz.java
 * Author: Duc Ta
 * Author: Esau Bojorquez Medina
 * **********************************************
 */

package assignment02PartB;
import java.util.Scanner;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Quiz {

    //
    // Instance Data Fields
    //
    private static QuestionAnswer queAns;
    private static Club club;
    private String userInput;
    private static University uni;
    private int limit;
    public Language language;
    //
    // Constructors
    //
    public Quiz() {
    }

    //
    // Instance Methods
    //
    public String displayQuestion(int a){
         if (language.getStringLanguage().equalsIgnoreCase("Alien")){
               return queAns.getQuestions(a);
           }else{
                return club.getShortName()+": "+queAns.getQuestions(a);
           }
       
    }
    public String getAnswers(int a){
        return queAns.getAnswers(a);
    }
    
    public void grade(University university){
        queAns = new QuestionAnswer();
        club = new Club();
        uni = university;
        language = new Language();
        Scanner sc = new Scanner(System.in);
       System.out.println(displayQuestion(0)); 
        this.limit = 0;
        
       for(int i = 1; i <7;i++ ){
           System.out.print(displayQuestion(i));
           if (language.getStringLanguage().equalsIgnoreCase("Alien")){
               System.out.print("\n"+uni.getStudentName());
                System.out.print(": ");
                this.userInput = sc.nextLine();
//                System.out.println();
            if(this.userInput.equalsIgnoreCase(getAnswers(i))){
               
            }else{
               
               this.limit++;
               if(this.limit == 2){
                   break;
               }
           } 
           

           }else{
               System.out.println();
            club.getColor(uni.getStudentName());
            System.out.print(": ");
            this.userInput = sc.nextLine();
            if(this.userInput.equalsIgnoreCase(getAnswers(i))){
               System.out.println(club.getShortName()+": Correct!");
            }else{
               System.out.println(club.getShortName()+": Oops!");
               this.limit++;
               if(this.limit == 2){
                   break;
               }
           } 
                
           }
           
       }
       if (language.getStringLanguage().equalsIgnoreCase("Alien")){
           if(this.limit == 2){
                    System.out.println("~ ąļīæń ~ ~ ąļīæń ~ ~ ąļīæń ~\n~ ąļīæń ~");
                }else{
                    System.out.println("~ ąļīæń ~ ~ ąļīæń ~ ~ ąļīæń ~\n~ ąļīæń ~") ;   

                 }
       }else{
        if(this.limit == 2){
                System.out.println("____ Please try again at your graduation ceremony. ____");
             }else{
                System.out.println("*** Congrats! You won FREE TICKETS to SF GIANTS Games ***") ;   
        } 
       }
       
    
       
    }
    //
    // Additional Instance Methods
    //

    //
    // Language
    //
}