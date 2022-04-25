package kyu5;

public class ValidParentheses {
    public static boolean validParentheses(String parens) {
        int openChar = 0;
        int closeChar = 0;

        for(int i = 0; i < parens.length(); i++){
            if(parens.charAt(i) == '(') openChar++;
            if(parens.charAt(i) == ')'){
                closeChar++;
                if(closeChar > openChar) return false;
            }
        }
        if(closeChar != openChar) return false;
        return true;
    }
}
