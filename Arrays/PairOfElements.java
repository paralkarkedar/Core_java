/* 
Q) Write a java program to display pair of elements equals to given sum?

Input:
	arr = 2 4 7 1 9 6 3

	sum = 10 

Output:
	4 6 
	7 3 
	1 9
	
	*/

class  PairOfElements
{
	public static void main(String[] args) 
	{
		int[] arr = {2 ,4 ,7 ,1, 9, 6 ,3};
		int sum = 10;
		for(int i = 0; i<arr.length; i++){
			for(int j = i+1; j<arr.length; j++){
				if(arr[i] + arr[j] == sum){
					System.out.println(arr[i] + " "+ arr[j]);
				}
			}
		}
	}
}
