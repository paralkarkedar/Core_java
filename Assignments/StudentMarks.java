/*Assignment
===========

Q) Write a java program to accept six marks of a student then find out total, average and grade?

i) if average is greater then equals to 70 then A grade.

ii) if average is greater then equals to 50 then B grade.

iii) if average is greater then  equals to 35 then C grade.

iv) if average is less then 35 then failed. */


import java.util.Scanner;
class StudentMarks 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the marks: ");
		int a = sc.nextInt();
		
		System.out.println("Enter the marks: ");
		int b = sc.nextInt();
		
		System.out.println("Enter the marks: ");
		int c = sc.nextInt();
		
		System.out.println("Enter the marks: ");
		int d = sc.nextInt();
		
		System.out.println("Enter the marks: ");
		int e = sc.nextInt();
		
		System.out.println("Enter the marks: ");
		int f = sc.nextInt();
		
		int total = a+b+c+d+e+f;
		
		int avg = total/6;
		
		if(avg >=70)
			System.out.println("A" + total +" " + avg);
		if(avg >=50 && avg <= 70)
			System.out.println("B" + total +" " + avg);
		if(avg >=35 && avg <=50)
			System.out.println("C" + total +" " + avg);
		if(avg <=35 )
			System.out.println("Failed" + total +" " + avg);
		
		
		//System.out.println(total);
		//System.out.println(avg);
	}
}
