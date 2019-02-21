package org.andestech.learning.rfb19.g3;


import org.testng.annotations.Test;
import org.testng.Assert;

import static  org.testng.Assert.*;


public class AppTest 
{

    public AppTest(){
        System.out.println("+++ ctor, object: " + this);
    }

    @Test(priority = 3, groups = {"fast"})
public void ng1test()
{
    Assert.assertTrue(1==1, "Ok!!");
    Assert.assertFalse(1==2);

    System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

}

    @Test(priority = 2)
    public void ng2test()
    {
        Assert.assertTrue(1==1, "Ok!!");
        Assert.assertFalse(1==2);

        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());

    }


}
