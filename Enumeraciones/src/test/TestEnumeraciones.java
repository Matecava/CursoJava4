package test;

import enumeracion.Continentes;
import enumeracion.Dias;
import static enumeracion.Dias.*;

public class TestEnumeraciones {
    public static void main(String[] args) {
        System.out.println("Dia 1: " + LUNES);
        indicarDiaSemana(LUNES);
        System.out.println("///////////////");
        
        System.out.print("Continente no. 4: " + Continentes.AMERICA );
        System.out.print(" Paises: " + Continentes.AMERICA.getPaises());
        System.out.println(" Habitantes: " + Continentes.AMERICA.getHabitantes());
        
    }
    
    private static void indicarDiaSemana(Dias dias){
        switch (dias) {
            case LUNES -> System.out.println("Primer dia de la semana");
            case MARTES -> System.out.println("Segundo dia de la semana");
            case MIERCOLES -> System.out.println("Tercer dia de la semana");
                case JUEVES -> System.out.println("Cuearto dia de la semana");
                case VIERNES -> System.out.println("Quinto dia de la semana");
                case SABADO -> System.out.println("Sexto dia de la semana");
                case DOMINGO -> System.out.println("Septimo dia de la semana");
            default -> throw new AssertionError();
        }
    }
}
