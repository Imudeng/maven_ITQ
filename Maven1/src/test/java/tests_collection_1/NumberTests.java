package tests_collection_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NumberTests {
    int userNumber = 5;

    @Test
    public void testEquals() {
        int actual = 5;
        Assert.assertEquals(userNumber, actual, "Ravenstvo ne podtverzdeno");
        System.out.println("class NumberTests " + "method testEquals");
    }

    @Test
    public void testCompare() {
        boolean expected = true;
        boolean actual = isCompare(userNumber);
        Assert.assertEquals(expected, actual, "Chislo menshe 10");
        System.out.println("class NumberTests " + "method testCompare");
    }

    private boolean isCompare(int number) {
        return number > 10;
    }

    @Test
    public void testChet() {
        boolean expected = true;
        boolean actual = isChet(userNumber);
        Assert.assertEquals(expected, actual, "Chislo nechetnoe");
        System.out.println("class NumberTests " + "method testChet");
    }

    private boolean isChet(int number) {
        return number % 2 == 0;
    }
}

