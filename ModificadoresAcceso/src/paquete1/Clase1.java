package paquete1;

 class Clase1 {

    public String atributoPublico = "Valor atributo publico";
    protected String atributoProtected = "Valor atributo protected";
    String atributoDefault = "Valor atributo default";
    private String atributoPrivate = "Valor atributo privado";
    
    public Clase1(String arg) {
        System.out.println("Constructor publico");
    }
    
//    private Clase1(){
//        System.out.println("Constructor privado");
//    }
    
    protected Clase1() {
        System.out.println("Constructor protected");
    }
  
    
    public void metodoPublico(){
            System.out.println("Metodo publico");
    }
    
     protected void metodoProtected(){
            System.out.println("Metodo protected");
    }
     
     void metodoDefault(){
         System.out.println("Metodo Default");
     }
     
     private void metodoPrivado(){
         System.out.println("Metodo private");
     }

    public String getAtributoPrivate() {
        return atributoPrivate;
    }

    public void setAtributoPrivate(String atributoPrivate) {
        this.atributoPrivate = atributoPrivate;
    }
     
     
}
