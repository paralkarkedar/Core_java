public class Test_03{

       // static variable 
       static int a = 20;

       // instance variable 
       int b = 30;


      public static void m1(){
          System.out.println("YHello");
                     }

      public void m2(){
		System.out.println("hay kedar");
                    }


   public static void main(String args[]) {
     m1();
     Test_03 t = new Test_03();
     t.m2();
      t.b = 40;
      System.out.println(t.b);
      System.out.println(a);
}
}