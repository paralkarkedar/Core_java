package Map.LinkedHashMap;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test {
    public static void main(String[] args) {
        LinkedHashMap lhm = new LinkedHashMap<>();
        lhm.put(1,"one");
        lhm.put("one", 1);
        lhm.put(1, 3);

        System.out.println(lhm);
    }
}
