// Q) Write a java program to count odd elements from given array?
class  oddArray
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8};
		int count = 0;
		for(int i : arr){
			if(i%2 != 0){
				count++;
				} 
		}
		System.out.println(count);
	}
}
