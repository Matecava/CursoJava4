package test;

import manejoArchivo.ManejoArchivo;


public class TestManejoArchivo {
    public static void main(String[] args) {
        var nombreArchivo = "Prueba.txt";
//        crearArchivo(nombreArchivo);
//
//        ManejoArchivo.escribirArchivo(nombreArchivo, "Hola mundo desde Java");
//        ManejoArchivo.anexarArchivo(nombreArchivo, "Hola mundo desde Java :o");
        
        ManejoArchivo.leerArchivo(nombreArchivo);
        
        

    }
    
}
