//Q) Write a java program to display array elements in sorting order?
import java.util.*;
class SortArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,4,3,4,7,6};
		
		Arrays.sort(arr);
		
		for(int i : arr){
			System.out.println(i);
		}
		
		
	}
}
