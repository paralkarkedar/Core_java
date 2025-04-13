package MegaDriveInterviewProgram;

public class SimplePalindromeFinder {  
    public static void main(String[] args) {  
        String input = "racar is madam for student";  
        System.out.println("Input: " + input);  
        System.out.print("Output: ");  

        // Split the input string into words  
        String[] words = input.split(" ");  

        for (String word : words) {  
            // Reverse the word and check if it is equal to the original word  
            String reversedWord = new StringBuilder(word).reverse().toString();  
            if (word.equals(reversedWord)) {  
                System.out.print(word + " "); // Print if it's a palindrome  
            }  
        }  
    }  
}