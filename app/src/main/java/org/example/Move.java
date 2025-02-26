package org.example;
import java.util.Scanner;

public class Move
{
    public void enterMove(Board b, Validator v, Scanner s, String mark)
    {
        boolean noMoveMade = true;
        char chosenMove = ' ';

        while (noMoveMade)
        {
            System.out.println("Player " + mark + ", Make Your Move:");
            String playerInput = s.nextLine();
            System.out.println(playerInput);
            
            if (v.inputIsValid(playerInput))
            {
                if(v.cellEmpty(b, playerInput.charAt(0)))
                {
                    chosenMove = playerInput.charAt(0);
                    noMoveMade = false;

                } else {
                    System.out.println("\nCell \"" + playerInput + "\" is Already Filled\n");

                }

            } else {
                System.out.println("\nError: \"" + playerInput + "\" is Not a Valid Move\n");

            }

        }
        b.makeMove(chosenMove, mark);

    }

}