package kyu7;

public class DisemvowelTrolls {
    public static String disemvowel(String str) {
        String[] vowels = {"a", "e", "i", "o", "u","A", "E", "I", "O", "U"};

        for(int i = 0; i < vowels.length; i++){
            str = str.replace(vowels[i], "");
        }
        return str;
    }
}