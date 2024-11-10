import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Hashmaps {
    public static void main(String[] args) {
        String[] cities = { "delhi", "mumbai", "bangalore" };
        Map<String, String[]> mapVar = new HashMap<>();
        mapVar.put("India", cities);
        // type 1
        for (String s : mapVar.keySet()) {
            System.out.println("Key: " + s + "val: " + Arrays.toString(mapVar.get(s)));
            // System.out.println("Key" + s);
            // for (String city : mapVar.get(s)) {
            // System.out.println(city);
            // }
        }
        // type 2
        System.out.println(mapVar.entrySet());
        System.out.println(mapVar.containsKey("India"));
    }
}
