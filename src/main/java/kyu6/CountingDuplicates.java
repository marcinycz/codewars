package kyu6;

public class CountingDuplicates {
    public static int duplicateCount(String text) {

        text = text.toUpperCase();

        String checkedCharacters = "";
        int countTheSameCharacters;
        int countRepeatedCharacters = 0;

        for(int i = 0; i < text.length(); i++){
            countTheSameCharacters = 0;

            if (checkedCharacters.contains(String.valueOf(text.charAt(i)))) continue;

            for(int j = i + 1; j < text.length(); j++){
                if(text.charAt(i) == text.charAt(j)) countTheSameCharacters++;
            }

            checkedCharacters = checkedCharacters + text.charAt(i);

            if(countTheSameCharacters > 0) countRepeatedCharacters++;
        }

        return countRepeatedCharacters;
    }
}
