
/*  
Q) Write a java program to perform right rotation of a given string?

input:
	str = ihubtalent 

	cnt = 4

 
 */
public class String_08 {
    public static void main(String[] args) {
        String str = "ihubtalent";
        int count = 4;
        String word1 = str.substring(count,str.length());
        String word2 = str.substring(0,count);
        System.out.println(word1+word2);
    }
}
