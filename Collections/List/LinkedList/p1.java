package Collections.List.LinkedList;

import java.util.LinkedList;

public class p1 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};

        LinkedList<Integer> ls = new LinkedList<Integer>();

        for(int i : arr){
            ls.add(i);
        }

        for(int s : ls){
            System.out.println(s);
        }
    }
        
        

}
