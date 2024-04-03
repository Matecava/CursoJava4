package test;

public class TestArgumentosVariables {
    public static void main(String[] args) {
        imprimirNumeros(12,5,7);
        imprimirNumeros(1,2);
        variosParametros("Mateo", 5,7,45);
        }
    
    private static void variosParametros(String nombre, int... numeros){
        System.out.println("Nombre: " + nombre);
        imprimirNumeros(numeros);
    }
    
        private static void imprimirNumeros(int... numeros){
            for (int i = 0; i < numeros.length; i++) {
                System.out.println("Elemento: " + numeros[i]);
            }
        }
  
}
