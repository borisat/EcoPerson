import java.io.*;

public class Main {

    public static final String INPUT_PATH = "C:/jokeTest/data.csv";
    public static final String OUTPUT_PATH = "C:/jokeTest/EkoPeopleResult.csv";


    public static void main(String[] args) throws IOException {

        ProcessCSV.writePersonData(ProcessCSV.readPersonData(INPUT_PATH),
                OUTPUT_PATH);
    }

}



