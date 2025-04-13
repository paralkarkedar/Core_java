package Collections.List.Array_List;

import java.util.ArrayList;
import java.util.List;

public class p3 {
    public static void main(String[] args) {
        List<Integer> ls = new ArrayList<Integer>();

        ls.add(32);
        ls.add(54);
        ls.add(45);
        for(int i : ls){
            System.out.println(i);
        }
    }
}
