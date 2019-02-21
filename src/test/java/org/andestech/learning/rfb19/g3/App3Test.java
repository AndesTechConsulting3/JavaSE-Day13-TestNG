package org.andestech.learning.rfb19.g3;


import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class App3Test
{

    @BeforeSuite
    public static void beforeSuite(){
        System.out.println("Before Suite!!");

    }

    public App3Test(){
        System.out.println("+++ ctor, object: " + this);
    }

   // @Ignore
    @Test(timeOut = 20)
   public void ng5test() throws InterruptedException
{
    Assert.assertTrue(1==1, "Ok!!");
    Assert.assertFalse(1==2);



    Thread.sleep(45);



    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

}

    @Test(dependsOnMethods = "ng5test")
    public void ng6test()
    {

        Assert.assertTrue(1==1, "Ok!!");
        Assert.assertFalse(1==2);

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }

    @Test(parameters = {"name"})
    public void ngParamstest(@Optional("NoName") String param)
    {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
        System.out.println("param:" + param);
    }


    @Test(parameters = {"a","b","c"})
    public void summaTest(int x, int y, int summa)
    {
        System.out.printf("a:%s, b:%s, c:%s", x,y,summa);
    }


}
