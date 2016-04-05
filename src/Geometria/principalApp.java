/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Geometria;

import java.util.Scanner;

/**
 *
 * @author Alumno
 */
public class principalApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  
			String opc = "4";    
			Cuadrado  cu= new Cuadrado(1,null, true, 2);
                        triangulo t= new triangulo(2, 4, 8); 
		        Scanner ingreso=new Scanner(System.in);
		        Scanner opcion = new Scanner(System.in);
		    while (opc.charAt(0) != '0') {
		        System.out.println("\n\t =========================================================== ");
		        System.out.println("\n\t ********** MENU DE OPCIONES DE GEOMETRIA-FIGURA **********  ");
		        System.out.println("\n\t =========================================================== ");
		        System.out.println("\n\t ELIJA EL TIPO DE MATERIAL QUE REQUIERE");
		        System.out.println("\n\t * 1- Calcular perimetro del cuadrado. * ");
		        System.out.println("\n\t * 2- Calcular el perimetro del triangulo. * ");
		        System.out.println("\n\t * 3- Verificar valor del cuadrado. * ");
		        System.out.println("\n\t * 4- Verificar valor del triangulo. * ");
		        System.out.println("\n\t * 5- ingresar datos de una Figura cuadrada y su perimetro. * ");
                        System.out.println("\n\t * 6- mostrar datos de la figura cuadrada. * ");
                        System.out.println("\n\t * 7- Ingresar los datos de una figura triangular y su perimetro. * ");
                        System.out.println("\n\t * 8- Mostrar los datos de la figuara triangular. * ");
		        System.out.println("\n\t * 9- Mostrar nombre. * ");
                        System.out.println("\n\t * 0- SALIR. * ");
		        System.out.println("\n\t ***************************************************** ");
		        System.out.print("INGRESE SU OPCION: ");
		        opc = opcion.nextLine();
		        switch (opc.charAt(0)) {
		           
		            case '1':
		             	cu.calcularPerimetroCuadrado();
		                     break;

		            case '2':  
		                t.calcularPerimetrotriangulo();
		                     break;

		            case '3':
                                
		                System.out.println("El valor del LADO para sacar el perimetro del cuadrado es lado = "+cu.getLado()+"*4");;
		                     break;		                
                            case '4':
		                   
		                System.out.println("El valor del peremitro de un triangulo es lado="+t.getLado1()+"+ lado2="+t.getLado2());;
		                     break;
		                
		            case '5':
                                cu.datos();
                                cu.calcularPerimetroCuadrado1();
		                   break;		                
		            case '6':
		            	 cu.mostrarFigura();
	                        break;
	           
		            case '7':
		              	t.datos();
                                t.calcularPerimetrotriangulo1();
		               break;
                            case '8':
		                 t.mostrarFigura();
		               break;
                             case '9':
		              	System.out.println("Luna Lorena L");
		               break;
		            case '0': 
		                     System.out.println("FIN DEL PROGRAMA. ");
		        }
		    }
		}
        
    }


    
    

