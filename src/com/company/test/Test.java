package com.company.test;

import com.company.Paperback;

import static org.junit.Assert.assertEquals;

public class Test {

    @org.junit.Test
    public void testReturnBook(){
        Paperback p = new Paperback("book","liam","2");
        assertEquals("not the same", p ,p.returnItem());
    }
}
