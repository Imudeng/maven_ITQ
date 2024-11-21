package tests_collection_1;

import org.testng.Assert;
import org.testng.annotations.*;


import java.util.Arrays;
import java.util.List;

class MassiveTests {
    List<String> userList = Arrays.asList("Cat", "Dog", "Parrot");

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
    @Test(description = "Optimalnoe kolichetvo pitomzev", groups ="estkot.spec")
    public void testEquals() {
        int actual = 3;
        Assert.assertEquals(userList.size(), actual, "Zivotnih nado 3");
        System.out.println("class MassiveTests " + "method testEquals");
    }


    @Test(description = "nalichie kota", groups = "estkot")
    public void testContains() {
        Assert.assertTrue(userList.contains("Cat"), "Net Kota");
        System.out.println("class MassiveTests " + "method testContains");
    }

    @Test(description = "ne mnogo li pitomzev", dependsOnGroups = "estkot.*")
    public void testCompare() {
        boolean expected = true;
        boolean actual = isCompare(userList.size());
        Assert.assertEquals(expected, actual, "Polnii dom");
        System.out.println("class MassiveTests " + "method testCompare");
    }

    private boolean isCompare(int number) {
        return number < 7;
    }

}






