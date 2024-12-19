//1) To refer current class variables

class A
{
	int i = 10;
	int j = 20;
	A(int i , int j){
       System.out.println(i + " " + j);
	   System.out.println(this.i +"  "+ this.j);
	}
}  

class ThisKeyword
{
	public static void main(String[] args) 
	{
		A   a = new A(100,200);
	}
}
