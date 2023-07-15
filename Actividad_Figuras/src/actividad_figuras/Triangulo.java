package actividad_figuras;
public class Triangulo extends Figura{
    double baseTria;
    double alturaTria;
    double areaTria;
    /**
     * @param nombre. Establece el nombre de la figura, heredandolo de la super clase "Figura".
     * @param baseTria.  Establece la medida de la base del triangulo.
     * @param alturaTria. Establece la medida de la altura del triangulo.
     * @param areaTria. Establece la medida de la area total del triangulo.
    */
    public Triangulo(String nombre, double baseTria, double alturaTria, double areaTria) {
        super(nombre);
        this.baseTria = baseTria;
        this.alturaTria = alturaTria;
        this.areaTria = areaTria;
    }  
    /**
     * @param baseTria. Establece la medida de la base del triangulo.
    */
    public void setBaseTria(double baseTria) {
        this.baseTria = baseTria;
    }
    /**
     * @param alturaTria. Establece la medida de la altura del triangulo.
    */
    public void setAlturaTria(double alturaTria) {
        this.alturaTria = alturaTria;
    }
    /**
    * @return, Devuelve el valor del area total del triangulo.
    */
    public double getAreaTria() {
        return areaTria;
    }
    /**
     * @param areaTria. Establece la medida de la area total del triangulo.
    */
    public void setAreaTria(double areaTria) {
        this.areaTria = areaTria;
    }
    /**
    * @return to String. Para imprimir de una manera mas sencilla
    * heredando el to.string de figura
    */
    @Override
    public String toString() {
        return super.toString() + ", Area= " + areaTria;
    }
}