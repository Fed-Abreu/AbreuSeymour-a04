package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution41 {
    public List<String> readName(Scanner input, List<String>name){
        //Read in the names with an ArrayList using a while loop and add to list
        while (input.hasNextLine()){
            name.add(input.nextLine());
        }

        return name;
    }

    public List<String> outputName(List<String> name) throws IOException {
        //Output names to exercise41_output.txt
        try (FileWriter output = new FileWriter("data/exercise41_output.txt")) {

            //Display Total of 'SIZE' names
            output.write("Total of " + name.size() + " names\n");
            //Display -----------------
            output.write("-----------------\n");

            //for each name write names
            for (String n : name) {
                output.write(n + "\n");
            }

        }
        return name;
    }

    public static void main(String[] args) throws FileNotFoundException {
        Solution41 sol = new Solution41();
        Scanner inputFile = new Scanner(new File("data/exercise41_input.txt"));
        ArrayList<String> name = new ArrayList<>();

        sol.readName(inputFile, name);

        //Sort the names using sort function
        name.sort(String.CASE_INSENSITIVE_ORDER);

        //Catch any exception
        try {
            sol.outputName(name);
        }catch (Exception e){
            System.out.print("Could not output file.");
        }


    }
}
