/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Geometria;

/**
 *
 * @author Alumno
 */
public class triangulo extends Figura{
  
    private final float lado1;
    private final float lado2;
    private final float lado3;
    private float lado;

    public triangulo(float lado1, float lado2, float lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
    }

    public float getLado1() {
        return lado1;
    }

    public float getLado2() {
        return lado2;
    }

    public float getLado3() {
        return lado3;
    }

    public float getLado() {
        return lado;
    }

    public void setLado(float lado) {
        this.lado = lado;
    }

    
    public float Perimetro(){
    return lado=lado1+lado2;
    }
    
    public float PerimetroT(){
    return super.getNroDeLados()+getLado1()+getLado2();
    }
    
public void calcularPerimetrotriangulo(){
    float igual=Perimetro();
   // System.out.println("el perimetro de un triangulo de lado1+lado2 es igual a lado=: "+ igual);
    System.out.println("el perimetro de un triangulo es =: "+ igual);
    }

public void calcularPerimetrotriangulo1(){
    float igual=PerimetroT();
    System.out.println("el lado1 = " +getLado1()+ " lado2 = "+getLado2());
    System.out.println("el perimetro de un triangulo es = al numero de lados + el lado1 + lado2: "+ igual);
    }

    @Override
    public String toString() {
       return "triangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + ", lado3=" + lado3 + ", lado=" + lado + '}';
    //return super.toString()+" es un triangulo de lados";
    }
    
              
}
