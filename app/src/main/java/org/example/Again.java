package org.example;
import java.util.Scanner;

public class Again
{
    public boolean playAgain(Scanner s)
    {
        char acceptedInput = ' ';
        boolean stillGoing = true;

        System.out.println("Want To Play Again? (Y/N)");
        while (stillGoing)
        {
            String answer = s.nextLine();
            System.out.println(answer + "\n");

            if (answer.length() == 1 && (answer.charAt(0) == 'y' || answer.charAt(0) == 'Y'))
            {
                acceptedInput = answer.charAt(0);
                stillGoing = false;

            } else if (answer.length() == 1 && (answer.charAt(0) == 'n' || answer.charAt(0) == 'N')) {
                acceptedInput = answer.charAt(0);
                stillGoing = false;

            } else {
                System.out.println("Invalid Input: Please Enter \"Y\" or \"N\"");

            }

        }

        if (acceptedInput == 'y' || acceptedInput == 'Y')
        {
            return true;

        } else {
            return false;

        }

    }

}