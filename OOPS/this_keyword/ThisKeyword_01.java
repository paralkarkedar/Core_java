//2) To refer current class methods 
class A
{
	public void m1(){
		System.out.println("this is m1 method");
		this.m2();
	}
	public void m2(){
		System.out.println("this is m2 method");
	}
}
class  ThisKeyword_01
{
	public static void main(String[] args) 
	{
	    A a  = new A();
		a.m1();
	}
}