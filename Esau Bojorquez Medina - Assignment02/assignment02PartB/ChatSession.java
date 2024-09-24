/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: ChatSession.java
 * @author: Duc Ta
 * @author: Esau Bojorquez Medina
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public final class ChatSession {

private static Student student;
    //  Static Data Fields

private static Club club;
private static University university;
private static Timer t;
private static Language language;
private static Quiz quiz;

    //
    // Instance Data Fields
    //
private Player posey;

    //
    // Constructors
    //
    public ChatSession(Club club, University university) {
         this.club = club;
         this.university = university;
         posey = new Player();
         language = new Language();
         student = new Student();
    }

    //
    // Instance Methods
    //
   
    //
    // Additional Instance Methods
    //
    private void startChatSession() {
        Scanner sc = new Scanner(System.in);
         if (language.getStringLanguage().equalsIgnoreCase("Alien")){
            System.out.print(t);
            System.out.println(language.populateAlienPhrases()+"\n");
            System.out.println(language.populateAlienPhrases()+language.populateAlienPhrases()+language.populateAlienPhrases()+language.populateAlienPhrases());
            club.displayClubinfo();
            System.out.print("\n"+language.populateAlienPhrases()+language.populateAlienPhrases()+language.populateAlienPhrases()+" ");
            university.setStudentName(sc.nextLine());
            System.out.print(language.populateAlienPhrases()+language.populateAlienPhrases()+language.populateAlienPhrases()+" ");
            university.setStudEmail(sc.nextLine());
            System.out.println(university.getStudentName()+":"+language.populateAlienPhrases());
            university.displayUniInfo();
            System.out.println("\n"+language.populateAlienPhrases()+language.populateAlienPhrases()+language.populateAlienPhrases()); 
         }else{
            System.out.print(t);
            System.out.println(" - Chat session started.\n");
            System.out.println(club.getShortName() + ": Welcome to the SAN FRANCISCO GIANTS!");
            club.displayClubinfo();
            System.out.print(club.getShortName() + ": Your first name and last name, please: ");
            university.setStudentName(sc.nextLine());
            System.out.print(club.getShortName() + ": Your school email address, please: ");
            university.setStudEmail(sc.nextLine());
            club.getColor(university.getStudentName());
            System.out.print(": ");
            sc.nextLine();
            
            
            university.displayUniInfo();
            System.out.println("\n"+club.getShortName()+": Thank you. We are connecting you with our ...");
         }
        
        for (int i = 0; i < 5; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(". ");
        }; 
    }
    private void connectChatters() {
        System.out.println();
        posey.displayPlayerInfo();
        for (int i = 0; i < 5; i++) {
            try {
                TimeUnit.SECONDS.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(". ");
        };
        
    }
    private void chat() {
        Scanner sc = new Scanner(System.in);
         if (language.getStringLanguage().equalsIgnoreCase("Alien")){
            System.out.println("\n"+language.populateAlienPhrases()+language.populateAlienPhrases() + ", "+ posey.getPlayerNum() +": "+language.populateAlienPhrases() +" " + university.getStudentName() + language.populateAlienPhrases() );
            System.out.print(language.populateAlienPhrases()+language.populateAlienPhrases() +", "+posey.getPlayerNum() +": "+language.populateAlienPhrases()+language.populateAlienPhrases()+"\n");
            
            System.out.print(university.getStudentName()+": ");
            sc.nextLine();
            System.out.println(language.populateAlienPhrases()+language.populateAlienPhrases() + ", "+ posey.getPlayerNum() +": "+language.populateAlienPhrases()+language.populateAlienPhrases() +" " + university.getStudentName() + language.populateAlienPhrases() );
            System.out.print(language.populateAlienPhrases()+language.populateAlienPhrases() +", "+posey.getPlayerNum() +": "+language.populateAlienPhrases()+"\n");
            
         }else{
        System.out.println("\n"+posey.getName() + ", "+posey.getPlayerNum()+": Hello " + university.getStudentName() + " C-O-N-G-R-A-T-U-L-A-T-I-O-N-S!");
        System.out.print(posey.getName()+", "+posey.getPlayerNum()+": ");
        club.getColor(("SAN FRANCISCO STATE UNIVERSITY"));
         System.out.println(". Way to go!");
        club.getColor(university.getStudentName());
        System.out.print(": ");
        sc.nextLine();
        System.out.println(posey.getName()+", " + posey.getPlayerNum() + ": Likewise, " + university.getStudentName()+ " Very nice chatting w/ you.");
        System.out.println(posey.getName()+", " + posey.getPlayerNum() + ": How many SF Giants Thank You cards would you like to order?");
       
         }
        
        int num =0;
        String numString = "";
        int tries = 3;
          
        do{
            if (language.getStringLanguage().equalsIgnoreCase("Alien")){
                System.out.print(university.getStudentName()+": ");
            }else{
                     
                club.getColor(university.getStudentName());
                System.out.print(": ");
            }
                numString = sc.nextLine();
            try{
                if(student.isNum(numString)){
                    num = Integer.parseInt(numString);
                    student.setNumOfCard(num);
                    break;
                }else{
                    throw new NumberFormatException();
                }
           
            }catch(NumberFormatException e ){
                if(tries == 0){
                    student.setNumOfCard(1);
                    break;
                }
            System.out.println("Please enter an INTEGER. "+ tries    +" tries left. \njava.util.InputMismatchException");
            System.out.println(posey.getName()+", " + posey.getPlayerNum() + ": How many SF Giants Thank You cards would you like to order?");
            tries--;
            
            }   
        }while(tries >= 0);
                       
        
        try{
            student.getCards(); 
        }catch(Exception  e){
            System.out.println("Error made my me");
        }
        
    }
    private void runQuiz() {
        quiz = new Quiz();
        quiz.grade(university);
    }
    private void stopChatSession() {
        if (language.getStringLanguage().equalsIgnoreCase("Alien")){
        System.out.print(t);
        System.out.println(language.populateAlienPhrases());
         }else{
        System.out.print(t);
        System.out.println(" - Chat session ended.");
         }
        
    }
    
    public void runChatSession(){ 
       t = new Timer();
       startChatSession();
       connectChatters();
       chat();
       runQuiz();
       stopChatSession(); 
 
    }

    //
    // Language
    //
}