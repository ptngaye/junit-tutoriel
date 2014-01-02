package com.ptngaye.junittutorial.interceptors.rules;

import org.junit.rules.ExpectedException;
import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class NothingRule implements TestRule {
    @Override
    public Statement apply(Statement base, Description description) {
        System.out.println("NothingRule !!!");
        return base;
    }
}
