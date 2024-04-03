package test;

import java.util.*;

public class TestColecciones {

    public static void main(String[] args) {
        List miLista = new ArrayList();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        

//        imprimir(miLista);

//        System.out.println("//////////////////");

        Set miSet = new HashSet();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
//        imprimir(miSet);



    Map miMapa = new HashMap();
    miMapa.put("valor1", "Mateo");
    miMapa.put("valor2", "Agustin");
    miMapa.put("valor3", "Juan");
        System.out.println("miMapa = " + miMapa);

    String elemento = (String)miMapa.get("valor1");
        System.out.println("elemento = " + elemento);
    
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
        imprimir(miMapa.entrySet());
    }

    public static void imprimir(Collection coleccion) {
        coleccion.forEach(dia -> {
            System.out.println("Elemento = " + dia);
        });
    }
}
