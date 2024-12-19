/*
Q) Write a java program to identify and print all elements in an array that are greater 
than both their immediate predecessors and successors, considering the first and 
last elements as having only one neighbor? 
 
Input: 
 	 1 3 20 4 75 0 90 
 
Output: 
 	 20  75  90
	
*/

class  PreSucc
{
	public static void main(String[] args) 
	{
		int arr[] = { 1 ,3 ,20 ,4 ,75 ,0 ,90};
		
		if(arr[0]>arr[1]){
			System.out.print(arr[0] + "  ");
		}
		
		for(int i = 1; i< arr.length-1; i++){
			if(arr[i]>arr[i-1] && arr[i] >arr[i+1]){
				System.out.print(arr[i] + "  ");
			}
		}
		
		if(arr[arr.length-1]>arr[arr.length-2]){
			System.out.print(arr[arr.length-1] +"  ");
		}
	}
}
