package org.example;

public class Board
{
    private String[] cells = {"1", "2", "3", "4", "5", "6", "7", "8", "9"};

    public void makeMove(char cell, String mark)
    {
        if (cell == '1')
        {
            cells[0] = mark;

        } else if (cell == '2') {
            cells[1] = mark;

        } else if (cell == '3') {
            cells[2] = mark;

        } else if (cell == '4') {
            cells[3] = mark;

        } else if (cell == '5') {
            cells[4] = mark;

        } else if (cell == '6') {
            cells[5] = mark;

        } else if (cell == '7') {
            cells[6] = mark;

        } else if (cell == '8') {
            cells[7] = mark;

        } else if (cell == '9') {
            cells[8] = mark;

        }

    }

    public String getCell(int cell)
    {
        if (cell > 0 && cell < 10)
        {
            return this.cells[cell-1];

        } else {
            return "Error: cell is out of bounds";

        }

    }

    public void clear()
    {
        this.cells[0] = "1";
        this.cells[1] = "2";
        this.cells[2] = "3";
        this.cells[3] = "4";
        this.cells[4] = "5";
        this.cells[5] = "6";
        this.cells[6] = "7";
        this.cells[7] = "8";
        this.cells[8] = "9";

    }

}