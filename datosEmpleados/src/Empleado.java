/**
 * @author Mikkel
 */
public class Empleado {
    private int ID;
    private String nombre,direccion,tel;
    private double sueldo;

    public Empleado(int ID, String nombre, String direccion, String tel, double sueldo) {
        this.ID = ID;
        this.nombre = nombre;
        this.direccion = direccion;
        this.tel = tel;
        this.sueldo = sueldo;
    }

    /**
     *@return Obtiene el id del empleado.
     */
    public int getID() {
        return ID;
    }
    /**
     *@param ID Establece el id del empleado.
     */
    public void setID(int ID) {
        this.ID = ID;
    }
    /**
     *@return Devuelve el nombre del empleado. 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     *@param nombre Establece el nombre del empleado. 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     *@return Devuelve la dirección del empleado.
     */
    public String getDireccion() {
        return direccion;
    }
    /**
     *@param direccion Establece la dirección del empleado.
     */
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    /**
     *@return Obtiene el numero de telefono del empleado. 
     */
    public String getTel() {
        return tel;
    }
    /**
     *@param tel Establece numero telefonico del empleado.
     */
    public void setTel(String tel) {
        this.tel = tel;
    }
    /**
     *@return Devuelve el sueldo del empleado. 
     */
    public double getSueldo() {
        return sueldo;
    }
    /**
     *@param sueldo Establece el sueldo del empleado.
     */
    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}