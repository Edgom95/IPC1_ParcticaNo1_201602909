/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package snake_201602909;

import java.io.IOException;
import java.util.Scanner;
import static snake_201602909.Snake_201602909.Score;
import static snake_201602909.Tablero_201602909.sk;

/**
 *
 * @author edgom
 */
public class Main_201602909 
{
    
    public static Scanner sn; 
    public static int ContadorJugadores=0;
    public static Jugador_201602909 jugador[] = new Jugador_201602909[5]; 
    public static String Nombre;
    public static int FechaN;
    public static int ScoreinGame=10;
    public static int ScoreVic;
    public static int opcion = 0;
    public static char opg;
    public boolean Victoria;
   
    public static void main(String[] args) throws IOException
    {
    
    sn = new Scanner(System.in);
    
    for(int j=0;j<jugador.length;j++)
    {
    jugador[j]= new Jugador_201602909();
    }
    
    while(opcion<=3)
    {
        System.out.println("**********************************************************************");
        System.out.println("*                      1.Iniciar Juego                               *");
        System.out.println("*                      2.Regresar al Juego                           *");
        System.out.println("*                      3.Historial                                   *");
        System.out.println("*                      4.Salir                                       *");
        System.out.println("**********************************************************************");
        
        System.out.println("    Seleccione una Opcion:   ");
        opcion = sn.nextInt();
        
        switch(opcion)
        {
            case 1:
            System.out.println(" Ingrese su Nombre: ");
            Nombre = sn.next();
            System.out.println(" Ingrese su Fecha de Nacimiento: ");
            FechaN = sn.nextInt();
            
            Jugador_201602909 Player = new Jugador_201602909(Nombre,FechaN,Score);
            jugador[ContadorJugadores]=Player;
            ContadorJugadores++;
            
            while(Juego())
            {
            Score=ScoreinGame;
            Player.setScore(Score);
            Jugar();
            Player.setScore(Score);
            if(Score==20)
            {
            System.out.println("    Ganaste!!!   ");
            ScoreVic=100;
            }
            else if(Score==0)
            {
            System.out.println("    Perdiste!!!   ");
            ScoreVic=100;
            }
            }
            break;
            case 2:
            break;
            case 3:
                Historial();
            break;
            case 4:
                System.exit(0);
            break;
        }
    }
    }
    public static void Historial()
    {
    for(int i=0;i<jugador.length;i++) 
            {
            System.out.println("*********************************************");
            System.out.print("Nombre: " +jugador[i].getNombre() + "\n" 
                           + "Fecha de Nacimiento: " + jugador[i].getFechaNacimiento() + "\n" 
                           + "Score: " + jugador[i].getScore() + "\n\n");
            System.out.println("*********************************************");
            } 
    }
    
    public static boolean Juego()
    {
    if(ScoreVic==100)
    {
    return false;
    }
    else
    {
    return true;
    }
    }

    public static int getScoreinGame() {
        return ScoreinGame;
    }

    public static void setScoreinGame(int ScoreinGame) {
        Main_201602909.ScoreinGame = ScoreinGame;
    }
   
    public static void Jugar() throws IOException
    {
     Tablero_201602909 Tab = new Tablero_201602909(35,70,40,30,20);
     Tab.ImprimirTablero();       
     sk.MoverSnake();       
    }
    
}
