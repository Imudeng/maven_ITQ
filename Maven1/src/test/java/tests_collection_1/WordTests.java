package tests_collection_1;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WordTests {
    String userWord = "Hello";

    @Test(description = "sravnim s privetom")
    public void testEqualsLength() {
        int actual = 5;
        Assert.assertEquals(userWord.length(), actual, "Dlinna ne 5");
        System.out.println("class WordTests " + "method testEqualsLength");

    }

    @Test(description = "a eto priveet")
    public void testCompare() {
        String actual = "Hello";
        Assert.assertEquals(userWord, actual, "Slova raznie");
        System.out.println("class WordTests " + "method testCompare");
    }

    @Test
    public void testIsEmpty() {
        Assert.assertFalse(userWord.isEmpty(), "Stroka pustia");
        System.out.println("class WordTests " + "method testIsEmpty");
    }
}
