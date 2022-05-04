package kyu6;

public class HighestScoringWord {
    public static String high(String s) {
        String[] separately = s.split(" ");
        char[] alphabet = {' ', 'a', 'b', 'c', 'd', 'e', 'f', 'g','h', 'i', 'j', 'k', 'l', 'm', 'n', 'o','p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };

        int numOfWords = 0;
        int scoreMax = 0;
        int score;

        for (int i = 0; i < separately.length; i++){
            score = 0;
            for (int j = 0; j < separately[i].length(); j ++){
                for (int k = 1; k < alphabet.length; k++){
                    if (separately[i].charAt(j) == alphabet[k]) score += k;
                }
            }
            if (score > scoreMax){
                scoreMax = score;
                numOfWords = i;
            }
        }
        return separately[numOfWords];
    }
}
