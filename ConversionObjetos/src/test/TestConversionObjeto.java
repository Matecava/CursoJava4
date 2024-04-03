package test;

import domain.*;

public class TestConversionObjeto {
    public static void main(String[] args) {
        Empleado empleado;
        
        empleado = new Escritor("Juan", 5000, TipoEscritura.CLASICO);
//        System.out.println("empleado = " + empleado);
        
        System.out.println(empleado.obtenerDetalles());
        
        ((Escritor) empleado).getTipoEscritura();
    }
}
