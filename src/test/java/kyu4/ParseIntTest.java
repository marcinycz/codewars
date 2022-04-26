package kyu4;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ParseIntTest {
    @Test
    public void fixedTests() {
        assertEquals(1 , ParseInt.parseInt("one"));
        assertEquals(15 , ParseInt.parseInt("fifteen"));
        assertEquals(20 , ParseInt.parseInt("twenty"));
        assertEquals(46 , ParseInt.parseInt("forty-six"));
        assertEquals(246 , ParseInt.parseInt("two hundred forty-six"));
        assertEquals(2046 , ParseInt.parseInt("two thousand forty-six"));
        assertEquals(100 , ParseInt.parseInt("hundred"));
        assertEquals(1000 , ParseInt.parseInt("thousand"));
        assertEquals(46000 , ParseInt.parseInt("forty-six thousand"));
        assertEquals(666666 , ParseInt.parseInt("six hundred sixty-six thousand six hundred sixty-six"));
        assertEquals(700000 , ParseInt.parseInt("seven hundred thousand"));
        assertEquals(354743 , ParseInt.parseInt("three hundred and fifty-four thousand seven hundred forty-three"));
    }
}
