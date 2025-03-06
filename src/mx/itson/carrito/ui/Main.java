/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.carrito.ui;

import java.util.Scanner;
import mx.itson.carrito.entidades.Carro;

/**
 *
 * @author alumnog Dorantes Rogel Angel Adrian.
 * 
 */
public class Main {
   
        public static void main(String[] args) {
        
            Scanner scanner = new Scanner(System.in);
            
            System.out.println("Ingresa el modelo del carro: ");
            String marca = scanner.nextLine();
             System.out.println("Ingresa el kilometraje  del carro: ");
            double kilometraje = scanner.nextDouble();
            System.out.println("Ingresa la distancia que va a recorrer el carro.");
           double distancia =  scanner.nextDouble();
            System.out.println("Ingresa la velocidad a la que avanza el carro.");
           double velocidad = scanner.nextDouble();
            System.out.println("Ingresa el año del modelo del carro: ");
           int anio = scanner.nextInt();
          System.out.println("Ingresa el color del carro:  ");
          String colores = scanner.next();
            
            
           
           
           
//Generamos una instancia de la clase Carro
    Carro ford = new Carro();
ford.setColor(colores);
ford.setMiles(distancia);
ford.setModel(marca);
ford.setYear(anio);
ford.setKilometraje(kilometraje);
Double kilometrajeFinal = kilometraje + distancia;
           
   ford.calculateTime(distancia, velocidad);
  double  tiempo = ford.calculateTime(distancia, velocidad);
   

  System.out.println("Tu carro modelo "+ marca + " del año " + anio + " es de color " + colores + " y tiene "+ kilometraje + " de kilometraje"); 
  System.out.println(" y tardo: " + tiempo + " horas en recorrer " + distancia + " kilometros" +" a " + velocidad + " kilometros por hora " + "Despues del recorrido tu carro tiene: " + kilometrajeFinal);
    }
    
        
        
}
