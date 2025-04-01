package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

public class ResultTest
{
    Result r;

    @BeforeEach
    void setUpResult()
    {
        r = new Result();

    }

    @Test
    void testX()
    {
        assertEquals(r.getResult("X"),"The Winner is: Player X");

    }

    @Test
    void testY()
    {
        assertEquals(r.getResult("O"), "The Winner is: Player O");

    }

    @Test
    void finalTest()
    {
        assertEquals(r.getResult("Yeah...It's a tie..."), "Yeah...It's a tie...");

    }


}