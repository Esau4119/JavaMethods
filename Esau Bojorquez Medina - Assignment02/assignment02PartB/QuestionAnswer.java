/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: QuestionAnswer.java
 * Author: Duc Ta
 * Author: Esau Bojorquez Medina
 * **********************************************
 */

package assignment02PartB;
// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

public final class QuestionAnswer {

    //
    // Instance Data Fields
    //
    
    public Language language;
    //
    // Constructors
    //
    public QuestionAnswer() {
    }

    //
    // Instance Method
    //
    public String getQuestions(int a){
        language = new Language();
        if (language.getStringLanguage().equalsIgnoreCase("Alien")){
            String[] alienQs = {"","~ ąļīæń ~ ~ ąļīæń ~ ~ ąļīæń ~\n~ ąļīæń ~ ~ ąļīæń ~ ~ ąļīæń ~",
                "~ ąļīæń ~ ~ ąļīæń ~ ~ ąļīæń ~\n~ ąļīæń ~ ~ ąļīæń ~ ~ ąļīæń ~","~ ąļīæń ~ ~ ąļīæń ~ ~ ąļīæń ~\n~ ąļīæń ~ ~ ąļīæń ~ ~ ąļīæń ~",
            "~ ąļīæń ~ ~ ąļīæń ~ ~ ąļīæń ~\n~ ąļīæń ~ ~ ąļīæń ~ ~ ąļīæń ~","~ ąļīæń ~ ~ ąļīæń ~ ~ ąļīæń ~\n~ ąļīæń ~ ~ ąļīæń ~ ~ ąļīæń ~",
            "~ ąļīæń ~ ~ ąļīæń ~ ~ ąļīæń ~\n~ ąļīæń ~ ~ ąļīæń ~ ~ ąļīæń ~",};
            return alienQs[a];
        }else{
            String[] questions = {"*** FREE TICKETS to SF GIANTS Games *** _ 1 miss allowed _","Which type of class has 'protected' constructors?",
                "What type of method did Java 8 add to 'interface'?","What new keyword did Java 13 add to 'switch' statement?",
                "In Java 15, what keyword pairs with 'sealed'?"," Giants in Spanish?","Take me out to the...?"};
            return questions[a];
        }
        
        
    }
    public String getAnswers(int a){
        String[] answers = {"","abstract","default","yield","permits","Gigantes","Ball Game"};
        return answers[a];
    }
    //
    // Language
    //

    //
    // Override
    //
}