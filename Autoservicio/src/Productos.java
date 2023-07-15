import java.math.BigDecimal;
public class Productos {
    private int id;
    private BigDecimal precio;
    private String name;
    
    public int getId() {
        return id;
    }
    public void setId(final int id) {
        this.id = id;
    }
    public BigDecimal getPrecio() {
        return precio;
    }
    public void setPrecio(final BigDecimal precio) {
        this.precio = precio;
    }
    public String getName() {
        return name;
    }
    public void setName(final String name) {
        this.name = name;
    }
}