/*Q) Write a java program to display the string in a given format?

input:
	A1B2C3D4

output:
	ABBCCCDDDD */
public class String_20 {
    public static void main(String[] args) {
        String str = "A1B2C3D4";
        for(int i = 0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                System.out.print(str.charAt(i));
            }
            else{
                int n = Character.getNumericValue(str.charAt(i));
                for(int j = 1; j<n; j++){
                    System.out.print(str.charAt(i-1));
                }
            }
        }
    }
}
