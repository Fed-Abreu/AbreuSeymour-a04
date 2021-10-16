package baseline;

import java.io.File;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution42 {
    public String displayInput(String file){
        File in = new File(file);
        //Read input file
        try(Scanner input = new Scanner(in)){
            //While input.hasNext Parse the strings
            while(input.hasNext()) {
                String info = input.nextLine();
                String [] space = info.split(",");
                System.out.printf("%-10s%-10s%s%n",space[0],space[1],space[2]);
            }
            //Catch exception
        }catch(Exception e){
            System.out.println("Error");
        }
return file;
    }
    public static void main(String[] args) {
        Solution42 sol = new Solution42();
        //Display Last      First     Salary
        System.out.println("Last      First     Salary");
        //Display --------------------------
        System.out.println("--------------------------");
        //Display file
        sol.displayInput("data/exercise42_input.txt");

    }
}
