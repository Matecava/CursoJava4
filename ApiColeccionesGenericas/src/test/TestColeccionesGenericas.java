package test;

import java.util.*;

public class TestColeccionesGenericas {

    public static void main(String[] args) {
        List<String> miLista = new ArrayList<>();
        miLista.add("Lunes");
        miLista.add("Martes");
        miLista.add("Miercoles");
        miLista.add("Jueves");
        miLista.add("Viernes");
        miLista.add("Sabado");
        miLista.add("Domingo");
        String elemento = miLista.get(0);
//        System.out.println("elemento = " + elemento);

//        imprimir(miLista);

        System.out.println("//////////////////");

        Set<String> miSet = new HashSet<>();
        miSet.add("Lunes");
        miSet.add("Martes");
        miSet.add("Miercoles");
        miSet.add("Jueves");
        miSet.add("Viernes");
        miSet.add("Sabado");
        miSet.add("Domingo");
//        imprimir(miSet);



    Map<String ,String> miMapa = new HashMap<>();
    miMapa.put("valor1", "Mateo");
    miMapa.put("valor2", "Agustin");
    miMapa.put("valor3", "Juan");
//        System.out.println("miMapa = " + miMapa);

    String elementoMapa = miMapa.get("valor1");
        System.out.println("elemento = " + elementoMapa);
    
        
        imprimir(miMapa.keySet());
        imprimir(miMapa.values());
//        imprimir(miMapa.entrySet());
    }

    public static void imprimir(Collection<String> coleccion) {
        coleccion.forEach(elemento -> {
            System.out.println("Elemento = " + elemento);
            
        });
    }
}
