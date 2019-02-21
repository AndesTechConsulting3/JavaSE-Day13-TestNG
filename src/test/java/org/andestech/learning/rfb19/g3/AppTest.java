package org.andestech.learning.rfb19.g3;


import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

import static  org.testng.Assert.*;


public class AppTest 
{

    @BeforeTest
public static void initTest(){
    System.out.println("Test init..");

}

@AfterTest
    public static void afterTest(){
        System.out.println("Test closed..");

    }

    @BeforeClass
    public void initClass(){
        System.out.println("Class init");

    }


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
