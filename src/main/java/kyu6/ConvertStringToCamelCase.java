package kyu6;

public class ConvertStringToCamelCase {
    static String toCamelCase(String s){

        char[] text = s.toCharArray();

        StringBuilder builder = new StringBuilder(s);

        for (int i = 0; i < s.length(); i++){
            if((text[i] == '-') || (text[i] == '_') ){
                text[i] = '*';
                text[i+1] = Character.toUpperCase(text[i+1]);
            }
        }

        return String.valueOf(text).replace("*", "");
    }
}
