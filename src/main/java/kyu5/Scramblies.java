package kyu5;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        StringBuilder str1Builder = new StringBuilder(str1);
        char[] foundChars = new char[str2.length()];

        for(int i = 0; i < str2.length(); i++){
            for(int j = 0; j < str1Builder.length(); j++ ){
                if(str2.charAt(i) == str1Builder.charAt(j)){
                    foundChars[i] = str2.charAt(i);
                    str1Builder.deleteCharAt(j);
                    break;
                }
            }
        }
        return str2.equals(String.valueOf(foundChars));
    }
}