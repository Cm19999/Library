package com.company;

import com.company.Paperback;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class testPaperback {

    @org.junit.Test
    public void testReturnBook(){
        Paperback p = new Paperback("book","liam","2");
        assertEquals("not the same", p ,p.returnItem());
    }
    @Test
    public void testUse(){
        Paperback p3= new Paperback("booked","adam","3");
        assertEquals("incorrect output","Flicks through pages...",p3.use());
    }

}