/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Card.java
 * @author: Duc Ta
 * @author: Esau Bojorquez Medina
 * **********************************************
 */

package assignment02PartB;
import java.util.ArrayList;
import java.util.Scanner;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Card {

    //
    // Instance Data Fields
    //
    private int artSize = 8;     // Please change artSize, if needed, to get an identical output
    private String artFont = "Arial"; // Please change artFont, if needed, to get an identical output
    private SFGiantsCardGenerator sfgcg; 
    private Color color;
    private Student student;
    private static ArrayList<String> cardList = new ArrayList<>();;
    
    
    
    //
    // Constructors
    //
    public Card() {
    }
         

    //
    // Instance Methods
    //

    //
    // Additional Instance Methods
    //
    public void getCards() throws Exception{
       Scanner sc = new Scanner(System.in);
       this.color = new Color();
       this.student = new Student();
       // Using this if else i am able to switch between alien language and english.
       if(student.getConfigLang().getStringLanguage().equalsIgnoreCase("alien")){
        System.out.print(student.getConfigLang().populateAlienPhrases()+student.getConfigLang().populateAlienPhrases() +", 28" +": "+student.getConfigLang().populateAlienPhrases()+"\n");
        //This loop is used to display the card menu part as many times as the user needs.
        for (int i = 0; i < this.student.getNumOfCards();i++ ){
            System.out.println(student.getConfigLang().populateAlienPhrases()+student.getConfigLang().populateAlienPhrases() +", 28" +": "+student.getConfigLang().populateAlienPhrases()+ (i+1) +student.getConfigLang().populateAlienPhrases());
            System.out.print(this.student.getName()+": [1] ");
            cardList.add(sc.nextLine());
            System.out.print(student.getName()+": [2] ");
            cardList.add(sc.nextLine());
            System.out.print(student.getName()+": [3] ");
            cardList.add(sc.nextLine());  
    }
        System.out.println(student.getConfigLang().populateAlienPhrases()+student.getConfigLang().populateAlienPhrases() +", 28" +": "+student.getConfigLang().populateAlienPhrases()+student.getConfigLang().populateAlienPhrases()+this.student.getName()+student.getConfigLang().populateAlienPhrases()+"\n");
        generateCards();
        
       }else{
            System.out.println("Buster Posey, 28: In 3 lines, please provide");
            System.out.println("   [1] Recipient name \n   [2] Art symbol (a character) \n   [3] Message to recipient");
       
       for (int i = 0; i < this.student.getNumOfCards();i++ ){
            System.out.println("Buster Posey, 28: Card #"+ (i+1) +":");
            this.color.colorText(this.student.getName());
            System.out.print(": [1] ");
            cardList.add(sc.nextLine());
            this.color.colorText(this.student.getName());
            System.out.print(": [2] ");
            cardList.add(sc.nextLine());
            this.color.colorText(this.student.getName());
            System.out.print(": [3] ");
            cardList.add(sc.nextLine()); 
       
    }
       System.out.println("Buster Posey, 28: Thanks, Duc. Please confirm your order:\n");
       generateCards();
         }
       }
       
       
       // This method is used to make the acutal thank you cards. 
    public void generateCards() {
        Scanner sc = new Scanner(System.in);
        while (cardList.size() >= 3){ 
            try{
                SFGiantsCardGenerator.generateSFGiantsCard(cardList.get(0), cardList.get(2), student.getName(), this.student.getStudentEmail(), cardList.get(1).charAt(0) , this.artSize, this.artFont);
            }catch(Exception  e){
                System.out.println("Error made my me");
            }
            
            System.out.println();
            cardList.remove(0);
            cardList.remove(0);
            cardList.remove(0);
            
        }
        
        if(student.getConfigLang().getStringLanguage().equalsIgnoreCase("alien")){
            System.out.print(student.getName()+": ");
            sc.nextLine();
            System.out.println(student.getConfigLang().populateAlienPhrases()+student.getConfigLang().populateAlienPhrases() +", 28" +": "+student.getConfigLang().populateAlienPhrases()+student.getConfigLang().populateAlienPhrases()+this.student.getName()+student.getConfigLang().populateAlienPhrases());
         
        }else{
        this.color.colorText(this.student.getName());
            System.out.print(": ");
            sc.nextLine();
            System.out.print("Buster Posey, 28: Thank you again, ");
            this.color.colorText(this.student.getName());
            System.out.println(" See you at your graduation ceremony!");  
        }
       
    }
  

    //
    // Language
    //

}
