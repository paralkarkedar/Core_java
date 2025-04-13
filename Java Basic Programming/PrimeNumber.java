public class PrimeNumber {
    public static void main(String[] args) {
     int n = 2;
     boolean flag = true;
     for(int i = 2; i<n/2; i++){
        if(i%n==0){
            flag = false;
            break;
        }
     }
     if(flag){
        System.out.println("Prime Number...");

     }  else{
        System.out.println("Not a Prime Number....");
     } 
    }
}
