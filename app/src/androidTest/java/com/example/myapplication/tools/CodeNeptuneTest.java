package com.example.myapplication.tools;

import junit.framework.TestCase;

import org.junit.Test;

public class CodeNeptuneTest extends TestCase {
    @Test
    public void testCodesentance() {
        CodeNeptune Cn = new CodeNeptune();
        assertEquals("Hello World becomes Hlkko Workd","Hlkko Workd", Cn.codesentance("Hello World"));
        assertEquals("Mahdi Bentaleb becomes Mahdi Nlntakln","Mahdi Nlntakln",Cn.codesentance("Mahdi Bentaleb"));
        assertEquals("Adam Nagy equals to Adam Nagy","Adam Nagy", Cn.codesentance("Adam Nagy"));
        assertEquals("Software Quality and Testing becomes Softwarl Quakity and Tlsting","Softwarl Quakity and Tlsting",Cn.codesentance("Software Quality and Testing"));
        assertEquals("Weather is beautiful becomes Wlathlr is nlautifuk","Wlathlr is nlautifuk",Cn.codesentance("Weather is beautiful"));
        assertEquals("ELKBLN elkbln becomes LKBNKN lkbnkn","LKBNKN lkbnkn",Cn.codesentance("ELKBLN elkbln"));

    }
}