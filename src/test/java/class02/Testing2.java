package class02;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testing2 {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Another BeforeSuite");
    }
    @Test
    public void test3(){
        System.out.println("print");
    }
    @Test
    public void test4(){
        System.out.println("print more");
    }
}
