package Recursion;

public class PrimeNum {
    public static void main(String[] args) {
        NaturalNumbers(1);
    }

    public static void NaturalNumbers(int n ){
        
           if(n<=10){
            System.out.println(n);
            NaturalNumbers(n+1);
        

           }
    }
}
