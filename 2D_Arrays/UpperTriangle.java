/* Q) Write a java program to perform sum of upper triangle elements?

Input:
	1 2 3 
	4 5 6
	7 8 9
	*/
	
class  UpperTriangle
{
	public static void main(String[] args) 
	{
		int [][] arr = {{1 ,2, 3 },{4 ,5 ,6},{7 ,8 ,9}};
		
		int row = arr.length;
		int cols = arr[0].length;
		int sum = 0;
		for(int i = 0; i <arr.length; i++){
			for(int j = 0; j<arr.length; j++){
				if(i<j){
					sum = sum + arr[i][j];
				}
			}
		}
		System.out.println(sum);
	}
}
