package test;

import domain.Persona;

public class TestForEach {

    public static void main(String[] args) {
        int edades[] = {1, 2, 3, 4};

        for (int edad : edades) {
            System.out.println("edad = " + edad);
        }

        Persona personas[] = {new Persona("Mateo"), new Persona("Agustin"), new Persona("Ubaldo")};
        for (Persona persona : personas) {
            System.out.println("persona = " + persona);
        }
    }
}
