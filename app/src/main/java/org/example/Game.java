package org.example;
import java.util.Scanner;

public class Game
{
    private Again a;
    private Board b;
    private Check c;
    private Displayer d;
    private Move m;
    private Validator v;
    private String player1;
    private String player2;

    public Game(Again a, Board b, Check c, Displayer d, Move m, Validator v, String p1, String p2)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.m = m;
        this.v = v;
        this.player1 = p1;
        this.player2 = p2;

    }

    public void playGame()
    {
        boolean gameGoing = true;
        String currentPlayer = player1;
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome To TIC-TAC-TOE!\n");
        d.display(b);

        while(gameGoing)
        {
            while (c.currentState(b) == "Game in Progress...")
            {
                m.enterMove(b, v, s, currentPlayer);
                d.display(b);
                System.out.println(c.currentState(b));

                if (currentPlayer == player1)
                {
                    currentPlayer = player2;

                } else {
                    currentPlayer = player1;

                }

            }

            gameGoing = a.playAgain(s);

            if (gameGoing)
            {
                b.clear();
                d.display(b);

            }

        }

        s.close();
        System.out.println("Thank You For Playing TIC-TAC-TOE!");

    }

}