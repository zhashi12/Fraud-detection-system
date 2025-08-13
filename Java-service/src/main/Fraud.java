import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.ArrayList;
public class Fraud {
    /*
    parse the csv file in Transaction class. add the necessary fields to a new transaction class, and store it in array
    which a hashmap maps a name to that array
     */
    HashMap<String,ArrayList<Transactions>> mapping = new HashMap<>();

    public void csvTranslate(){
        String filepath ="src/practice.csv";
        String delimiter = ",";
        String line;
        Transactions temp;
        // name fee location date/time
        try(BufferedReader buffer = new BufferedReader(new FileReader(filepath)) ){
            while((line = buffer.readLine()) != null){
                String[] values = line.split(delimiter);
                temp = new Transactions(Integer.valueOf(values[1]),values[2],values[3]);
                if (mapping.containsKey(values[0])){
                    mapping.get(values[0]).add(temp);
                }
                else{
                    ArrayList<Transactions> listt = new ArrayList<>();
                    listt.add(temp);
                    mapping.put(values[0],listt);
                }
            }
        }
            catch(IOException e){
                System.out.println("Error");
        }
        printHash(mapping);

    }
    public void printHash(HashMap<String, ArrayList<Transactions>> hash){
        for(String key: hash.keySet()){
            for(int i = 0;i<hash.get(key).size();i++) {
                System.out.println(key + "  " + hash.get(key).get(i).getCost() + "  " + hash.get(key).get(i).getCost() + "  " + hash.get(key).get(i).getTime());
            }
        }

    }
    //Years,months,days,
    public void timeDifference(String timeOne, String timeTwo){

    }
    // if multiple small transactions in a burst (3 successive transactions worth less than 2 in an hour period)
    //look up machine learning models to do this and implement one
    public void fraudTime(){

    }


}
