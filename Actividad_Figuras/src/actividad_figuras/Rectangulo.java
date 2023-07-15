package actividad_figuras;
public class Rectangulo extends Figura {
    double baseRecta;
    double alturaRecta;
    double areaRecta;
    /**
     * @param nombre. Establece el nombre de la figura, heredandolo de la super clase "Figura".
     * @param baseRecta. Establece la medida de la base del rectangulo.
     * @param alturaRecta. Establece la altura del rectangulo.
     * @param areaRecta. Establece area total del rectangulo.
    */
    public Rectangulo(String nombre, double baseRecta, double alturaRecta, double areaRecta) {
        super(nombre);
        this.baseRecta = baseRecta;
        this.alturaRecta = alturaRecta;
        this.areaRecta = areaRecta;
    }
    /**
    * @param baseRecta. Establece la medida de la base del rectangulo.
    */
    public void setBaseRecta(double baseRecta) {
        this.baseRecta = baseRecta;
    }
    /**
    * @param alturaRecta. Establece la altura del rectangulo.
    */
    public void setAlturaRecta(double alturaRecta) {
        this.alturaRecta = alturaRecta;
    }
    /**
    * @return areaRecta. Devuelve el valor del area del rectangulo.
    */
    public double getAreaRecta() {
        return areaRecta;
    }
    /**
    * @param areaRecta. Establece area total del rectangulo.
    */
    public void setAreaRecta(double areaRecta) {
        this.areaRecta = areaRecta;
    }
    /**
     * @return toString. Para imprimir de una manera mas sencilla
    * heredando el to.string de figura
    */
    @Override
    public String toString() {
       return super.toString() + ", Area= " + areaRecta;
    }
}