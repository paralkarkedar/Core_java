/*  

Q) Write a java program to find out missing element from given array?

input:
	7 1 3 5 2 6 

output:
	4
	*/

class MissingElement 
{
	public static void main(String[] args) 
	{
		int[] arr = {7 ,1, 3 ,5 ,2 ,6 };
		
		int sum_of_arr = arr.length+1;
		
		int sum = (sum_of_arr*(sum_of_arr + 1))/2;
		
		for(int i : arr){
			sum = sum-  i ;
			
	
		}
		System.out.println(sum);
	}
}