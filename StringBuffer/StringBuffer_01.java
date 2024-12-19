/*
Q) Write a java program to find out given string is palindrome or not?

input:
	racar 

output:
	It is a palindrome string  */
public class StringBuffer_01 {
    public static void main(String[] args) {
        String str = "racar";
        StringBuffer sb = new StringBuffer(str);
        String rev = sb.reverse().toString();
        if (str.equals(rev)) {
            System.out.println("it is palindrom string");
        }else{
            System.out.println("it is not palindrom string");
        }
    }
}
