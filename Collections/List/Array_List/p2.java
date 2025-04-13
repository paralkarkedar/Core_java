package Collections.List.Array_List;

import java.util.ArrayList;

public class p2 {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add(null);
        al.add("kedar");
        
        for(String s : al){
            System.out.println(s);
        }
    }
}
