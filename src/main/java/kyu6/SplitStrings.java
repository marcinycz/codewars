package kyu6;

public class SplitStrings {
    public static String[] solution(String s) {
        int length = s.length()/2;

        String[] result;

        if(s.length() % 2 != 0){
            result= new String[length+1];
            result[length] = s.charAt((length)*2) + "_";
        }else{
            result = new String[length];
        }

        for(int i = 0; i < length; i++ ){
            result[i] = String.valueOf(s.charAt(i*2)) + s.charAt(i*2+1);
        }

        return result;
    }

}
