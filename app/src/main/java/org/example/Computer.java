package org.example;
import java.lang.Math;

public class Computer
{
    public void computerMove(Board b, String mark, int turn)
    {
        if (turn == 1)
        {
            int turn1 = (int)(Math.random() * 4) + 1;
            if (turn1 == 1)
            {
                b.makeMove('1', mark);

            } else if (turn1 == 2) {
                b.makeMove('3', mark);

            } else if (turn1 == 3) {
                b.makeMove('7', mark);

            } else {
                b.makeMove('9', mark);

            }

        } else if (turn == 2 && b.getCell(5) == "5") {
            b.makeMove('5', mark);

        } else if (b.getCell(1) == b.getCell(2) && b.getCell(3) == "3") {
            b.makeMove('3', mark);

        } else if (b.getCell(1) == b.getCell(3) && b.getCell(2) == "2") {
            b.makeMove('2', mark);

        } else if (b.getCell(2) == b.getCell(3) && b.getCell(1) == "1") {
            b.makeMove('1', mark);

        } else if (b.getCell(4) == b.getCell(5) && b.getCell(6) == "6") {
            b.makeMove('6', mark);

        } else if (b.getCell(4) == b.getCell(6) && b.getCell(5) == "5") {
            b.makeMove('5', mark);

        } else if (b.getCell(5) == b.getCell(6) && b.getCell(4) == "4") {
            b.makeMove('4', mark);

        } else if (b.getCell(7) == b.getCell(8) && b.getCell(9) == "9") {
            b.makeMove('9', mark);

        } else if (b.getCell(7) == b.getCell(9) && b.getCell(8) == "8") {
            b.makeMove('8', mark);

        } else if (b.getCell(8) == b.getCell(9) && b.getCell(7) == "7") {
            b.makeMove('7', mark);

        } else if (b.getCell(1) == b.getCell(4) && b.getCell(7) == "7") {
            b.makeMove('7', mark);

        } else if (b.getCell(1) == b.getCell(7) && b.getCell(4) == "4") {
            b.makeMove('4', mark);

        } else if (b.getCell(4) == b.getCell(7) && b.getCell(1) == "1") {
            b.makeMove('1', mark);

        } else if (b.getCell(2) == b.getCell(5) && b.getCell(8) == "8") {
            b.makeMove('8', mark);

        } else if (b.getCell(2) == b.getCell(8) && b.getCell(5) == "5") {
            b.makeMove('5', mark);

        } else if (b.getCell(5) == b.getCell(8) && b.getCell(2) == "2") {
            b.makeMove('2', mark);

        } else if (b.getCell(3) == b.getCell(6) && b.getCell(9) == "9") {
            b.makeMove('9', mark);

        } else if (b.getCell(3) == b.getCell(9) && b.getCell(6) == "6") {
            b.makeMove('6', mark);

        } else if (b.getCell(6) == b.getCell(9) && b.getCell(3) == "3") {
            b.makeMove('3', mark);

        } else if (b.getCell(1) == b.getCell(5) && b.getCell(9) == "9") {
            b.makeMove('9', mark);

        } else if (b.getCell(1) == b.getCell(9) && b.getCell(5) == "5") {
            b.makeMove('5', mark);

        } else if (b.getCell(5) == b.getCell(9) && b.getCell(1) == "1") {
            b.makeMove('1', mark);

        } else if (b.getCell(3) == b.getCell(5) && b.getCell(7) == "7") {
            b.makeMove('7', mark);

        } else if (b.getCell(3) == b.getCell(7) && b.getCell(5) == "5") {
            b.makeMove('5', mark);

        } else if (b.getCell(5) == b.getCell(7) && b.getCell(3) == "3") {
            b.makeMove('3', mark);

        } else {
            boolean stillGoing = true;

            while (stillGoing) 
            {
                int randMove = (int)(Math.random() * 9) + 1;

                if (randMove == 1 && b.getCell(1) == "1")
                {
                    stillGoing = false;
                    b.makeMove('1', mark);

                } else if (randMove == 2 && b.getCell(2) == "2") {
                    stillGoing = false;
                    b.makeMove('2', mark);

                } else if (randMove == 3 && b.getCell(3) == "3") {
                    stillGoing = false;
                    b.makeMove('3', mark);

                } else if (randMove == 4 && b.getCell(4) == "4") {
                    stillGoing = false;
                    b.makeMove('4', mark);

                } else if (randMove == 5 && b.getCell(5) == "5") {
                    stillGoing = false;
                    b.makeMove('5', mark);

                } else if (randMove == 6 && b.getCell(6) == "6") {
                    stillGoing = false;
                    b.makeMove('6', mark);

                } else if (randMove == 7 && b.getCell(7) == "7") {
                    stillGoing = false;
                    b.makeMove('7', mark);

                } else if (randMove == 8 && b.getCell(8) == "8") {
                    stillGoing = false;
                    b.makeMove('8', mark);

                } else if (randMove == 9 && b.getCell(9) == "9") {
                    stillGoing = false;
                    b.makeMove('9', mark);

                }

            }

        }

    }

}