/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake_201602909;

import java.io.IOException;
import static snake_201602909.Main_201602909.jugador;
import static snake_201602909.Snake_201602909.X;
import static snake_201602909.Snake_201602909.Y;

/**
 *
 * @author edgom
 */
public class Tablero_201602909 
{
public static String Tablero[][];
public static Snake_201602909 sk = new Snake_201602909(16,35);
private int  Fila;
private int Columna; 
private int GF;
private int BF;
private int PA;

   public Tablero_201602909(int f,int c,int gf,int bf,int pa) throws IOException
   {
   this.Fila = f;
   this.Columna = c;
   this.GF = gf;
   this.BF = bf;
   this.PA = pa;
   Tablero = new String[Fila][Columna];
   InicializarTablero();
   LlenadoRandom();    
   sk.Snake();
   }
   public void InicializarTablero() throws IOException
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
   System.out.println("     Fecha de Nacimiento: "+jugador[i].getFechaNacimiento());
   System.out.println("     Score: "+jugador[i].getScore());
   break;
   }
   System.out.println("**********************************************************************");
   System.out.println("\n");
   }  
   public void LlenadoRandom()
   {
   GoodFood();
   BadFood();
   ParedAleatoria();
   }
}
