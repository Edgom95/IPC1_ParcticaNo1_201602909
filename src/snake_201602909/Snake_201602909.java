/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake_201602909;

import java.io.IOException;
import static snake_201602909.Main_201602909.opg;
import static snake_201602909.Tablero_201602909.Tablero;

/**
 *
 * @author edgom
 */

public class Snake_201602909 
{
public static int X;
public static int Y;

   public Snake_201602909(int x,int y)
   {
   setX(x);
   setY(y);
   } 

    public int getX() {
        return X;
    }

    public void setX(int X) {
        this.X = X;
    }

    public int getY() {
        return Y;
    }

    public void setY(int Y) {
        this.Y = Y;
    } 
   
    public void Snake()
    {
    Tablero[X][Y]="@";
    }
    public  void SnakeArriba()
    {
    setX(X-1);
    setY(Y);
    }
    public void SnakeAbajo()
    {
    setX(X+1);
    setY(Y);
    } 
    public void SnakeIzq()
    {
    setX(X);
    setY(Y-1);
    } 
    public void SnakeDer()
    {
    setX(X);
    setY(Y+1);
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
        System.exit(0);
        break;
    }
    }
}
