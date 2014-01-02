package com.ptngaye.junittutorial.interceptors.rules;

import org.junit.rules.TestRule;
import org.junit.runner.Description;
import org.junit.runners.model.Statement;

public class LoggingRule implements TestRule {
    private String message;

    public LoggingRule(String message) {
        this.message = message;
    }

    @Override
    public Statement apply(Statement base, Description description) {
        System.out.println(message);
        return base;
    }
}
