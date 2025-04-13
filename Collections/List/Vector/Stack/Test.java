package Collections.List.Vector.Stack;

import java.util.Stack;

public class Test {
    public static void main(String[] args) {
        String str="{()]}";
       if(balanceString(str)){
        System.out.println("It a ballance string");
       }else{
        System.out.println("Not Balance String ");
       }
                              

    }

    public static boolean balanceString(String str){
         Stack<Character> st = new Stack<Character>();
        for(int i =0; i<str.length(); i++){
            char ch = str.charAt(i);
            if(ch =='{' || ch == '[' || ch == '('){
                    st.push(ch);
            }
            else if(ch ==')' && !st.isEmpty() && st.peek() == '('){
                st.pop();
            } else if(ch ==']' && !st.isEmpty() && st.peek() == '['){
                st.pop();
            } else if(ch =='}' && !st.isEmpty() && st.peek() == '{'){
                st.pop();
            }else{
                return false;
            }

           
        }
        return st.isEmpty();
    }
}

