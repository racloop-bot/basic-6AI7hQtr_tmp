package com.example;

import org.junit.Test;

import static org.junit.Assert.*;

public class RemovedCallBugTest {

    @Test
    public void test() throws InterruptedException {
       assertTrue(new RemovedCallBug().doSomething());
    }
}
