package com.cybertek.tests.day6_testng_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {

    @BeforeClass
    public void setupClass(){
        System.out.println("-----> Before CLASS is running...");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("-----> After CLASS is running...");
    }

    @BeforeMethod
    public void setupMethod(){
        System.out.println("---> before method is running...");

    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("---> after method is running...");
    }

    @Test(priority = 1)
    public void test1(){
        System.out.println("Running test 1...");

        String actual = "apple";
        String expected = "apples";

        Assert.assertEquals(actual,expected);//if assertion is failed, it will stop executing that test and continue with next test
    }

    @Test(priority = 2)
    public void test2(){
        System.out.println("Running test 2...");

        String actual = "apple";
        String expected = "apples";

        Assert.assertTrue(actual.equals(expected));
    }


}
