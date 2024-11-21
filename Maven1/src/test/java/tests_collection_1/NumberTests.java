package tests_collection_1;

import org.testng.Assert;
import org.testng.annotations.*;

public class NumberTests {
    int userNumber = 5;
    @BeforeSuite
    public void beforeSuit() {
        System.out.println("Nachali SuitMassiveTest");
    }
    @AfterSuite
    public void afterSuit() {
        System.out.println("Zakochili SuitMassiveTest");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Test classa Massiv");
    }

    @BeforeTest
    public void beforeFirst() {
        System.out.println("Nachnem MassiveTests");
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
        System.out.println("Ito bil poslednii test classa Massiv. Kakoi sleduychi test?");
    }

    @AfterTest
    public void afterThird() {
        System.out.println("Zakonchili MassiveTests");
    }

    @BeforeGroups ("estkot")
    public void beforeGroupCat() {
        System.out.println("vot eto testi dlia kota");
    }
    @AfterGroups ("estkot")
    public void afterGroupCat() {
        System.out.println("testi pro kota proiden");
    }
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

