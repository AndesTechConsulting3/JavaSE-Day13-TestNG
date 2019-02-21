package org.andestech.learning.rfb19.g3;


import org.testng.Assert;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;


public class App2Test
{

    public App2Test(){
        System.out.println("+++ ctor, object: " + this);
    }

   // @Ignore
    @Test(priority = 1, groups = {"fast"})
   public void ng3test()
{
    Assert.assertTrue(1==1, "Ok!!");
    Assert.assertFalse(1==2);

    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

}

    @Test(priority = -1, groups = {"fast", "slow"})
    public void ng4test()
    {
        Assert.assertTrue(1==1, "Ok!!");
        Assert.assertFalse(1==2);

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }


}
