/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: Club.java
 * @author: Duc Ta
 * @author: Esau Bojorquez Medina
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class Club extends Organization {

    //
    // Instance Data Fields
    //
   private String name;
   private String address;
    private String shortName;
    private int estabDate;
    private String clubColors;
    private String park;
    private int numOfWST;
    private int nlPennants;
    private int divisonTitles;
    private int wildCardBerths;
    private Player posey; 
    private static String officialSong;
    private static FrontOffice frontOffice;
    private OwnerGroup ownergroup;
    private Language language;
    private static Config config;
    
  
    
    
    
    //
    // Constructors
    //
    public Club() {
    this.name = "San Francisco Giants";
    this.shortName ="SF Giants";
    this.estabDate = 1883;
    this.clubColors = "Orange, Black, Gold, Cream";
    this.park= "Oracle Park ";
    this.numOfWST = 8;
    this.nlPennants = 23;
    this.divisonTitles = 8;
    this.wildCardBerths = 3;
    Club.officialSong = "Take Me out to the Ball Game";
    }
    public Club(String name){  
        this.name = name;
        this.shortName ="SF Giants";
        this.estabDate = 1883;
        this.clubColors = "Orange, Black, Gold, Cream";
        this.park= "Oracle Park ";
        this.numOfWST = 8;
        this.nlPennants = 23;
        this.divisonTitles = 8;
        this.wildCardBerths = 3;
        Club.officialSong = "LALALA";
    }

    //
    // Static Methods
    //
public static String getOfficialSong(){
        return Club.officialSong;
    }

    //
    // Instance Methods
    //
    public String getName(){
        return this.name;
    }public String getShortName(){
        return this.shortName;
    }public int getEstabDate(){
        return this.estabDate;
    }public String getClubColor(){
        return this.clubColors;
    }public String getPark(){
        return this.park;
    }public int getNumOfWST(){
        return this.numOfWST;
    }public int getNlPennants(){
        return this.nlPennants;
    }public int getDivisonTitles(){
        return this.divisonTitles;
    }public int getWildCardBerths(){
        return this.wildCardBerths;
    }
    
    public void setName( String name ){
        this.name = name;
    }
    public void setShortName( String shortName ){
        this.shortName = shortName;
    }
    public void setEstabDate( int estabDate ){
        this.estabDate = estabDate ;
    }
    public void setClubColors( String clubColors ){
        this.clubColors = clubColors ;
    }
    public void setPark( String park){
        this.park = park;
    }
    public void setNumOfWST( int numOfWST){
        this.numOfWST = numOfWST;
    }
    public void setNlPennants( int nlPennants ){
        this.nlPennants = nlPennants;
    }
    public void setDivisonTitles( int divisonTitles){
        this.divisonTitles = divisonTitles;
    }
    public void setWildCardsBerths( int wildCardBerths){
        this.wildCardBerths = wildCardBerths;
    }
    //
    // Additional Instance Methods
    //
    // color class
    public void getColor(String a){
        config = new Config();
         config.getColor().colorText(a);
    }
    //From Front office class using object
     public String getGeneralManagerName(){
        return frontOffice.getGeneralManagerFirstName()+" "+frontOffice.getGeneralManagerLastName();
    }
    public String getManagerName(){
        return frontOffice.getManagerFirstName()+" "+frontOffice.getGeneralManagerLastName();
    }
    public String getPresidentName(){
        frontOffice = new FrontOffice();
        return frontOffice.getPresidentFirstName()+" "+frontOffice.getPresidentLastName();
    }
    
    //From Owner Group class using object
    public String getOwnerGroup(){
        ownergroup = new OwnerGroup();
        return this.ownergroup.getOwnerGroup();
    }
    // trying to display club info
    public void displayClubinfo(){
        this.language = new Language();
        if (this.language.getStringLanguage().equalsIgnoreCase("Alien")){
            
        System.out.println(this.language.getClubPhrase(2));
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(2),  this.language.populateAlienPhrases());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(3) , this.language.populateAlienPhrases());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(4),  " "+this.getEstabDate());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(5),  this.language.populateAlienPhrases()+","+this.language.populateAlienPhrases()+","+this.language.populateAlienPhrases()+","+this.language.populateAlienPhrases());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(6),  this.language.populateAlienPhrases());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(7)," "+ this.getNumOfWST());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(8), " "+ this.getNlPennants());;
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(9), " "+ this.getDivisonTitles());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(10), " "+this.getWildCardBerths());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(11), this.language.populateAlienPhrases());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(12), this.language.populateAlienPhrases()+this.language.populateAlienPhrases());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(13), this.language.populateAlienPhrases()+this.language.populateAlienPhrases());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(14), this.language.populateAlienPhrases()+this.language.populateAlienPhrases());
        System.out.println(this.language.getClubPhrase(2));
        }else{
          this.language.getClubPhrase(1);
        System.out.println(this.language.getClubPhrase(1));
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(2), this.getName());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(3) , this.getShortName());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(4), this.getEstabDate());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(5), this.getClubColor());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(6), this.getPark());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(7), this.getNumOfWST());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(8), this.getNlPennants());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(9), this.getDivisonTitles());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(10), this.getWildCardBerths());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(11), this.getOwnerGroup());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(12), this.getPresidentName());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(13), this.getGeneralManagerName());
        System.out.printf("%-25s %-50s %n",this.language.getClubPhrase(14), this.getManagerName());   
        System.out.println(this.language.getClubPhrase(1));   
        }
       
    }
    
    //
    // Language
    //
   

    @Override
    public void displayMission() {
       
    }

   
    @Override
    public void displayAbout(){
    
    }
    

    
    
    
  
}