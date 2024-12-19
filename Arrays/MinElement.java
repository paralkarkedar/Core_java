//Q) Write a java program to display least element from given array?

class MinElement 
{
	public static void main(String[] args) 
	{
	   {
	int[] arr  = {2,3,8,4,5,6,7};
	int min =arr[0];
	
	for(int i : arr){
		if(i<min ){
			min = i;
		}
		}
		System.out.println(min);
	}
	}
}
