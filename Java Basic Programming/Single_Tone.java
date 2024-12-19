class Singleton 
{
	static Singleton singleton=null;

	private Singleton()
	{
	}

	public static  Singleton  getInstance()
	{
	
		if(singleton==null)
		{
			singleton=new Singleton();
		}

		return singleton;
	}
}

class Single_Tone 
{
	public static void main(String[] args)
	{
		Singleton s1=Singleton.getInstance();
		System.out.println(s1.hashCode());

		Singleton s2=Singleton.getInstance();
		System.out.println(s2.hashCode());
	}
}

