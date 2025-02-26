package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class BoardTest
{
    Board b;

    @BeforeEach
    void setUpBoard()
    {
        b = new Board();
        b.makeMove('1', "X");
        b.makeMove('2', "X");
        b.makeMove('3', "X");
        b.makeMove('4', "X");
        b.makeMove('5', "X");
        b.makeMove('6', "X");
        b.makeMove('7', "X");
        b.makeMove('8', "X");
        b.makeMove('9', "X");

    }

    @Test
    void check1()
    {
        assertEquals(b.getCell(1), "X");

    }

    @Test
    void check2()
    {
        assertEquals(b.getCell(2), "X");

    }

    @Test
    void check3()
    {
        assertEquals(b.getCell(3), "X");

    }

    @Test
    void check4()
    {
        assertEquals(b.getCell(4), "X");

    }

    @Test
    void check5()
    {
        assertEquals(b.getCell(5), "X");

    }

    @Test
    void check6()
    {
        assertEquals(b.getCell(6), "X");

    }

    @Test
    void check7()
    {
        assertEquals(b.getCell(7), "X");

    }

    @Test
    void check8()
    {
        assertEquals(b.getCell(8), "X");

    }

    @Test
    void check9()
    {
        assertEquals(b.getCell(9), "X");

    }

    @Test
    void check1clear()
    {
        b.clear();
        assertEquals(b.getCell(1), "1");

    }

    @Test
    void check2clear()
    {
        b.clear();
        assertEquals(b.getCell(2), "2");

    }

    @Test
    void check3clear()
    {
        b.clear();
        assertEquals(b.getCell(3), "3");

    }

    @Test
    void check4clear()
    {
        b.clear();
        assertEquals(b.getCell(4), "4");

    }

    @Test
    void check5clear()
    {
        b.clear();
        assertEquals(b.getCell(5), "5");

    }

    @Test
    void check6clear()
    {
        b.clear();
        assertEquals(b.getCell(6), "6");

    }

    @Test
    void check7clear()
    {
        b.clear();
        assertEquals(b.getCell(7), "7");

    }

    @Test
    void check8clear()
    {
        b.clear();
        assertEquals(b.getCell(8), "8");

    }

    @Test
    void check9clear()
    {
        b.clear();
        assertEquals(b.getCell(9), "9");

    }

}
