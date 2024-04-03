package test;

import domain.PersonaBean;

public class TestJavaBean {
    public static void main(String[] args) {
        PersonaBean persona = new PersonaBean();
        persona.setNombre("Mateo");
        persona.setApellido("Cava");
        
        System.out.println("persona = " + persona);
    }
}
