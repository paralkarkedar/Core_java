
//Q) Write a java program to find out area of a rectangle?
import java.util.*;
class AreaRectangle
{
	public static void main(String[] args) 
	{
		System.out.println("please enter the length of rectangle:");
		Scanner sc = new Scanner(System.in);
		int length = sc.nextInt();
		
		System.out.println("Please enter the width of rectangel");
		int width = sc.nextInt();
		
		int ans = length*width;
		
		System.out.println("Area of the rectangle is : "+ans);
	}
}
