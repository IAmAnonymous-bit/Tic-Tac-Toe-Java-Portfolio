package org.example;
import java.util.Scanner;

public class App 
{
  public String getGreeting() 
  {
    return "Hello World!";

  }

  public static void main(String[] args) 
  {
    Again a = new Again();
    Board b = new Board();
    Check c = new Check();
    Displayer d = new Displayer();
    Move m = new Move();
    Result r = new Result();
    Validator v = new Validator();
    Game g = new Game(a, b, c, d, m, r, v);

    g.playGame();
        
  }

}
