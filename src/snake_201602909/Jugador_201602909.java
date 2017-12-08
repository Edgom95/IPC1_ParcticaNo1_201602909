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

public class Jugador_201602909 
{
protected String Nombre;
protected int FechaNacimiento;
protected int Score;

  public Jugador_201602909()
  {
  Nombre="";
  FechaNacimiento=0;
  Score=10;
  }
  Jugador_201602909(String nombre,int fn, int score)
  {
  setNombre(nombre);
  setFechaNacimiento(fn);
  setScore(score);
  }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getFechaNacimiento() {
        return FechaNacimiento;
    }

    public void setFechaNacimiento(int FechaNacimiento) {
        this.FechaNacimiento = FechaNacimiento;
    }

    public int getScore() {
        return Score;
    }

    public void setScore(int Score) {
        this.Score = Score;
    }


}
