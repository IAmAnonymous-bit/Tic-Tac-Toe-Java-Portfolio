package org.example;
import java.io.FileOutputStream;

public class Result
{
    private String p1Mark = "X";
    private String p2Mark = "O";
    private String win  = "The Winner is: Player ";
    private int p1Count = 0;
    private int p2Count = 0;
    private int tieCount = 0;

    public String getResult(String state)
    {
        if (state == p1Mark)
        {
            p1Count++;
            return win + p1Mark;

        } else if (state == p2Mark) {
            p2Count++;
            return win + p2Mark;

        } else {
            tieCount++;
            return state;

        }

    }

    public void getLog()
    {
        System.out.println("The Current Log is:");
        System.out.println("Player " + p1Mark + " Wins: " + p1Count);
        System.out.println("Player " + p2Mark + " Wins: " + p2Count);
        System.out.println("Ties: " + tieCount + "\n");

    }

    public void writeLog()
    {
        String entry = "Last Game Log: \n";
        entry += "Player " + p1Mark + " Wins: " + p1Count + "\n";
        entry += "Player " + p2Mark + " Wins: " + p2Count + "\n";
        entry += "Ties: " + tieCount;

        try
        {
            FileOutputStream f = new FileOutputStream("disk.txt");
            byte[] writeDisk = entry.getBytes();
            f.write(writeDisk);
            f.close();

        } catch (Exception e) {

        }

    }

}