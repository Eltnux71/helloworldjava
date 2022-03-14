package com.example.dockerfile;

import org.junit.Before;
import org.junit.Assert;
import org.junit.Test;
import com.google.common.base.Splitter;
import com.google.common.collect.Lists;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

public class MainTest {

        private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

        @Before
        public void setUp() {
                System.setOut(new PrintStream(outputStreamCaptor));
        }

        @Test
        public void mainTest() throws Exception {
                Main.main(null);
                String line = new String(outputStreamCaptor.toByteArray());
                Iterable<String> myIterator = Splitter.on(System.getProperty("line.separator")).split(line);
                List<String> myList = Lists.newArrayList(myIterator);
                for (int i = 0; i < Util.TIMES_TO_REPEAT; i++) {
                        Assert.assertEquals(("Hello World Ping " + i), myList.get(i).toString().trim());
                }

        }

}