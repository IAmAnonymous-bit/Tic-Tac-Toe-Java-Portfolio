package org.example;

public class Validator
{
    public boolean inputIsValid(String input)
    {
        if (input.length() == 1)
        {
            if(input.charAt(0) != '1' && input.charAt(0) != '2' && input.charAt(0) != '3' && input.charAt(0) != '4' && input.charAt(0) != '5' && input.charAt(0) != '6' && input.charAt(0) != '7' && input.charAt(0) != '8' && input.charAt(0) != '9')
            {
                return false;
                
            }
            return true;

        } else {
            return false;
        }
        
    }

    public boolean cellEmpty(Board b, char cell)
    {
        if (cell == '1')
        {
            if(b.getCell(1) == "1")
            {
                return true;

            }
            return false;

        } else if (cell == '2') {
            if(b.getCell(2) == "2")
            {
                return true;
                
            }
            return false;

        } else if (cell == '3') {
            if(b.getCell(3) == "3")
            {
                return true;
                
            }
            return false;

        } else if (cell == '4') {
            if(b.getCell(4) == "4")
            {
                return true;
                
            }
            return false;

        } else if (cell == '5') {
            if(b.getCell(5) == "5")
            {
                return true;
                
            }
            return false;

        } else if (cell == '6') {
            if(b.getCell(6) == "6")
            {
                return true;
                
            }
            return false;

        } else if (cell == '7') {
            if(b.getCell(7) == "7")
            {
                return true;
                
            }
            return false;

        } else if (cell == '8') {
            if(b.getCell(8) == "8")
            {
                return true;
                
            }
            return false;

        } else {
            if(b.getCell(9) == "9")
            {
                return true;
                
            }
            return false;

        }

    }

}