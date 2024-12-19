/*

Q) Write a java program to delete first occurance of a given element?

input:
	arr = 5 2 9 4 7 2 1 6 2  

	element = 2 

output:
	5 9 4 7 2 1 6 2 
	*/
	
class DeleteFirstOcuurance
{
	public static void main(String[] args) 
	{
	     int [] arr = {5,2,9,4,7,2,1,6,2};
		 int elements = 2; 
		 
		 int[] newArray = new int[arr.length-1];
		 
		 int j = 0;
		 int count = 0;
		 
		 for(int i = 0; i<arr.length; i++){
			if(arr[i] == elements && count == 0){
				count = 1;
				continue;
			}
			newArray[j++] = arr[i];
		 }
		 for(int i : newArray){
			System.out.print(i +"    ");
		 }
	}
}
