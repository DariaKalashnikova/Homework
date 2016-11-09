package Module11;


import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Task2 {

    public static void main(String[] args) throws IOException {

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Caterpillar", "Alice");
        stringMap.put("Insect", "Human");

        BufferedReader br;
        try {
            FileReader fileReader = new FileReader("D:/Загрузки/Homework/src/Module11/Advice from Caterpillar.txt");
            br = new BufferedReader(fileReader);
        } catch (FileNotFoundException e) {
            System.out.println("No file found");
            return;
        }

        StringBuilder sb = new StringBuilder();
        String line = br.readLine();

        while (line != null) {
            sb.append(line);
            sb.append(System.lineSeparator());
            line = br.readLine();
        }
        br.close();


        String result = sb.toString();
        for (Map.Entry<String, String> stringEntry : stringMap.entrySet()) {
            String key = stringEntry.getKey();
            String value = stringEntry.getValue();
            result = result.replaceAll(key, value);
        }
        FileWriter fw = new FileWriter("D:/Загрузки/Homework/src/Module11/Advice from Caterpillar2.txt");
        fw.write(result);
        fw.close();
    }
}

