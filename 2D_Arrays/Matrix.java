// Q) Write a java program to display array elements in matrix form?
import java.util.*;
class Matrix 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows");
		int rows = sc.nextInt();
		
		System.out.println("Enter the cols");
		int cols = sc.nextInt();
		
		int[][] arr = new int [rows][cols];
		 
		 for(int i = 0;i< arr.length; i++){
			for(int j = 0; j<arr.length; j++){
				System.out.println("Enter the number");
				arr[i][j] = sc.nextInt();
			}
		 }
		 
		 for(int i = 0;i< arr.length; i++){
			for(int j = 0; j<arr.length; j++){
				System.out.print(arr[i][j] + "  ");
				
			}
			System.out.println();
		 }
		
	}
}
