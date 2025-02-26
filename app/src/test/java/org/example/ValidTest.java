package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ValidTest
{
    Validator v;
    Board b;

    @BeforeEach
    void setUpValid()
    {
        v = new Validator();
        b = new Board();

    }

    @Test
    void testInput1()
    {
        assertEquals(v.inputIsValid("1"), true);

    }

    @Test
    void testInput2()
    {
        assertEquals(v.inputIsValid("2"), true);

    }

    @Test
    void testInput3()
    {
        assertEquals(v.inputIsValid("3"), true);

    }

    @Test
    void testInput4()
    {
        assertEquals(v.inputIsValid("4"), true);

    }

    @Test
    void testInput5()
    {
        assertEquals(v.inputIsValid("5"), true);

    }

    @Test
    void testInput6()
    {
        assertEquals(v.inputIsValid("6"), true);

    }

    @Test
    void testInput7()
    {
        assertEquals(v.inputIsValid("7"), true);

    }

    @Test
    void testInput8()
    {
        assertEquals(v.inputIsValid("8"), true);

    }

    @Test
    void testInput9()
    {
        assertEquals(v.inputIsValid("9"), true);
        
    }

    @Test
    void invalidInput1()
    {
        assertEquals(v.inputIsValid("0"), false);

    }

    @Test
    void invalidInput2()
    {
        assertEquals(v.inputIsValid("10"), false);
        
    }

    @Test
    void invalidInput3()
    {
        assertEquals(v.inputIsValid("a"), false);
        
    }

    @Test
    void invalidInput4()
    {
        assertEquals(v.inputIsValid("Hello"), false);
        
    }

    @Test
    void empty1()
    {
        assertEquals(v.cellEmpty(b, '1'), true);

    }

    @Test
    void filled1()
    {
        b.makeMove(1, "X");
        assertEquals(v.cellEmpty(b, '1'), false);

    }

    @Test
    void empty2()
    {
        assertEquals(v.cellEmpty(b, '2'), true);

    }

    @Test
    void filled2()
    {
        b.makeMove(2, "X");
        assertEquals(v.cellEmpty(b, '2'), false);

    }

    @Test
    void empty3()
    {
        assertEquals(v.cellEmpty(b, '3'), true);

    }

    @Test
    void filled3()
    {
        b.makeMove(3, "X");
        assertEquals(v.cellEmpty(b, '3'), false);

    }

    @Test
    void empty4()
    {
        assertEquals(v.cellEmpty(b, '4'), true);

    }

    @Test
    void filled4()
    {
        b.makeMove(4, "X");
        assertEquals(v.cellEmpty(b, '4'), false);

    }

    @Test
    void empty5()
    {
        assertEquals(v.cellEmpty(b, '5'), true);

    }

    @Test
    void filled5()
    {
        b.makeMove(5, "X");
        assertEquals(v.cellEmpty(b, '5'), false);

    }

    @Test
    void empty6()
    {
        assertEquals(v.cellEmpty(b, '6'), true);

    }

    @Test
    void filled6()
    {
        b.makeMove(6, "X");
        assertEquals(v.cellEmpty(b, '6'), false);

    }

    @Test
    void empty7()
    {
        assertEquals(v.cellEmpty(b, '7'), true);

    }

    @Test
    void filled7()
    {
        b.makeMove(7, "X");
        assertEquals(v.cellEmpty(b, '7'), false);

    }

    @Test
    void empty8()
    {
        assertEquals(v.cellEmpty(b, '8'), true);

    }

    @Test
    void filled8()
    {
        b.makeMove(8, "X");
        assertEquals(v.cellEmpty(b, '8'), false);

    }

    @Test
    void empty9()
    {
        assertEquals(v.cellEmpty(b, '9'), true);

    }

    @Test
    void filled9()
    {
        b.makeMove(9, "X");
        assertEquals(v.cellEmpty(b, '9'), false);

    }

}