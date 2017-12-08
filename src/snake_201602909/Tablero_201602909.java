/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake_201602909;

/**
 *
 * @author edgom
 */
public class Tablero_201602909 
{
private String Tablero[][];
private int  Fila;
private int Columna;
   public Tablero_201602909(int f,int c)
   {
   this.Fila = f;
   this.Columna = c;
   Tablero = new String[Fila][Columna];
   InicializarTablero();
   }
   public void InicializarTablero()
   {
   for(int i=0; i<Tablero.length;i++)
   {
        for(int j=0; j<Tablero.length;j++)
        {
        Tablero[i][j]="#";
        }
   }
   }
   public void ImprimirTablero()
   {
   for(int i=0; i<Fila;i++)
   {
        for(int j=0; j<Columna;j++)
        {
        System.out.print(Tablero[i][j]);
        }
        System.out.println();
   }
   }
}
