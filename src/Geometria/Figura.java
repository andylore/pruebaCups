/*
 * To change this license header, choose License Headers in Project Properties.
|        * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Geometria;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public abstract class Figura {
    
     private int nroDeLados;
    private String color;
    private boolean Relleno;

    public Figura(int nroDeLados, String color, boolean Relleno) {
        this.nroDeLados = nroDeLados;
        this.color = color;
        this.Relleno = Relleno;
    }

    public Figura() {
        nroDeLados = 1;
        color = "Rojo";
        Relleno = false;
    }

    public boolean isRelleno() {
        return Relleno;
    }

    public void setRelleno(boolean Relleno) {
        this.Relleno = Relleno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNroDeLados() {
        return nroDeLados;
    }

    public void setNroDeLados(int nroDeLados) {
        this.nroDeLados = nroDeLados;
    }

    @Override
    public String toString() {
        return "Figura{" + "nroDeLados=" + nroDeLados + ", color=" + color + ", Relleno=" + Relleno + '}';
    }
    
    public void datos(){
          Scanner entrada =new Scanner(System.in);
          System.out.println("Ingrese el numero de lados de una figura");
          this.setNroDeLados(entrada.nextInt());
          System.out.println("Ingrese el color");
          this.setColor(entrada.next());
          System.out.println("Ingrese si Dispone(true) de relleno o no(false)");
          this.setRelleno(entrada.nextBoolean());
   }
    public void mostrarFigura(){
   System.out.println("cantidad de lados |color    |  disponibilidad de relleno    ");
    System.out.println(""+"\t"+getNroDeLados()+"\t"+getColor()+"\t"+Relleno);

}
}
