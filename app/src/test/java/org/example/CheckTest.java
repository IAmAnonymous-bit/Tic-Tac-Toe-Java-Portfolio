package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class CheckTest
{
    Board b;
    Check c;

    @BeforeEach
    void setUpCheck()
    {
        b = new Board();
        c = new Check();

    }

    @Test
    void checkProgress()
    {
        b.makeMove(1, "X");
        b.makeMove(5, "O");
        assertEquals(c.currentState(b), "Game in Progress...");

    }

    @Test
    void checkRow1()
    {
        b.makeMove(1, "X");
        b.makeMove(2, "X");
        b.makeMove(3, "X");
        assertEquals(c.currentState(b), "The Winner is: Player X");

    }

    @Test
    void checkRow2()
    {
        b.makeMove(4, "O");
        b.makeMove(5, "O");
        b.makeMove(6, "O");
        assertEquals(c.currentState(b), "The Winner is: Player O");

    }

    @Test
    void checkRow3()
    {
        b.makeMove(7, "X");
        b.makeMove(8, "X");
        b.makeMove(9, "X");
        assertEquals(c.currentState(b), "The Winner is: Player X");

    }

    @Test
    void checkCol1()
    {
        b.makeMove(1, "O");
        b.makeMove(4, "O");
        b.makeMove(7, "O");
        assertEquals(c.currentState(b), "The Winner is: Player O");

    }

    @Test
    void checkCol2()
    {
        b.makeMove(2, "X");
        b.makeMove(5, "X");
        b.makeMove(8, "X");
        assertEquals(c.currentState(b), "The Winner is: Player X");

    }

    @Test
    void checkCol3()
    {
        b.makeMove(3, "O");
        b.makeMove(6, "O");
        b.makeMove(9, "O");
        assertEquals(c.currentState(b), "The Winner is: Player O");

    }

    @Test
    void checkDia1()
    {
        b.makeMove(1, "X");
        b.makeMove(5, "X");
        b.makeMove(9, "X");
        assertEquals(c.currentState(b), "The Winner is: Player X");

    }

    @Test
    void checkDia2()
    {
        b.makeMove(3, "O");
        b.makeMove(5, "O");
        b.makeMove(7, "O");
        assertEquals(c.currentState(b), "The Winner is: Player O");

    }

    @Test 
    void checkTie()
    {
        b.makeMove(1, "X");
        b.makeMove(2, "X");
        b.makeMove(3, "O");
        b.makeMove(4, "O");
        b.makeMove(5, "O");
        b.makeMove(6, "X");
        b.makeMove(7, "X");
        b.makeMove(8, "O");
        b.makeMove(9, "X");
        assertEquals(c.currentState(b), "Game is a Tie");

    }

}