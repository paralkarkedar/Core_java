/* 
Q) Write a java program to display triplet of elements equals to given sum?

Input:
	arr = 2 4 7 1 9 6 3

	sum = 10 

Output:
	2 7 1
	1 6 3
*/ 
class PairOfTriplet 
{
	public static void main(String[] args) 
	{
		int[] arr = {2 ,4 ,7 ,1, 9, 6 ,3};
		int sum = 10;
		
		for(int i = 0; i<arr.length ; i++){
			for(int j = i+1; j<arr.length; j++){
				for(int k = j+1; k < arr.length ; k++){
				if(arr[i] + arr[j] + arr[k] == sum){
					System.out.println(arr[i] + " "+ arr[j]+ " "+ arr[k]);
				}
					}
			}
		}
	}
}
