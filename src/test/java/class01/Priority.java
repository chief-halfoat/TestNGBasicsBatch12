package class01;

import org.testng.annotations.Test;

public class Priority {

    @Test(priority = 3)
    public void first(){
        System.out.println("1st");
    }
    @Test(priority = 3)
    public void second(){
        System.out.println("2nd");
    }
    @Test(priority = 1)
    public void third(){
        System.out.println("3rd");
    }
}
