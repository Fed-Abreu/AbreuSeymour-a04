package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution45 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        //Display What is the name of the output file: and Scan String
        System.out.print("Enter the output file : ");
        String outputFile = input.next();

        //read files and write
        Read read = new Read();
        read.readFile();
        ArrayList<String> list = (ArrayList<String>) read.getData();

        Write write = new Write(outputFile,list);

        write.writeFile();
    }
}
class Read {

    private final ArrayList<String> list;
    private final Scanner input;

    public Read() throws FileNotFoundException {
        list = new ArrayList<>();

        //read the path
        File file = new File("data/exercise45_input.txt");
        input = new Scanner(file);


    }
    public String readFile(){
        try{
            //Using while loop read file lines and store them into a list
            while(input.hasNext()){
                String fileData = input.nextLine();
                list.add(fileData);
            }
        }finally {
            input.close();
        }

        return null;
    }
    public List<String> getData() {
        return list;
    }
}
class Write{
    private final FileWriter writer;
    private final ArrayList<String> list;

    public Write(String name, List<String>list) throws IOException{
        //write in to the files
        writer = new FileWriter("data/" + name);
        this.list = (ArrayList<String>) list;
    }
    public String writeFile()throws IOException{
        for (String temp : list) {

            temp = temp.replace("utilize", "use");
            writer.write(temp + "\n");
    }
        writer.close();

        return null;
    }
}
