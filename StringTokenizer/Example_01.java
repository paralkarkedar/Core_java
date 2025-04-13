import java.util.*;
class Example_01 
{
	public static void main(String[] args) 
	{
		String str = "racar is madam for student";

		String [] sarr = str.split(" ");
          
		for(String word : sarr){

		String revString = new StringBuilder(word).reverse().toString();

		if(word.equals(revString)){
			System.out.print(" "+ word);
		}
		
}

	}
}
