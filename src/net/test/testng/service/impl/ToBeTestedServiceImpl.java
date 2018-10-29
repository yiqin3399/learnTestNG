package net.test.testng.service.impl;

import net.test.testng.service.ToBeTestedService;

public class ToBeTestedServiceImpl implements ToBeTestedService {

    @Override
    public String returnString() {
        return "a string";
    }

    @Override
    public Object returnObject() {
        return null;
    }
}
