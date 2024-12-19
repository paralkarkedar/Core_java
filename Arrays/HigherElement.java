//Q) Write a java program to display high element from given array?
class HigherElement 
{
	public static void main(String[] args) 
	{
	int[] arr  = {2,1,3,8,4,5,6,7};
	int max =0;
	
	for(int i : arr){
		if(i>max){
			max = i;
		}
		}
		System.out.println(max);
	}
}
