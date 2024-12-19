/*Q) Write a java program to check given string is palindrome or not?

input:
	racar 

output:
	It is a palindrome string  */
public class String_12 {
    public static void main(String[] args) {
        String str = "raecar";
        String rev = "";
        for(int i = str.length()-1;i>=0;i--){
              rev = rev + str.charAt(i);
        }

        if(str.equals(rev))
           System.out.println("It is a palindrome string");
        else
           System.out.println("It is not palindrom string");
    }
}
