interface A
{
	public abstract void m1();
}
class B implements A
{
	public void m1(){
		System.out.println("this is abstaract method");
	}
}
class  Interface_01
{
	public static void main(String[] args) 
	{
		A a = new B();
		a.m1();
	}
}
