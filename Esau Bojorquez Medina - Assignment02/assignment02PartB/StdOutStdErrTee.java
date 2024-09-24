/*
 * **********************************************
 * San Francisco State University
 * CSC 220 -  Data Structures
 * File Name: StdOutStdErrTee.java
 * Author: Duc Ta
 * Author: Esau Bojorquez Medina
 * **********************************************
 */

package assignment02PartB;
    package assignment02PartB.Config;

// Please organize all the given files in 1 same package
// Please make sure to read the provided "_ListOf-PleaseDoNotChange.txt"

import java.io.*;

public class StdOutStdErrTee extends OutputStream {

    //
    // Instance Data Fields
    //
    private String stdOutFilePath;
    private String stdErrFilePath;
    private OutputStream[] streamsToConsoleToFile;
    private static Config config;
    

    //
    // Constructors
    //
    public StdOutStdErrTee() {
        //
        // Add code which our own implementation needs
        //
        
       
            this.stdOutFilePath = assignment02PartB.Config.getDefaultStdOutFilePath();
            this. stdErrFilePath = assignment02PartB.Config.getDefaultStdErrFilePath();
        
        
        
    }

    public StdOutStdErrTee(PrintStream printStream, FileOutputStream fileOutputStream) {
        this.streamsToConsoleToFile = new OutputStream[2];
        streamsToConsoleToFile[0] = printStream;
        streamsToConsoleToFile[1] = fileOutputStream;
    }

    public StdOutStdErrTee(String stdOutFilePath, String stdErrFilePath) {
        this.stdOutFilePath = stdOutFilePath;
        this.stdErrFilePath = stdErrFilePath;
    }
    public String getStdOutFilePath(){
        config = new Config();
        if(config.getLanguage().getStringLanguage().equalsIgnoreCase("Alien")){
            return config.getLanguage().populateAlienPhrases();
        }else{
        return stdOutFilePath;
        }
    }
    public String getStdErrFilePath(){
        if(config.getLanguage().getStringLanguage().equalsIgnoreCase("Alien")){
            return config.getLanguage().populateAlienPhrases();
        }else{
        return this.stdErrFilePath;
        }
        
    }

    //
    // Instance Methods
    //
    public void startLog() {
        try {
            FileOutputStream stdOutFile = new FileOutputStream(new File(this.stdOutFilePath));
            FileOutputStream stdErrFile = new FileOutputStream(new File(this.stdErrFilePath));

            StdOutStdErrTee allStdOut = new StdOutStdErrTee(System.out, stdOutFile);
            StdOutStdErrTee allStdErr = new StdOutStdErrTee(System.err, stdErrFile);

            PrintStream stdOut = new PrintStream(allStdOut);
            PrintStream stdErr = new PrintStream(allStdErr);

            System.setOut(stdOut);
            System.setErr(stdErr);

        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }
    }

    public static void stopLog() {
        //
        // Add code which our own implementation needs
        //
    }

    //
    // Override
    //
    @Override
    public void write(int b) throws IOException {
        for (OutputStream out : this.streamsToConsoleToFile) {
            out.write(b);
            out.flush();
        }
    }
}