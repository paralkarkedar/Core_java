package Collections.Set.LinkedHashSet;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        int arr[] = {1 ,2 ,2 ,3 ,3, 3, 4, 4 ,4 ,4};
        
        LinkedHashSet<Integer> hashSet = new LinkedHashSet<Integer>();


        for(int i : arr){
            hashSet.add(i);
        }
        for(int i : hashSet){
            System.out.println(i);
        }
        
     }
}
