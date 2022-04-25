package kyu6;

import java.util.Arrays;

public class WhoLikesIt {
    public static String whoLikesIt(String... names) {

        long countLikes = Arrays.stream(names).count();

        if (countLikes == 0){
            return "no one likes this";
        }else if(countLikes == 1){
            return names[0] + " likes this";
        }else if(countLikes == 2){
            return names[0] + " and " + names[1] + " like this";
        }else if(countLikes == 3){
            return names[0] + ", " + names[1] + " and " + names[2] + " like this";
        }else{
            return names[0] + ", " + names[1] + " and " + (countLikes - 2) + " others like this";
        }
    }
}
