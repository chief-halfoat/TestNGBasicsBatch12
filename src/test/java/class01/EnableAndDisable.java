package class01;

import org.testng.annotations.Test;

public class EnableAndDisable {

    @Test
    public void print(){
        System.out.println("test test test");
    }


    @Test(enabled = false)
    public void first(){
        System.out.println("1st");
    }
    @Test(enabled = true)
    public void second(){
        System.out.println("2nd");
    }
    @Test(enabled = false)
    public void third(){
        System.out.println("3rd");
    }
}
