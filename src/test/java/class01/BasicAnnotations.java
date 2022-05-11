package class01;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BasicAnnotations {

    @Test(groups = "smoke")
    public void firstTest(){
        System.out.println("This is my first test case");
    }

    @Test
    public void secondTest(){
        System.out.println("This is my second test case");
    }
    @Test
    public void thirdTest(){
        System.out.println("This is my third test case");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("******************I AM PRECONDITION******************");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("^^^^^^^^^^^^^^^^^^I AM POSTCONDITION^^^^^^^^^^^^^^^^^^");
    }

}
