
/* Q) Write a java program to display duplicate elements from given array?

Input:
	6 8 2 3 1 5 4 2 6 8 

output:
	6 8 2 
	
	*/

class  DuplicateElements
{
	public static void main(String[] args) 
	{
		int[] arr= {6,8,2,3,1,5,4,2,6,8};
		
		for(int i = 0; i<arr.length; i++){
			for(int j = i +1; j<arr.length; j++){
				if(arr[i] == arr[j]){
					System.out.println(arr[i]);
				}
			}
		}
	}
}
