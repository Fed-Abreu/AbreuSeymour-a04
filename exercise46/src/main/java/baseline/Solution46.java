package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class Solution46 {
    public static void main(String[] args) throws FileNotFoundException {
        ReadFile read = new ReadFile();
        //Get map and read files
        read.rFile();
        HashMap<String, Integer>map = read.getMap();
        DisplayHistogram display = new DisplayHistogram(map);
        display.Display();
    }
}
class ReadFile{
    //Get path to file and variables
    private Scanner input;
    private File file;
    private HashMap<String, Integer>map;

    public ReadFile() throws FileNotFoundException {
        file = new File("data/exercise46_input.txt");
        input = new Scanner(file);
        map = new HashMap<String, Integer>();
    }
    public File rFile(){
        //read file with a while loop and spilt white spaces up
        try{
            while(input.hasNext()){
                String in = input.nextLine();
                String arr[] = in.split(" ");

                //Then for loop length to make key = array
                for (int i = 0; i < arr.length;i++){
                    String key = arr[i];

                    //If map contains key then make a increase and equal to
                    if(map.containsKey(key)){
                        int value = map.get(key);
                        value++;
                        map.put(key,value);
                    }
                    else{
                        map.put(key, 1);
                    }
                }
            }
        }finally{
            input.close();
        }
        return file;
    }
        //Return the map
        public HashMap<String, Integer>getMap(){
            return map;
    }
}
class DisplayHistogram {
    private HashMap<String, Integer> map;

    public DisplayHistogram(HashMap<String, Integer> map) {
        this.map = map;
    }

    public short Display() {
        String keys[] = new String[map.size()];
        Integer values[] = new Integer[map.size()];
        int k = 0;
        //For String, Integer : map make key = to entry and values incerease to entry
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            keys[k] = entry.getKey();
            values[k++] = entry.getValue();
        }
        //Make arrays for strings and integers to be stored
        int tvalues[] = new int[map.size()];
        String tkeys[] = new String[map.size()];
        for(int i = 0; i < values.length;i++){
            tvalues[i] = values[i];
        }
        Arrays.sort(values, Collections.reverseOrder());
        //Sort array to value and store
        for(int i=0; i<map.size();i++){
            int value = values[i];
            for(int j = 0; j < tvalues.length;j++){
                if (value == tvalues[j]){
                    tkeys[i] = keys [j];
                    break;
                }
            }
        }
        //Display the Histogram
        System.out.println();
        for(int i= 0;i < map.size();i++){
            int value = map.get(tkeys[i]);
            System.out.printf("%-10s",tkeys[i] + ":");
            for(int j = 0; j< value; j++){
                System.out.print("*");
            }
            System.out.println();

        }

        return 0;
    }

}