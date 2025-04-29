package org.example;
import java.util.Scanner;

public class Select
{
    public int selectMode(Scanner s)
    {
        boolean stillGoing = true;
        int outputInt = 0;

        System.out.println("Select Your Game Mode!\n");
        System.out.println("    1. Human vs Human (Enter 1)");
        System.out.println("    2. Human vs Computer (Enter 2)");
        System.out.println("    3. Computer vs Human (Enter 3)\n");

        while (stillGoing)
        {
            String answer = s.nextLine();
            System.out.println(answer + "\n");

            if (answer.length() == 1 && answer.charAt(0) == '1')
            {
                stillGoing = false;
                outputInt = 1;

            } else if (answer.length() == 1 && answer.charAt(0) == '2') {
                stillGoing = false;
                outputInt = 2;

            } else if (answer.length() == 1 && answer.charAt(0) == '3') {
                stillGoing = false;
                outputInt = 3;

            } else {
                System.out.println("Invalid Input: Please Enter 1-3");

            }

        }

        return outputInt;

    }

}