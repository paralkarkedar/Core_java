package Map.TreeMap;

import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        TreeMap<Integer ,String> tm = new TreeMap<Integer, String>();
        
        tm.put(1, "one");
        tm.put(2, "Two");

        System.out.println(tm);
    }
}
