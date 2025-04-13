package Map.HashMap;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap hm = new HashMap<>();
        hm.put(1,"one");
        hm.put("one", 1);
        hm.put(1, 3);

        System.out.println(hm);
    }
}
