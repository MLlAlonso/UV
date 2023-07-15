package actividad_figuras;
public class Figura {
    String nombre;
    /**
     * @param nombre Establece el nombre con el que se va a identificar la figura.
    *  @Param Crear un constructor para figura
    */
    public Figura(String nombre) {
        this.nombre = nombre;
    }
    /**
    * @return nombre. Devuelve el nombre de la figura.
    */
    public String getNombre() {
        return nombre;
    }
    /**
     * @param nombre. Establece el nombre con el que se va a identificar la figura.
    */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
    * @return toString.Para imprimir de una manera mas sencilla.
    */
    @Override
    public String toString() {
        return "Figura= " + nombre + "1";
    } 
}