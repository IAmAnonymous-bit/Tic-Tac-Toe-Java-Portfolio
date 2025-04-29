package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class ComputerTest
{
    Board b;
    Computer c;

    @BeforeEach
    void setUpComputer()
    {
        b = new Board();
        c = new Computer();

    }

    @Test
    void moveMiddle()
    {
        c.computerMove(b, "A", 2);
        assertEquals(b.getCell(5), "A");

    }

    @Test
    void move12to3()
    {
        b.makeMove('1', "X");
        b.makeMove('2', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(3), "A");

    }

    @Test
    void move13to2()
    {
        b.makeMove('1', "X");
        b.makeMove('3', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(2), "A");

    }

    @Test
    void move23to1()
    {
        b.makeMove('2', "X");
        b.makeMove('3', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(1), "A");

    }

    @Test
    void move45to6()
    {
        b.makeMove('4', "X");
        b.makeMove('5', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(6), "A");

    }

    @Test
    void move46to5()
    {
        b.makeMove('4', "X");
        b.makeMove('6', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(5), "A");

    }

    @Test
    void move56to4()
    {
        b.makeMove('5', "X");
        b.makeMove('6', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(4), "A");

    }

    @Test
    void move78to9()
    {
        b.makeMove('7', "X");
        b.makeMove('8', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(9), "A");

    }

    @Test
    void move79to8()
    {
        b.makeMove('7', "X");
        b.makeMove('9', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(8), "A");

    }

    @Test
    void move89t07()
    {
        b.makeMove('8', "X");
        b.makeMove('9', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(7), "A");

    }

    @Test
    void move14to7()
    {
        b.makeMove('1', "X");
        b.makeMove('4', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(7), "A");

    }

    @Test
    void move17to4()
    {
        b.makeMove('1', "X");
        b.makeMove('7', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(4), "A");

    }

    @Test
    void move47to1()
    {
        b.makeMove('4', "X");
        b.makeMove('7', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(1), "A");

    }

    @Test
    void move25to8()
    {
        b.makeMove('2', "X");
        b.makeMove('5', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(8), "A");

    }

    @Test
    void move28to5()
    {
        b.makeMove('2', "X");
        b.makeMove('8', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(5), "A");

    }

    @Test
    void move58to2()
    {
        b.makeMove('5', "X");
        b.makeMove('8', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(2), "A");

    }

    @Test
    void move36to9()
    {
        b.makeMove('3', "X");
        b.makeMove('6', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(9), "A");

    }

    @Test
    void move39to6()
    {
        b.makeMove('3', "X");
        b.makeMove('9', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(6), "A");

    }

    @Test
    void move69to3()
    {
        b.makeMove('6', "X");
        b.makeMove('9', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(3), "A");

    }

    @Test
    void move15to9()
    {
        b.makeMove('1', "X");
        b.makeMove('5', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(9), "A");

    }

    @Test
    void move19to5()
    {
        b.makeMove('1', "X");
        b.makeMove('9', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(5), "A");

    }

    @Test
    void move59to1()
    {
        b.makeMove('5', "X");
        b.makeMove('9', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(1), "A");

    }

    @Test
    void move35to7()
    {
        b.makeMove('3', "X");
        b.makeMove('5', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(7), "A");

    }

    @Test
    void move37to5()
    {
        b.makeMove('3', "X");
        b.makeMove('7', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(5), "A");

    }

    @Test
    void move57to3()
    {
        b.makeMove('5', "X");
        b.makeMove('7', "X");
        c.computerMove(b, "A", 5);
        assertEquals(b.getCell(3), "A");

    }

}