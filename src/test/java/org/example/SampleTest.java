package org.example;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

@Test(groups = {"GROUP 1"})
public class SampleTest extends AbstractClass{

    @BeforeClass(alwaysRun = true, dependsOnMethods = {"setupMethod2"})
    public void setupMethod3(){
        System.out.println("setupMethod3");
    }

    public void testMethod1() {
        System.out.println("testMethod1");
    }
}
