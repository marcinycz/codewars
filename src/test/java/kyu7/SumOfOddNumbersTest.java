package kyu7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SumOfOddNumbersTest {
    @Test
    public void test1() {
        assertEquals(1, SumOfOddNumbers.rowSumOddNumbers(1));
        assertEquals(8, SumOfOddNumbers.rowSumOddNumbers(2));
        assertEquals(74088, SumOfOddNumbers.rowSumOddNumbers(42));
    }
}