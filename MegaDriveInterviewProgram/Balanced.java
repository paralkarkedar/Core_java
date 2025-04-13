package MegaDriveInterviewProgram;

import java.util.Stack;

public class Balanced {
    public static void main(String[] args) {
        String str = "{[()]}";

    }

    public static boolean BalancedString(char[] ch){
        Stack<Character> s = new Stack<Character>();

        for(char chh: ch){
        if(chh == '{' || chh == '[' || chh == '('){
            s.push(chh);
        }
        else if(chh == '}' && !s.empty() && s.peek()== '{');{
            s.pop();
        }
        else if(chh == ']' && !s.empty() && s.peek()== '[');{
            s.pop();
            }
        }
    }
}
