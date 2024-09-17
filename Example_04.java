//Q) Write a java program to accept six marks of a student then find out total and average?

import java.util.*;
class Example_04 {

public static void main(String[] args){

Scanner sc = new Scanner(System.in);

System.out.println("Enter the first student mark: ");
int a = sc.nextInt();

System.out.println("Enter the first student mark: ");
int b = sc.nextInt();

System.out.println("Enter the first student mark: ");
int c = sc.nextInt();

System.out.println("Enter the first student mark: ");
int d = sc.nextInt();

System.out.println("Enter the first student mark: ");
int e = sc.nextInt();


 int total = (a+b+c+d+e);
 
 System.out.println("The total of marks : " + total);

int avg = total/5;
System.out.println(avg);

}
}



