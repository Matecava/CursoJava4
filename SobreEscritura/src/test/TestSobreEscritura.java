package test;

import domain.*;

public class TestSobreEscritura {
    public static void main(String[] args) {
      
        Empleado empleado = new Empleado("Agustin", 7000);
        imprimir(empleado);
       empleado = new Gerente("Mateo",10000, "Sistemas");
        imprimir(empleado);
    }
    
    
    //Polimorfismo
    public static void imprimir(Empleado empleado){
            System.out.println("Empleado: " + empleado.obtenerDetalles());
        }
}
