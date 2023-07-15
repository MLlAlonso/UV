import java.math.BigDecimal;

/**
 * @author Mikkel
 */
public class Producto {
    String nombre;
    BigDecimal precio;
    BigDecimal descuento;

    /**
     * @param nombre Establece el nombre del producto.
     * @param precio Establece el precio del producto.
     */
    public Producto(String nombre, BigDecimal precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    /**
     * @return Obtiene el nombre del producto.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre Establece el nombre del producto.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return Obtiene el precio del producto.
     */
    public BigDecimal getPrecio() {
        return precio;
    }

    /**
     * @param precio Establece el precio del producto.
     */
    public void setPrecio(BigDecimal precio) {
        this.precio = precio;
    }

    /**
     * @return Obtiene el descuento otorgado al producto.
     */
    public BigDecimal getDescuento() {
        return descuento;
    }

    /**
     * @param descuento Establece un descuento al precio final del producto.
     */
    public void setDescuento(BigDecimal descuento) {
        this.descuento = descuento;
    }

    /**
     * Imprime el nombre y precio final del producto.
     */
    @Override
    public String toString() {
        return nombre + ", precio= $" + precio;
    }
}