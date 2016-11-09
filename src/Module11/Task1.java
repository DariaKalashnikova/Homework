package Module11;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Task1 {

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
    }
}
