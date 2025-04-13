package MegaDriveInterviewProgram;

public class StringInFormatNumTOAl {
    public static void main(String[] args) {
        String str = "A1B2C3D4";

        for(int i = 0; i<str.length(); i++){
            if(Character.isAlphabetic(str.charAt(i))){
                System.out.print(str.charAt(i));
            }else{
                int k = Character.getNumericValue(str.charAt(i));

                for(int j = 1; j<k; j++){
                    System.out.print(str.charAt(i-1));
                }
            }
        }

       
        
        
    }
}
