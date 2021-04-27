package jtest;

import static org.junit.Assert.assertEquals;


import org.junit.Test;

public class userTest {
    @Test
    public void testadd() {
        user classUnderTest = new user();
        assertEquals(true, classUnderTest.validate("Abhishek"));
        assertEquals(true, classUnderTest.validate2("Kumar"));
        assertEquals(true, classUnderTest.validate1("abhishekkumar24717@gmail.com"));
        assertEquals(true, classUnderTest.validate3("8368915120"));
        assertEquals(true, classUnderTest.validate4("Engineer@21"));
        //assertEquals(false, classUnderTest.validate5("hello"));
    }

	
}
