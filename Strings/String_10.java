
/*Q) Write a java program to display reverse of a given string?

input:
	hello

output:
	olleh  */
public class String_10 {
    public static void main(String[] args) {
        String str = "hello";
        String rev = "";

        for(int i = str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
    }
}
