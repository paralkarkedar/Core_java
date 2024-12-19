//Q) Write a java program to perform sum of array elements?
import java.util.*;
class SumOfArray 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		int sum =0;
		
		for(int i = 0; i <arr.length; i++){
			System.out.println("Enter the elements : ");
			arr[i] = sc.nextInt();
		}
		
		//for(int i :arr){
		//	sum = sum + i ;
		//}
		
		for(int i = 0; i<arr.length; i++){
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}
