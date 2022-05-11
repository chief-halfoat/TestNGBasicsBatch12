package class02;

import org.testng.annotations.*;

public class Testing {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @BeforeTest
    public void beforeTest (){
        System.out.println("I am BeforeTest");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("I am AfterTest");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("I am BeforeClass method");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("I am AfterClass method");
    }

    @BeforeMethod
    public void before(){
        System.out.println("this is my BeforeMethod");
    }
    @AfterMethod
    public void after(){
        System.out.println("this is my AfterMethod");
    }
    @Test
    public void Test(){
        System.out.println("drive me crazy , drive me mad");
    }
    @Test
    public void Test2(){
        System.out.println("drive me to sanity , drive me to hell");
    }
}
