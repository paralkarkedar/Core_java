package SegroSoft;
// 2.	write program to find out input as password and password should be at least 8 letters and it should contain at least one capital alphabet, at least one small alphabet, and one special character?
import java.util.*;
public class Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int n = sc.nextInt();

        // String password = Integer.toString(n);
        String password = sc.nextLine();

        if(password.length()>=8 && password.matches(".*[A-Z]*.") && password.matches(".*[a-b]*.") && password.matches(".*[!@#$%^&*()_+]*.")){
            System.out.println("Correct Password.......");
        }else{
            System.out.println("Wrong password...............");
        }
    }
}
