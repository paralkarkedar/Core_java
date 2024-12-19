abstract class  Animal {
 
    // abstract class
    abstract void sound();
    
    //concrete method 
	public static void behaviour()
	{
		System.out.println("Eating+Jumping+Sleeping");
	}
}

class Cat extends Animal{
   public void sound(){
    System.out.println("meow meow..........");
   }
}
public class Example_01 {
    public static void main(String[] args) {
        Cat c = new Cat();
        c.sound();
        c.behaviour();
    }
}
