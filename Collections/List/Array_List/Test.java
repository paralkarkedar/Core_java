// write the java program to sort string 

//input : appple graps dog banana 
package Collections.List.Array_List;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        String str = "appple graps dog banana";

        String[] sarr = str.split(" ");

        List<String> list = new ArrayList<String>();

        for(String s:sarr)
		{
			list.add(s);
		}
		
		Collections.sort(list);
		
		for(String s:list)
		{
			System.out.print(s+" ");
		}

    
    }
}
