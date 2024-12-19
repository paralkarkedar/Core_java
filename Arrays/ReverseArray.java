
// Q) Write a java program to display array elements in reverse order?
class ReverseArray 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8};
		
		for(int i = arr.length-1; i>=0; i--){
			System.out.print(arr[i]);
		}
	}
}
