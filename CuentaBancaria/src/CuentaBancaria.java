
import java.math.BigDecimal;

/** @author mikkel */
public class CuentaBancaria {
 private int id;
 private String nombreUsuario;
 private String apellido;
 private int saldoInicial;   
 private int saldoActual;
 private BigDecimal tasaInteres;
 private String fechaCreacion;

 //Consstructor para la cuenta bancaria
    public CuentaBancaria(int id, String nombreUsuario, String apellido,
            int saldoInicial, int saldoActual, BigDecimal tasaAnual,
            String fechaCreacion) {
        this.id = id;
        this.nombreUsuario = nombreUsuario;
        this.apellido = apellido;
        this.saldoInicial = saldoInicial;
        this.saldoActual = saldoActual;
        this.tasaInteres = tasaAnual;
        this.fechaCreacion = fechaCreacion;
    }

    /**
     * @return id Devuelve el valor del identificador de la cuenta bancaria
     */
    public int getId() {
        return id;
    }

    /**
     * @param id Establece el identificador de la cuenta bancaria
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return saldoActual Devuelve el saldo actual con el que cuenta la cuenta bancaria
     */
    public int getSaldoActual() {
        return saldoActual;
    }

    /**
     * @param saldoActual Establece el saldo actual de la cuenta bancaria
     */
    public void setSaldoActual(int saldoActual) {
        this.saldoActual = saldoActual;
    }

   /**
    * @return tasaInteres Devuelve la tasa del interes que tiene la cuenta bancaria
    */
    public BigDecimal getTasaInteres() {
        return tasaInteres;
    }

    /**
     * @param tasaInteres Establece la tasa de interes mensual de la cuenta bancaria
     */
    public void setTasaInteres(BigDecimal tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    /**
     * @return fechaCreacion Devuelve la fecha en la cual fue creada la cuenta bancaria
     */
    public String getFechaCreacion() {
        return fechaCreacion;
    }
}