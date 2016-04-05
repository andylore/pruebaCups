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
public class Cuadrado extends Figura{
    private final int lado;
    private final int lado1;
    public Cuadrado(int lado, String color,boolean relleno, int lado1) {
        super(lado,color,relleno);
        this.lado = lado;
        //super(lado, color, relleno);
        this.lado1= lado1;
        
    }

    public Cuadrado() {
        super(4,null,false);
        lado = 1;
        lado1=1;
        
    }

    public int getLado() {
        return lado;
    }

    public int getLado1() {
        return lado1;
    }
    
    public int Perimetro(){
     return lado*4;
    }
    public int perimetro1(){
    return super.getNroDeLados()*4;
    }

    public void calcularPerimetroCuadrado(){
    int igual=Perimetro();
    System.out.println("el perimetro del cuadrado del lado es: "+ igual);
    }
    
    public void calcularPerimetroCuadrado1(){
    int igual=perimetro1();
    System.out.println("el perimetro del cuadrado calculado es el NroDeLados * 4: "+ igual);
    }
    @Override
    public String toString() {
        return "Cuadrado{" + "lado=" + lado + ", lado1=" + lado1 +"color="+getColor()+ '}';
    }
    
}
