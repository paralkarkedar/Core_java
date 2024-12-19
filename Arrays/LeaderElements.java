/* Q) Write a java program to find out leader elements from given array?

Input:
	4 9 32 6 12 1 8 

output:
	8 12 32
*/
class  LeaderElements
{
	public static void main(String[] args) 
	{
		int[] arr = {4, 9, 32, 6, 12 ,1 ,8} ;
		int max = arr[arr.length-1];
		
		System.out.print(max + "  ");
		for(int i = arr.length-2; i>=0; i--){
			if(max<arr[i]){
				max= arr[i];
				System.out.print(max + "  ");
			}
		}
		
	}
}
