package tests_collection_1;

import org.testng.Assert;
import org.testng.annotations.*;

public class NumberTests {
    int userNumber = 4;

    @BeforeSuite
    public void beforeSuit() {
        System.out.println("Nachali SuitNumberTest");
    }

    @AfterSuite
    public void afterSuit() {
        System.out.println("Zakochili SuitNumberTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Test classa Number");
    }

    @BeforeTest
    public void beforeFirst() {
        System.out.println("Nachnem NumberTests");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Nachali test");
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Zakochili test");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Ito bil poslednii test classa Number. Kakoi sleduychi test?");
    }

    @AfterTest
    public void afterThird() {
        System.out.println("Zakonchili NumberTests");
    }

    @BeforeGroups("ravenstvo")
    public void beforeGroupCat() {
        System.out.println("sravnivaem s aktualnim");
    }

    @AfterGroups("ravenstvo")
    public void afterGroupCat() {
        System.out.println("ravenstvo provereno");
    }

    @Test(groups = "ravenstvo")
    public void testEquals() {
        int actual = 4;
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

