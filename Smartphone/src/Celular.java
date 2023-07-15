public class Celular {
    String color,estado;
    int precio,almacenamiento,camara;
    
    /** Constructor de celular
    *@param precio. Establecer el precio del celular.
    *@param almacenamiento. Establece la capacidad de almacenamiento con la que va a contar el celular.
    *@param camara. Establece la resolución de la camara del celular.
    *@param color. Establece el color del celular.
    *@param estado. Establece el estado (encendido-apgago) del celular.
    */
    public Celular(int precio, int almacenamiento, int camara, String color, String estado) {
        this.precio = precio;
        this.almacenamiento = almacenamiento;
        this.camara = camara;
        this.color = color;
        this.estado = estado;
    }
    
    /**
    * @return color. Devuelve el color del celular.
    */  
    public String getColor() {
        return color;
    }
    
    /**
    *@param color. Establece el color del celular.
    */
    public void setColor(String color) {
        this.color = color;
    }
    
    /**
    * @return precio. Devuelve el precio del celular.
    */
    public int getPrecio() {
        return precio;
    }
    
    /**
    *@param precio.  Establecer el precio del celular.
    */   
    public void setPrecio(int precio) {
        this.precio = precio;
    }

    /**
    *@return almacenamiento. Devuelve la capacidad de almacenamiento del celular.  
     */
    public int getAlmacenamiento() {
        return almacenamiento;
    }
    
    /**
    * @param almacenamiento. Establece la capacidad de almacenamiento con la que 
    * va a contar el celular.
    */
    public void setAlmacenamiento(int almacenamiento) {
        this.almacenamiento = almacenamiento;
    }
    
    /**
     * @return camara. Devuelve la resolución de la camara.
     */    
    public int getCamara() {
        return camara;
    }

    /**
    * @param camara. Establece la resolución de la camara del celular.
    */   
    public void setCamara(int camara) {
        this.camara = camara;
    }
    /**
     * @return estado. Devuelve el estado del celular (endencido-apagado).
     */    
    public String isEstado() {
        return estado;
    }
    
    /**
     * @param estado. Establece el estado (encendido-apgago) del celular.
     */   
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    /**
     * @return toString. Para imprimir de una manera mas sencilla.
     */   
    @Override
    public String toString() {
        return  ", precio= $" + precio + ", almacenamiento= " + almacenamiento + "GBs " +
                ", resolucion de camara= " + camara + "mps, color= " + color + ", estado del celular: "+ estado;
    }
}