package paquete1;

import paquete1.Clase1;

public class ClaseHija extends Clase1 {
    
    public ClaseHija(){
        super();
        this.atributoProtected = "Modificacion atributo protected";
        System.out.println("atributoProtected = " + atributoProtected);
        this.metodoProtected();
        
        this.metodoDefault();
    }
}
