public class android extends Celular{
    String software,marca;
    
    /**
     * @param software. Establece el software que manejara el celular.
     * @param marca. Añade la marca que de la cual sera el celular.
     * @param precio. Establecer el precio del celular.
     * @param almacenamiento. Establece la capacidad de almacenamiento con la que va a contar el celular.
     * @param camara. Establece la resolución de la camara del celular.
     * @param color. Establece el color del celular.
     * @param estado. Establece el estado (encendido-apgago) del celular.
     */
    public android(String software, String marca, int precio, int almacenamiento, int camara, String color, String estado) {
        super(precio, almacenamiento, camara, color, estado);
        this.software = "Android";
        this.marca = marca;
    }
    
    /**
     * @return software. Devuelve el software con el que cuenta el celular.
     */
    private String getSoftware() {
        return software;
    }
    
    /**
     * @return marca. Devuelve la marca del celular.
     */
    public String getMarca() {
        return marca;
    }
    
    /**
     * @param marca. Establece la marca del celular.
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return toString. Para imprimir de una manera mas sencilla.
     */  
    @Override
    public String toString() {
        return "Software= " + software + ", marca= " + marca + super.toString();
    }
}    