package tests_collection_1;

import org.testng.Assert;
import org.testng.annotations.*;

public class WordTests {
    String userWord = "Hello";

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
