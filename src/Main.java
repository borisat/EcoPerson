import java.io.*;
import java.util.List;

public class Main {



    public static void main(String[] args) throws IOException {
         String inputPath = "C:/jokeTest/data.csv";
         int maxResourceUsage  = 200;

         processFile(inputPath, maxResourceUsage);

    }

    public static void processFile(String source, int maxResourceUsage) throws FileNotFoundException {
        List<EcoPerson> personList = ProcessCSV.readPersonFromFile(source);
        ProcessPersonList.getEcoPerson(personList, maxResourceUsage);
        ProcessCSV.writePersonToFile(personList, source );
    }

}



