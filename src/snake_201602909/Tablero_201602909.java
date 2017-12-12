/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake_201602909;

import static snake_201602909.Main_201602909.jugador;
import static snake_201602909.Snake_201602909.Mov;
import static snake_201602909.Snake_201602909.Score;
/**
 *
 * @author edgom
 */
public class Tablero_201602909 
{
public static String Tablero[][];
public static Snake_201602909 sk = new Snake_201602909(16,35);
public static int Fila;
public static int Columna; 
private int GF;
private int BF;
private int PA;

   public Tablero_201602909(int f,int c,int gf,int bf,int pa)
   {
   Tablero_201602909.Fila = f;
   Tablero_201602909.Columna = c;
   this.GF = gf;
   this.BF = bf;
   this.PA = pa;
   
   Tablero = new String[Fila][Columna];   
   InicializarTablero();
   sk.Snake();
   sk.SnakeEat();
   }
   public void InicializarTablero()
   {
   for(int i=0; i<Fila;i++)
   {
        for(int j=0; j<Columna;j++)
        {
        if((j==0)||(j==69))
        {    
        Tablero[i][j]= "#"; 
        }
        else if((i==Fila-1)||(i==Fila-35))
        {
        Tablero[i][j]= "#";
        }
        else
        {
        Tablero[i][j]= ".";
        }
        }  
   }
   LlenadoRandom();
   }
   
   public void GoodFood()
   {
   for(int i=0;i<GF;i++)
   {
   int f = (int)(Math.random()*Fila);
   int c = (int)(Math.random()*Columna);
   Tablero[f][c] = "%";
   }
   }
   public void BadFood()
   {
   for(int j=0;j<BF;j++)
   {
   int f = (int)(Math.random()*Fila);
   int c = (int)(Math.random()*Columna);
   Tablero[f][c] = "$";
   }
   }
   public void ParedAleatoria()
   {
   for(int k=0;k<PA;k++)
   {
   int f = (int)(Math.random()*Fila);
   int c = (int)(Math.random()*Columna);
   Tablero[f][c] = "#";  
   }
   }
   
   public void ImprimirTablero()
   {
   System.out.println("\n");
   for(int i=0; i<Fila;i++)
   {
        for(int j=0; j<Columna;j++)
        {
        System.out.print(Tablero[i][j]);
        }
        System.out.println();
   }
   System.out.println("**********************************************************************");
   for(int i=0; i<jugador.length;i++)
   {
   System.out.println("     Jugador: "+jugador[i].getNombre());
   System.out.println("     Score: "+Score);
   System.out.println("     Movimientos: "+Mov);
   break;
   }
   System.out.println("**********************************************************************");
   }  
   public void LlenadoRandom()
   {
    GoodFood();
    BadFood();
    ParedAleatoria();
   }
}
