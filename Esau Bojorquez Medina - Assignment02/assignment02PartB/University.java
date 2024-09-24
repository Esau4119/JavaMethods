/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: University.java
 * Author: Duc Ta
 * Author: Esau Bojorquez Medina
 * **********************************************
 */

package assignment02PartB;
package assignment02PartB.Config;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class University extends Organization {
    //
    // Static Data Fields
    //
    
    private String name; 
    private String address;
    private String motto;
    private String mottoInLatin;
    private String typeOfSchool;
    private int dateOfEstab;
    private String location;
    private String colors;
    private String nickName;
    private String mascot;
    private String website;
    private Student student;
    private Language language;
    
    //
    // Instance Data Fields
    //

    //
    // Constructors
    //
    public University() {
        //this.student = new Student();
        this.name = "San Francisco State University ";
        this.address = "1600 Holloway Avenue, San Francisco, CA 94132";
        this.motto = "Experience Teaches";
        this.mottoInLatin = "Experientia Docet";
        this.typeOfSchool = "Public";
        this. dateOfEstab = 1899;
        this.location = "San Francisco, California, United States "; 
        this.colors = "Purple, Gold";
        this.nickName = "Gators";
        this.mascot = "Gator";
        this.website = "www.sfsu.edu";
        
    }
     public University(String name){   
        this.name = name;      
          // this.student = new Student();
        this.address = "1600 Holloway Avenue, San Francisco, CA 94132";
        this.motto = "Experience Teaches";
        this.mottoInLatin = "Experientia Docet";
        this.typeOfSchool = "Public";
        this. dateOfEstab = 1899;
        this.location = "San Francisco, California, United States "; 
        this.colors = "Purple, Gold";
        this.nickName = "Gators";
        this.mascot = "Gator";
        this.website = "www.sfsu.edu";
    }

    //
    // Instance Methods
    //
     //Getters
     public String getName(){
         return this.name;
     }
     public String getMotto (){
         return this.motto ;
     }
     public String getMottoInLatin (){
         return this.mottoInLatin ;
     }
     public String getTypeOfSchool (){
         return this.typeOfSchool ;
     }
     public int getDateOfEstab (){
         return this.dateOfEstab ;
     }
     public String getLocation (){
         return this.location ;
     }
     public String getAddress(){
         return this.address;
     }
     public String getColors (){
         return this.colors ;
     }
     public String getNickName(){
         return this.nickName ;
     }
     public String getMascot (){
         return this.mascot ;
     }
     public String getWebsite (){
         return this.website ;
     }

     
     
    //
    // Additional Methods
    //
     
     //From student class
     public String getStudentName(){
         return this.student.getName();
     }
     public void setStudentName(String name){
         this.student = new Student();
        this.student.setName(name);
     }
      
       public String getStudentEmail(){
         return student.getStudentEmail();
     }
       public void setStudEmail(String email){
        this.student.setStudentEmail(email);
     }
       


       //dislpay uni info
        public void displayUniInfo(){
        this.language = new Language();
        if (this.language.getStringLanguage().equalsIgnoreCase("Alien")){
            this.language.getUniversityPhrase(1);
            System.out.println(this.language.getUniversityPhrase(2));
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(2),  this.language.populateAlienPhrases());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(3) , this.language.populateAlienPhrases());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(4),  this.language.populateAlienPhrases());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(5),  this.language.populateAlienPhrases());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(6),  " "+this.getDateOfEstab());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(7),  this.language.populateAlienPhrases());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(8),  this.language.populateAlienPhrases());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(9),  this.language.populateAlienPhrases()+","+ this.language.populateAlienPhrases());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(10), this.language.populateAlienPhrases());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(11), this.language.populateAlienPhrases());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(12), this.language.populateAlienPhrases());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(13), this.language.populateAlienPhrases());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(14), this.language.populateAlienPhrases());
            System.out.println(this.language.getUniversityPhrase(2));
        }else{
            this.language.getClubPhrase(1);
            System.out.println(this.language.getUniversityPhrase(1));
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(2), this.getName());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(3) , this.getMotto());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(4), this.getMottoInLatin());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(5), this.getTypeOfSchool());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(6), this.getDateOfEstab());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(7), this.getLocation());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(8), this.getAddress());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(9), this.getColors());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(10), this.getNickName());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(11), this.getMascot());
            System.out.printf("%-25s %-50s %n",this.language.getUniversityPhrase(12), this.getWebsite());
            System.out.println(this.language.getUniversityPhrase(1));   
            }
        }
    //
    // Language
    //

    //
    @Override
    public void displayAbout() {
        
    }
    public void displayMission() {
       
    }
    //

    
}