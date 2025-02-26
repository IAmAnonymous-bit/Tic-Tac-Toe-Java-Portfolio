package org.example;

public class Check
{
    private String win = "The Winner is: Player ";
    private String cont = "Game in Progress...";
    private String tie = "Game is a Tie";

    public String currentState(Board b)
    {
        if (b.getCell(1) == b.getCell(2) && b.getCell(1) == b.getCell(3))
        {
            return win + b.getCell(1);

        } else if (b.getCell(4) == b.getCell(5) && b.getCell(4) == b.getCell(6)) {
            return win + b.getCell(4);

        } else if (b.getCell(7) == b.getCell(8) && b.getCell(7) == b.getCell(9)) {
            return win + b.getCell(7);

        } else if (b.getCell(1) == b.getCell(4) && b.getCell(1) == b.getCell(7)) {
            return win + b.getCell(1);

        } else if (b.getCell(2) == b.getCell(5) && b.getCell(2) == b.getCell(8)) {
            return win + b.getCell(2);

        } else if (b.getCell(3) == b.getCell(6) && b.getCell(3) == b.getCell(9)) {
            return win + b.getCell(3);

        } else if (b.getCell(1) == b.getCell(5) && b.getCell(1) == b.getCell(9)) {
            return win + b.getCell(1);

        } else if (b.getCell(3) == b.getCell(5) && b.getCell(3) == b.getCell(7)) {
            return win + b.getCell(3);

        } else if (b.getCell(1) != "1" && b.getCell(2) != "2" && b.getCell(3) != "3" && b.getCell(4) != "4" && b.getCell(5) != "5" && b.getCell(6) != "6" && b.getCell(7) != "7" && b.getCell(8) != "8" && b.getCell(9) != "9"){
            return tie;

        } else {
            return cont;

        }

    }

}