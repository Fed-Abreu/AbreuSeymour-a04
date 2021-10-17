package baseline;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.*;


/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Federico Abreu Seymour
 */
public class Solution44 {
    //Couldn't figure out how to compile using fileInput method so got rid of it

    public int fileOutput(){
        JSONParser parser = new JSONParser();
        // While loop if the value is valid or not
        int flag = 0;
        while (flag == 0) {
            try {
                //Read json file using parse and store it in a object
                Object obj = parser.parse(new FileReader("data/exercise44_input.json"));

                JSONObject jsonObject = (JSONObject) obj;

                // Read products as an Array
                JSONArray subjects = (JSONArray) jsonObject.get("products");
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

                //Display What is the product name and Scan
                System.out.print("What is the product name? ");
                String input = bufferedReader.readLine();

                // Loop through an iterator and get value of name and determine if matches
                for (Object subject : subjects) {
                    JSONObject json = (JSONObject) subject;

                    //Compare it with given input
                    String name = (String) json.get("name");
                    if (input.equals(name.toLowerCase())) {
                        System.out.println("Name: " + name);
                        System.out.println("Price: " + json.get("price"));
                        System.out.println("Quantity: " + json.get("quantity"));
                        flag = 1;
                    }
                }
                //If not a valid input Display Sorry, that product was not found in our inventory
                if (flag == 0) {
                    System.out.println("Sorry, that product was not found in our inventory");
                }
                //And catch exceptions
            } catch (Exception e) {
               System.out.println("Error");
            }
        }


        return flag;
    }
    public static void main(String[] args){
        Solution44 sol = new Solution44();

        sol.fileOutput();


    }
}