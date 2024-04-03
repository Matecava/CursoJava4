package test;

import static aritmetica.Aritmetica.division;

public class TestExcepciones {
    public static void main(String[] args) {
        
        int resultado = 0;
        try{
            resultado = division(10, 0);
        }catch(Exception e){
            System.out.print("Ocurrio un error: ");
            e.printStackTrace(System.out);
        } finally{
            System.out.println("Se reviso la devision entre cero");
        }
        
        
        System.out.println("resultado = " + resultado);
    }
}
