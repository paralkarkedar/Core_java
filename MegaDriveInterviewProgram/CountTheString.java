package MegaDriveInterviewProgram;

public class CountTheString {
    public static void main(String[] args) {
        String input = "This Is Java Class 29";
        int upperCaseCount = 0;  
        int lowerCaseCount = 0;  
        int digitCount = 0;  
        int wordCount = 0;  
        int spaceCount = 0; 

        for (char ch : input.toCharArray()) {  
            wordCount++;
            if (Character.isUpperCase(ch)) {  
                upperCaseCount++;  
            } else if (Character.isLowerCase(ch)) {  
                lowerCaseCount++;  
            } else if (Character.isDigit(ch)) {  
                digitCount++;  
            } else if (Character.isWhitespace(ch)) {  
                spaceCount++;  
            }  
        }  

        // Output the counts  
        System.out.println("Uppercase Letters: " + upperCaseCount);  
        System.out.println("Lowercase Letters: " + lowerCaseCount);  
        System.out.println("Digits: " + digitCount);  
        System.out.println("Words: " + wordCount);  
        System.out.println("Spaces: " + spaceCount); 
    }
}
