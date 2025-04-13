package MegaDriveInterviewProgram;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class DistinctElements {
    public static void main(String[] args) {
        int arr[] = {1,2,2,3,3,3,4,4,4,4};
        
        LinkedHashSet<Integer> st = new LinkedHashSet<Integer>();

        for(int i : arr){
            st.add(i);
        }
        System.out.println(st);

    }
}
