package org.example;
import java.util.Scanner;

public class Game
{
    private Again a;
    private Board b;
    private Check c;
    private Displayer d;
    private Move m;
    private Result r;
    private Validator v;
    private String player1;
    private String player2;

    public Game(Again a, Board b, Check c, Displayer d, Move m, Result r, Validator v)
    {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.m = m;
        this.r = r;
        this.v = v;
        this.player1 = "X";
        this.player2 = "O";

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

                if (currentPlayer == player1)
                {
                    currentPlayer = player2;

                } else {
                    currentPlayer = player1;

                }

            }

            System.out.println(r.getResult(c.currentState(b)));
            r.getLog();
            gameGoing = a.playAgain(s);

            if (gameGoing)
            {
                if (c.currentState(b) == player1)
                {
                    currentPlayer = player2;

                } else if (c.currentState(b) == player2) {
                    currentPlayer = player1;

                }

                b.clear();
                d.display(b);

            }

        }

        s.close();
        r.writeLog();
        System.out.println("Thank You For Playing TIC-TAC-TOE!");
        System.out.println( "\n" + "To see final statistics, view disk.txt!");

    }

}