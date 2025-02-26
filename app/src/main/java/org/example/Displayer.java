package org.example;

public class Displayer
{
    private String v = " | ";
    private String h = "-----------";

    public void display(Board b)
    {
        System.out.println("\n" + " " + b.getCell(1) + v + b.getCell(2) + v + b.getCell(3) + " " + "\n" + h);
        System.out.println(" " + b.getCell(4) + v + b.getCell(5) + v + b.getCell(6) + " " + "\n" + h);
        System.out.println(" " + b.getCell(7) + v + b.getCell(8) + v + b.getCell(9) + " " + "\n");

    }

}