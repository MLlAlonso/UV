package actividad_figuras;
public class Circulo extends Figura {
    double radioCirc;
    double areaCirc;
    /**
     * @param nombre. Establece el nombre de la figura, heredandolo de la super clase "Figura".
     * @param radioCirc.  Establece la medida del radio del circulo.
     * @param areaCirc. Establece el area total del circulo.
    */
    public Circulo(String nombre, double radioCirc, double areaCirc) {
        super(nombre);
        this.radioCirc = radioCirc;
        this.areaCirc = areaCirc;
    }
    /**
    * @param radioCirc. Establece la medida del radio del circulo.
    */
    public void setRadioCirc(double radioCirc) {
        this.radioCirc = radioCirc;
    }
    /**
    * 
    * @return areaCirc. Devuelve el valor del area del circulo.
    */
    public double getAreaCirc() {
        return areaCirc;
    }
    /**
     *
     * @param areaCirc. Establece el area total del circulo.
     */
    public void setAreaCirc(double areaCirc) {
        this.areaCirc = areaCirc;
    }
    /**
    * @return toString. Para imprimir de una manera mas sencilla
    * heredando el to.string de figura
    */
    @Override
    public String toString() {
       return super.toString() + ", Area= " + areaCirc;
    }    
}
