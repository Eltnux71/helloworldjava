package com.example.dockerfile;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class HelloWorldPingTest {

        private final PrintStream standardOut = System.out;
        private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

        @Before
        public void setUp() {
                System.setOut(new PrintStream(outputStreamCaptor));
        }

        @Test
        public void mainTest() throws Exception {
                HelloWorldPing.main(null);
                Assert.assertEquals("Hello Baeldung Readers!!", outputStreamCaptor.toString().trim());
        }

}