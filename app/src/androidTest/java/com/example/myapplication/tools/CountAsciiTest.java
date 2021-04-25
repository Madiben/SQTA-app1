package com.example.myapplication.tools;

import junit.framework.TestCase;

public class CountAsciiTest extends TestCase {

    public void testSumAscii() {
        CountAscii CountA = new CountAscii();
        assertEquals("Hello World becomes Hlkko Workd",1020, CountA.SumAscii("Hello World"));
        assertEquals("Mahdi Bentaleb becomes Mahdi Nlntakln",1280,CountA.SumAscii("Mahdi Bentaleb"));
        assertEquals("Adam Nagy equals to Adam Nagy",770, CountA.SumAscii("Adam Nagy"));
        assertEquals("Software Quality and Testing becomes Softwarl Quakity and Tlsting",2629,CountA.SumAscii("Software Quality and Testing"));
        assertEquals("Weather is beautiful becomes Wlathlr is nlautifuk",1901,CountA.SumAscii("Weather is beautiful"));
        assertEquals("ELKBLN elkbln becomes LKBNKN lkbnkn",1072,CountA.SumAscii("ELKBLN elkbln"));

    }
}