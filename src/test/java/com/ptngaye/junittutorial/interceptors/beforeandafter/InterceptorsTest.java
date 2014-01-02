package com.ptngaye.junittutorial.interceptors.beforeandafter;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class InterceptorsTest {
    @BeforeClass
    public static void beforeAllTest() {
        System.out.println("   beforeAllTest");
    }

    @AfterClass
    public static void afterAllTest() {
        System.out.println("   afterAllTest");
    }

    @Before
    public void beforeEachTest() {
        System.out.println("      ->beforeEachTest");
    }

    @After
    public void afterEachTest() {
        System.out.println("      ->afterEachTest");
    }

    @Test
    public void test_something() throws Exception {
        //Given

        //When

        //Then
        System.out.println("         -test_something-");
    }

    @Test
    public void test_something_else() throws Exception {
        //Given

        //When

        //Then
        System.out.println("         -test_something_else-");
    }
}