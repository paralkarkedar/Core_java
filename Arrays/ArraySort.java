//Q) Write a java program to display array elements in sorting order without using sort() method?
class ArraySort 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,4,3,4,7,6};
		
		for(int i = 0; i<arr.length; i++){
			for(int j = 0; j < arr.length ; j++){
				if(arr[i] < arr[j]){ 
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
					}
			}
		}
		for(int i : arr){
			System.out.println(i);
		}
	}
}
