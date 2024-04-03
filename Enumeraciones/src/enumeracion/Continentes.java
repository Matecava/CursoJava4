package enumeracion;

public enum Continentes {
    AFRICA(54, "1,2 billones"),
    EUROPA(50, "750 millones"),
    ASIA(48, "4,6 billones"),
    AMERICA(35, "1 billon"),
    OCEANIA(14, "43 millones");
    
    private final int paises;
    private final String habitantes;
    
    Continentes(int paises, String habitantes){
        this.paises = paises;
        this.habitantes = habitantes;
    }

    public int getPaises() {
        return paises;
    }

    public String getHabitantes() {
        return habitantes;
    }
    
    
    
}
