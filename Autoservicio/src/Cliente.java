import java.math.BigDecimal;
public class Cliente {
    public BigDecimal dinero;
    private BigDecimal cambio;
    private BigDecimal total;

    public BigDecimal getDinero() {
        return dinero;
    }
    public void setDinero(final BigDecimal dinero) {
        this.dinero = dinero;
    }
    public BigDecimal getCambio() {
        return cambio;
    }
    public void setCambio(final BigDecimal cambio) {
        this.cambio = cambio;
    }
    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }
}