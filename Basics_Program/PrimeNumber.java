package Basics_Program;

public class PrimeNumber {
    public static void main(String[] args) {
        int n = 4;
        boolean flag = true;
        for(int i =2; i<=n/2; i++){
            if(n%2 == 0){
                flag =  false;
                break;
            }

        }
        if (flag == true) {
            System.err.println("the following number prime number:");

        }
        else{
            System.out.println("the following number is not prime number:");
        }
    }
}
