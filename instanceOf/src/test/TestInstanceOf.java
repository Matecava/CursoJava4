package test;

import domain.*;

public class TestInstanceOf {

    public static void main(String[] args) {

        Empleado empleado = new Empleado("Agustin", 7000);
        determinarTipo(empleado);
        empleado = new Gerente("Mateo", 10000, "Sistemas");
        determinarTipo(empleado);
    }

    public static void determinarTipo(Empleado empleado) {
        if (empleado instanceof Gerente) {
            System.out.println(empleado.obtenerDetalles() + " Es de tipo gerente");
            Gerente gerente = (Gerente) empleado;
            System.out.println("gerente = " + gerente.getDepartamento());
        } else if (empleado instanceof Empleado) {
            System.out.println(empleado.obtenerDetalles() + " Es de tipo Empleado");
        } else {
            System.out.println("Es de tipo object");
        }
    }
}
