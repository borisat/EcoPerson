import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProcessCSV {

    static final String ROW_NAME = "id|name|waterCount|gasCount1|gasCount2|electroCount1|electroCount2\r\n";

    public static void writePersonData(List<EcoPerson> ecoPersonList, String path) {
        String fileName = path + "/../EkoPeopleResult.csv";
        StringBuilder stringBuilder = new StringBuilder(ROW_NAME);

        for (int i = 0; i < ecoPersonList.size(); i++) {
            stringBuilder.append(ecoPersonList.get(i).toString());

            try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
                writer.write(stringBuilder.toString());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public static List<EcoPerson> readPersonData(String path) throws FileNotFoundException {
        String fileName = path;
        List<EcoPerson> ecoPersonList = new ArrayList<>();

        Scanner scanner = new Scanner(new File(fileName));
        while (scanner.hasNextLine()) {
            try {
                String rows = scanner.nextLine();
                String[] rowsArray = rows.split("\\|");

                ecoPersonList.add(new EcoPerson(Integer.parseInt(rowsArray[0]), rowsArray[1],
                        Integer.parseInt(rowsArray[2]),
                        Integer.parseInt(rowsArray[3]),
                        Integer.parseInt(rowsArray[4]),
                        Integer.parseInt(rowsArray[5]),
                        Integer.parseInt(rowsArray[6])));
            } catch (NumberFormatException e) {
                continue;
            }
        }

        scanner.close();
        return ecoPersonList;


    }


}



