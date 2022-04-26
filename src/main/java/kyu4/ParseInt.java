package kyu4;

public class ParseInt {
    public static int parseInt(String numStr) {
        numStr = numStr.replace("-", " ");
        String[] separately = numStr.split(" ");

        int result = 0;

        for(int i = 0; i < separately.length; i++){
            if(separately[i].equals("hundred")){
                result += 100;
                if(i != 0) result += (zeroToNineteen(separately[i-1]) * 100) - 100;

                for(int j = 1; j < separately.length-i; j++){
                    if(i < separately.length-j)if(separately[i+j].equals("thousand")){
                        result *= 1000;
                    }
                }
            }

            if(separately[i].equals("thousand")){
                if(i != 0)if(separately[i-1].equals("hundred")){
                    result += 100;
                    result += (zeroToNineteen(separately[i-1]) * 100) - 100;
                }
                result += 1000;
                if(i != 0){
                    result += (zeroToNineteen(separately[i-1]) * 1000) - 1000;
                    if(i-1 != 0) result += (twentyToNinety(separately[i-2]) * 1000);
                }
            }

            if(separately[i].equals("million")) result += zeroToNineteen(separately[i-1]) * 1000000;

            if(i == separately.length-1){
                result += zeroToNineteen(separately[i]);
                result += twentyToNinety(separately[i]);
            }
            if(i == separately.length-2 ){
                result += twentyToNinety(separately[i]);
            }
        }
        return result;
    }

    static int zeroToNineteen(String number){
        String[] zeroToNineteen = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
                "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen"};

        for(int i = 0; i < zeroToNineteen.length; i++){
            if(number.equals(zeroToNineteen[i])){
                return i;
            }
        }
        return 0;
    }

    static int twentyToNinety(String number) {
        String[] twentyToNinety = {null, null, "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};


        for (int i = 0; i < twentyToNinety.length; i++) {
            if (number.equals(twentyToNinety[i])) {
                return i * 10;
            }
        }
        return 0;
    }
}