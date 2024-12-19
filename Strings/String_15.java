
/*Q) Write a java program to display the string starting with uppercase letter?

input:
	This is Java class For students

ex:
	This  Java  For */
public class String_15 {
    public static void main(String[] args) {
        String  str = "This is Java class For students";
        String[] sarr = str.split(" ");

        for(String s : sarr){
            char ch = s.charAt(0);
            if(ch>='A' && ch<='Z'){
                System.out.println(s+"  ");
            }
        }
    }
}
