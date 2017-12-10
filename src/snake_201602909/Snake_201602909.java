/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake_201602909;

import java.io.IOException;
import static snake_201602909.Main_201602909.ScoreinGame;
import static snake_201602909.Main_201602909.opcion;
import static snake_201602909.Main_201602909.opg;
import static snake_201602909.Tablero_201602909.Columna;
import static snake_201602909.Tablero_201602909.Fila;
import static snake_201602909.Tablero_201602909.Tablero;

/**
 *
 * @author edgom
 */

public class Snake_201602909 
{
public static int X;
public static int Y;
public static int Score=10;
public static int Mov;


   public Snake_201602909(int x,int y)
   {
   setX(x);
   setY(y);
   } 

    public int getX() {
        return X;
    }

    public void setX(int X) {
        Snake_201602909.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        Snake_201602909.Y = Y;
    } 

    public void Snake()
    {
    Tablero[X][Y]="@";
    }
    public  void SnakeArriba()
    {
    setX(X-1);
    setY(Y);
    Mov++;
    }
    public void SnakeAbajo()
    {
    setX(X+1);
    setY(Y);
    Mov++;
    } 
    public void SnakeIzq()
    {
    setX(X);
    setY(Y-1);
    Mov++;
    } 
    public void SnakeDer()
    {
    setX(X);
    setY(Y+1);
    Mov++;
    }
    public void MoverSnake() throws IOException
    {
    System.out.println("***************************************************");
    System.out.println(" Selecciona un Movimiento....");
    opg = (char)System.in.read();
    
    switch(opg)
    {
        case 'w':
        SnakeArriba();   
        break;
        case 's':
        SnakeAbajo();
        break;
        case 'a':
        SnakeIzq(); 
        break;
        case 'd':
        SnakeDer();
        break;
        case 'm':
        ScoreinGame=100;
        break;
    }
    }
    
    public void SnakeEat()
    {
    for(int i=0;i<Fila;i++)
    {
       for(int j=0;j<Columna;j++)
       {
          if(Tablero[i][j].equals("@"))
          {
            if((Tablero[i][j].equals("@"))&&(Tablero[i][j].equals("%")))
            {
            Tablero[i][j]="@";
            ScoreinGame = Score+10;
            }
            else if((Tablero[i][j].equals("@"))&&(Tablero[i][j].equals("$")))
            {
            Tablero[i][j]="@";
            ScoreinGame = Score+10;
            }
            else
            {
            Tablero[i][j]=".";
            }
          
          }
       }
    }
    }
}
