package org.example;

import org.testng.annotations.BeforeClass;

public class AbstractClass {


    @BeforeClass(alwaysRun = true)
    public void setupMethod1() {
        System.out.println("setupMethod1");
    }

    @BeforeClass(alwaysRun = true, dependsOnMethods = {"setupMethod1"})
    public void setupMethod2() {
        System.out.println("setupMethod2");
    }
}
