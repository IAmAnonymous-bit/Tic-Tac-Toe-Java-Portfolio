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
    Check c1 = new Check();
    Computer c2 = new Computer();
    Displayer d = new Displayer();
    Move m = new Move();
    Result r = new Result();
    Select s = new Select();
    Validator v = new Validator();
    Game g = new Game(a, b, c1, c2, d, m, r, s, v);

    g.playGame();
        
  }

}
