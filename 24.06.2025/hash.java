import java.util.*;

public class UniqueChars {
    public static void main(String[] args) {
        String str = "programming";
        Map<Character, Integer> map = new LinkedHashMap<>();

        for (char c : str.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        System.out.print("Unique characters: ");
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }
    }
}
