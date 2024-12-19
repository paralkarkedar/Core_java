/*
Q) Write a java program to merge two arrays and display them in a sorting order?

input:
	6 9 7 10 8
	5 1 3 4  2

output:
	1 2 3 4 5 6 7 8 9 10
*/
import java.util.*;
class  MergeTowArrays
{
	public static void main(String[] args) 
	{
		int[] arr1 = {6 ,9 ,7 ,10 ,8};
		int[] arr2 = {5 ,1 ,3 ,40 ,2};
		
		int size1 = arr1.length;
		int size2 = arr2.length;
		int j = 0;
		arr1 = Arrays.copyOf(arr1, size1+size2);
		for(int i = size1; i<arr1.length; i++){
			arr1[i] = arr2[j++];
		}
		
		Arrays.sort(arr1);
		
		for(int i : arr1){
			System.out.print(i +"   ");
		}
	}
}
