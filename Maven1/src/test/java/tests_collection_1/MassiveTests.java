package tests_collection_1;

import org.testng.Assert;
import org.testng.annotations.*;


import java.util.Arrays;
import java.util.List;

public class MassiveTests {
    List<String> userList = Arrays.asList("Cat", "Dog", "Parrot");
    @BeforeClass
    public void beforeClass () {
        System.out.println("Test classa Massiv");
    }
    @BeforeTest
    public void beforeFirst (){
        System.out.println("Nachnem 1 test potom poidut sleduychie");
    }

    @BeforeMethod
    public void beforeMethod () {
        System.out.println("Nachali test");
    }
    @AfterMethod
    public void afterMethod () {
        System.out.println("Zakochili test");
    }

    @AfterClass
    public void afterClass () {
        System.out.println("Ito bil test classa Massiv. Kakoi sleduychi test?");
    }
    @AfterTest
    public void afterThird (){
        System.out.println("Zakonchili 3 test");
    }
    @Test(description = "Optimalnoe kolichetvo pitomzev")
    public void testEquals() {
        int actual = 3;
        Assert.assertEquals(userList.size(), actual, "Zivotnih nado 3");
        System.out.println("class MassiveTests " + "method testEquals");
    }


    @Test(description = "nalichie kota")
    public void testContains() {
        Assert.assertTrue(userList.contains("Cat"), "Net Kota");
        System.out.println("class MassiveTests " + "method testContains");
    }

    @Test(description = "ne mnogo li pitomzev")
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


