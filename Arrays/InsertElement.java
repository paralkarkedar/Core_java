/*


Q) Write a java program to insert the element in a given index?

input:
	arr =  5 8 2 4 3 9
	
	index = 3

	element = 10

output:
	5 8 2 10 4 3 9 
	
	*/
import java.util.*;
class InsertElement  
{
	public static void main(String[] args) 
	{
		   int [] arr = { 5, 8 ,2 ,4 ,3 ,9};
	
	        int   index = 3;

	        int element = 10;
			
			arr = Arrays.copyOf(arr,arr.length+1);
			
			for(int i = arr.length-1; i>=index; i--){
				
				arr[i] = arr[i-1];
				
			}
			arr[index] = element;
			
			for(int i : arr){
				System.out.print(i + "  ");
			}
	}
}
