// 4) Hierarchical Inheritance


class A
{
	public void m1(){
		System.out.println("m1 method");
	}
}
class B extends A

{
     public void m2(){
		System.out.println("m2 method");
     }
} 

class C extends A
{
	public static void m3(){
		System.out.println("m3 method");
	}
}



class  Inheritance_03
{
	public static void main(String[] args) 
	{
	
	A a = new A();
	a.m1();
	
	C c = new C();
	c.m1();
	//c.m2();
	c.m3();
	
	}
}
