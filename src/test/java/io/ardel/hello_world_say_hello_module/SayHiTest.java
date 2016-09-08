package io.ardel.hello_world_say_hello_module;

import org.junit.*;
import org.junit.Test;
import static org.junit.Assert.*;

public class SayHiTest
{

    @Test
    public void testReturnsHiLoretta(){
        String expectedResponse = "Hi Loretta";
        assertEquals(expectedResponse, SayHi.message("Loretta"));
    }

    @Test
    public void testReturnsHiAnthony(){
        String expectedResponse = "Hi Anthony";
        assertEquals(expectedResponse, SayHi.message("Anthony"));
    }

}
