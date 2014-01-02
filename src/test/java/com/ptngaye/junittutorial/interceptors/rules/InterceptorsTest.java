package com.ptngaye.junittutorial.interceptors.rules;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.RuleChain;
import org.junit.rules.TestName;
import org.junit.rules.TestRule;

public class InterceptorsTest {
    @Rule
    public TestName testNameRule = new TestName();

    @Rule
    public TestRule chain = RuleChain
            .outerRule(new LoggingRule("first rule"))
            .around(new LoggingRule("second rule"))
            .around(new LoggingRule("third rule"));

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