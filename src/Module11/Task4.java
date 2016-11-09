package Module11;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task4 {

    public static void main(String[] args) throws IOException {

        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Caterpillar", "Alice");
        String word = "Alice";

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
        System.out.println(words(result,word));
    }

    public static int words(String file, String word) {
        Pattern p = Pattern.compile("\\b" + word + "\\b");
        Matcher m = p.matcher(file);
        int count = 0;
        while (m.find()) {
            count++;
        }
        return count;
    }
}
