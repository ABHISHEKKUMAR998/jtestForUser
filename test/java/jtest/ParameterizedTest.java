package jtest;


import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;
  

  

@RunWith(Parameterized.class)
public class ParameterizedTest {
  
    @Parameters(name = "{index}: {1} is valid email address = {0}")
    public static Collection data() {
        return Arrays.asList(new Object[][] { 
         { true, "john@mycomp.com" },           { true,  "john123@mycomp.com" },
         { false, "j+._%20_-brown@mycomp.com" }, { true,  "123@mycomp.com" },
         { false, "john brown@mycomp.com" },    { false, "123@mycomp" },
         { false, "john^brown@mycomp.com" },    { true , "1john@mycomp.com" },
         { false, "john#brown@mycomp.com" },    { false, "john!brown@mycomp.com" },
         { false, "john()brown@mycomp.com" },   { false, "john=brown@mycomp.com" },
         { false,  "johñ.brown@mycomp.com" },    { false, "john.brown@mycomp.coñ" },
         { false,  "johú@mycomp.com" },          { false,  "johíáó@mycomp.com" }
        });
    }
    
    private boolean expected;
    private String emailAddress;
    private  user  val;
    
  
    public ParameterizedTest(boolean expected, String emailAddress) {
        this.expected = expected;
        this.emailAddress = emailAddress;
    }
    @Before 
    public void initiliaze() {
    	  val  = new user();
    }
  
    @Test
    public void validateEmail() {
        assertEquals(expected,val.validateEmail(emailAddress));
    }
}


