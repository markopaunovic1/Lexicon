import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String> words = new HashMap<>();


        words.put("hej", "hello");
        words.put("middag","dinner");
        words.put("fantastiskt","fantastic");

        System.out.println("| Key | value |");
        System.out.println("|-----|-------|");

        for (String key : words.keySet()) {
            System.out.print( key + " : ");
            System.out.println( words.get(key));
        }
    }
}