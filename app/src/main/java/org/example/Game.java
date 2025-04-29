package org.example;
import java.util.Scanner;

public class Game
{
    private Again a;
    private Board b;
    private Check c1;
    private Computer c2;
    private Displayer d;
    private Move m;
    private Result r;
    private Select s;
    private Validator v;
    private String player1;
    private String player2;
    private int turn;
    private int mode;

    public Game(Again a, Board b, Check c1, Computer c2, Displayer d, Move m, Result r, Select s, Validator v)
    {
        this.a = a;
        this.b = b;
        this.c1 = c1;
        this.c2 = c2;
        this.d = d;
        this.m = m;
        this.r = r;
        this.s = s;
        this.v = v;
        this.player1 = "X";
        this.player2 = "O";
        this.turn = 1;
        this.mode = 0;

    }

    public void playGame()
    {
        boolean gameGoing = true;
        String currentPlayer = player1;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome To TIC-TAC-TOE!\n");

        mode = s.selectMode(scan);

        d.display(b);

        while(gameGoing)
        {
            if (mode == 1) {
                while (c1.currentState(b) == "Game in Progress...")
                {
                    m.enterMove(b, v, scan, currentPlayer);
                    d.display(b);
                    turn++;

                    if (currentPlayer == player1)
                    {
                        currentPlayer = player2;

                    } else {
                        currentPlayer = player1;

                    }

                }
            } else if (mode == 2) {
                while (c1.currentState(b) == "Game in Progress...")
                {
                    if (currentPlayer == player1)
                    {
                        m.enterMove(b, v, scan, currentPlayer);

                    } else {
                        c2.computerMove(b, currentPlayer, turn);

                    }
                    d.display(b);
                    turn++;

                    if (currentPlayer == player1)
                    {
                        currentPlayer = player2;

                    } else {
                        currentPlayer = player1;

                    }

                }

            } else {
                while (c1.currentState(b) == "Game in Progress...")
                {
                    if (currentPlayer == player1)
                    {
                        c2.computerMove(b, currentPlayer, turn);

                    } else {
                        m.enterMove(b, v, scan, currentPlayer);

                    }
                    d.display(b);
                    turn++;

                    if (currentPlayer == player1)
                    {
                        currentPlayer = player2;

                    } else {
                        currentPlayer = player1;

                    }

                }

            }

            System.out.println(r.getResult(c1.currentState(b)));
            r.getLog();
            gameGoing = a.playAgain(scan);

            if (gameGoing)
            {
                if (c1.currentState(b) == player1)
                {
                    currentPlayer = player2;

                } else if (c1.currentState(b) == player2) {
                    currentPlayer = player1;

                }

                b.clear();
                d.display(b);
                turn = 1;

            }

        }

        scan.close();
        r.writeLog();
        System.out.println("Thank You For Playing TIC-TAC-TOE!");
        System.out.println( "\n" + "To see final statistics, view disk.txt!");

    }

}