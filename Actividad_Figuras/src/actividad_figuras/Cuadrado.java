package actividad_figuras;
public class Cuadrado extends Figura {
    double ladoCuad;
    double areaCuad;
    /**
     * @param nombre. Establece el nombre de la figura, heredandolo de la super clase "Figura".
     * @param ladoCuad. Establece la medida de los lados del cuadrado.
     * @param areaCuad. Establece la medida del area total del cuadrado.
    */
    public Cuadrado(String nombre, double ladoCuad, double areaCuad) {
        super(nombre);
        this.ladoCuad = ladoCuad;
        this.areaCuad = areaCuad;
    }
    /**
    * @param ladoCuad. Establece la medida de los lados del cuadrado.
    */
    public void setLadoCuad(double ladoCuad) {
        this.ladoCuad = ladoCuad;
    }
    /**
    * @return areaCuad. Devuelve el valor del area del cuadrado.
    */
    public double getAreaCuad() {
        return areaCuad;
    }
    /**
    * @param areaCuad. Establece la medida del area total del cuadrado.
    */
    public void setAreaCuad(double areaCuad) {
        this.areaCuad = areaCuad;
    }
    /**
    * @return toString. Para imprimir de una manera mas sencilla
    * heredando el to.string de figura
    */
    @Override
    public String toString() {
        return super.toString() + ", Area= " + areaCuad;
    }   
}
