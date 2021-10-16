package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
@SuppressWarnings("ResultOfMethodCallIgnored")
public class Solution43 {
    String siteName;
    String author;
    String path;

    public  String createWebsite(){
        //Make directory = path + Site name
        String directory = path + siteName;
        //create a new folder = file directory
        File folder = new File(directory);

        folder.mkdir();
        return directory;
    }
    public String createJAVAFolder(){
        //Make directory = path + Site name + js
        String directory = path + siteName + "/js/";
        //create a new folder = file directory
        File folder = new File(directory);

        folder.mkdir();
        return directory;
    }
    public String createCSSFolder(){
        //Make directory = path + Site name + css
        String directory = path + siteName + "/css/";
        //create a new folder = file directory
        File folder = new File(directory);

        folder.mkdir();
        return directory;
    }
    public String createHMTL(){
        //Make directory = path + Site name + index.html
        String directory = path + siteName + "/index.html";
        //Put content of <title> + siteName + </title> <meta> + author </meta> inside file
        String html =  "<title> " + siteName + " </title>\n<meta> " + author + " </meta>";
        //create a new file
        File file = new File(directory);
        // Write file and catch exceptions
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(file))){
            writer.write(html);
            return directory;
        }catch(Exception e){
            return "Error";
        }
    }

        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            Solution43 sol = new Solution43();
        //Display Site Name: and Scan String
            System.out.print("Site name: ");
            String siteName = input.nextLine();

        //Display Author: and Scan String
            System.out.print("Author: ");
            String author = input.nextLine();

        //Display Do you want folder for JavaScript? and Scan String
            System.out.print("Do you want a folder for JavaScript? ");
            String javaScript = input.nextLine();

        //Display Do you want a folder for CSS? Scan String
            System.out.print("Do you want a folder for CSS? ");
            String css = input.nextLine();

        //Create new folder and set values
            String website = "data/website";
            File folder = new File(website);
            folder.mkdir();

            sol.siteName = siteName;
            sol.author = author;
            sol.path = "./data/website/";

        //Display Created "website" and Created: "HTML"
            String create = "Created ";
            System.out.println(create + sol.createWebsite());
            System.out.println(create + sol.createHMTL());
        //if JAVAFolder = to y then Display Created: "JAVA"
            if(javaScript.equals("y"))
                System.out.println(create + sol.createJAVAFolder());

            //if CSSFolder = to y then Display Created: "CSS"
            if(css.equals("y"))
                System.out.println(create + sol.createCSSFolder());


        }
}
