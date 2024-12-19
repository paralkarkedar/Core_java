/*Q) Write a java program to display given output?

input:
	str = ihubstudent
	index = 4
	insert = for 

output:
	ihubforstudent  */
public class String_09 {
    public static void main(String[] args) {
        String str = "ihubstudent";
        int index = 4;
        String insert = "for";

        String word1 = str.substring(0,index);
        String word2 = str.substring(index, str.length());

        System.out.println(word1+insert+word2);
    }
}
