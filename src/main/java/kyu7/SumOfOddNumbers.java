package kyu7;

public class SumOfOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int nSum = 0;
        int number = 1;

        for(int i = 0; i < n; i++){
            for(int j = 0; j <= i; j++){
                if(i == n-1) nSum += number;
                number += 2;
            }
        }
        return nSum;
    }
}
