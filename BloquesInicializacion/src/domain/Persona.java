package domain;

public class Persona {
    private final int idPersona;
    private static int contadorPersona;
    
    
    //Este se ejecuta solo una ves y  al prinicipio
    static{
        System.out.println("Ejecucion bloque estatico");
        ++Persona.contadorPersona;
    }
      
    
    //Bloque de codigo no estatico, se ejcuta antes del constructor de la clase,este se va a ejecutar cada vez que 
    //creemos un nuevo objeto
    {
        System.out.println("Ejecucion bloque No estatico");
        this.idPersona = Persona.contadorPersona++;
    }
    
   
    public Persona(){
        System.out.println("Ejecucion del constructor");
    }

    public int getIdPersona() {
        return idPersona;
    }

    @Override
    public String toString() {
        return "Persona{" + "idPersona=" + idPersona + '}';
    }
    
    
}
