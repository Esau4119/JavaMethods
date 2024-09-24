/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Player.java
 * Author: Duc Ta
 * Author: Esau Bojorquez Medina
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Player extends Person {

    // Instance Data Fields
    private String firstName;
    private String lastName;
    private String teamName;
    private String playerNum;
    private String position;
    private String battingPos;
    private String throwingPos;
    private int debutDate;
    private static int numOfPlayers = 0;
    private Language language;
    //
    // Constructors
    //
    public Player() {
        this.firstName = "Buster";
        this.lastName = "Posey";
        this.teamName = "San Francisco Giants";
        this.playerNum = "28";
        this.position = "Catcher";
        this.battingPos = "Right";
        this.throwingPos = "Right";
        this.debutDate = 2009;
                
        Player.numOfPlayers++;
        
    }
    public Player(String firstName, String lastName, String teamName, String playerNum, String position, String battingPos, String throwingPos, int debutDate) {
        super(firstName,lastName);
        this.teamName = teamName;
        this.playerNum = playerNum;
        this.position = position;
        this.battingPos = battingPos;
        this.throwingPos = throwingPos;
        this.debutDate = debutDate;
        Player.numOfPlayers++;
        
        
    }

    //
    // Instance Methods
    //
    public String getName(){
        return this.firstName+" "+this.lastName;
    }
   
    public String getTeamName(){
        return this.teamName;
    }
    public String getPlayerNum(){
        return this.playerNum;
    }
    public void setPlayerNum(String playerNum){
        this.playerNum = playerNum;
    }
     public String getPosition(){
        return this.position;
    }
    public void setPosition(String position){
        this.position = position;
    }
    public String getBattingPos(){
        return this.battingPos;
    }
    public void setBattingPos(String battingPos){
        this.battingPos = battingPos;
    }
     public String getThrowingPos(){
        return this.throwingPos;
    }
    public void setThrowingPos(String throwingPos){
        this.throwingPos = throwingPos;
    }
     public String getDebutDate(){
        return this.teamName;
    }
    public void setDebutDate(int debutDate){
        this.debutDate = debutDate;
    }
    //
    // Additional Instance Methods
    //
    
    public void displayPlayerInfo(){
        this.language = new Language();
        if (this.language.getStringLanguage().equalsIgnoreCase("Alien")){
            this.language.getPlayerPhrase(0);
            
            System.out.printf("%-25s %-50s %n",this.language.getPlayerPhrase(1),  this.language.populateAlienPhrases()+ this.language.populateAlienPhrases());
            System.out.printf("%-25s %-50s %n",this.language.getPlayerPhrase(2) , this.language.populateAlienPhrases());
            System.out.printf("%-25s %-50s %n",this.language.getPlayerPhrase(3),  this.language.populateAlienPhrases());
            System.out.printf("%-25s %-50s %n",this.language.getPlayerPhrase(4),  " " + this.getPlayerNum());
            System.out.printf("%-25s %-50s %n",this.language.getPlayerPhrase(5),  this.language.populateAlienPhrases());
            System.out.printf("%-25s %-50s %n",this.language.getPlayerPhrase(6),  this.language.populateAlienPhrases());
            System.out.printf("%-25s %-50s %n",this.language.getPlayerPhrase(7), " " + this.getDebutDate());       
            
        }else{
            this.language.getPlayerPhrase(0);
            System.out.println(this.language.getPlayerPhrase(0));
            System.out.printf("%-25s %-50s %n",this.language.getPlayerPhrase(1), this.getName());
            System.out.printf("%-25s %-50s %n",this.language.getPlayerPhrase(2) , this.getTeamName());
            System.out.printf("%-25s %-50s %n",this.language.getPlayerPhrase(3), this.getPosition());
            System.out.printf("%-25s %-50s %n",this.language.getPlayerPhrase(4), this.getPlayerNum());
            System.out.printf("%-25s %-50s %n",this.language.getPlayerPhrase(5), this.getBattingPos());
            System.out.printf("%-25s %-50s %n",this.language.getPlayerPhrase(6), this.getThrowingPos());
            System.out.printf("%-25s %-50s %n",this.language.getPlayerPhrase(7), this.getDebutDate());
            System.out.println(this.language.getPlayerPhrase(0));   
            }
        }
    
    public int getNumOfPlayers(){
        return this.numOfPlayers;
    }
    public void setNumOfPlayers(int numOfPlayers){
        this.numOfPlayers = numOfPlayers;
    }
    //
    // Language
    // use if else to change between languages with toString method to print out. 
   

    //
   @Override
    public void sayGreeting(){
   System.out.println("Hello from player class");
    }
    //
}
