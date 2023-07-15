/**
 *
 * @author Mikkel
 */
public class MaquinaParaVotaciones {
    private boolean reset;
    String nombrePartido;
    private int tVotos;

    /**
     * @param tVotos Establece los votos iniciales de un partido.
     */
    public MaquinaParaVotaciones(int tVotos) {
        this.tVotos = tVotos;
    }

    /**
     * @return Devuelve el nombre de un partido.
     */
    public String getNombrePartido() {
        return nombrePartido;
    }

    /**
     * @param nombrePartido Establece el nombre del partido.
     */
    public void setNombrePartido(String nombrePartido) {
        this.nombrePartido = nombrePartido;
    }

    /**
     * @return  Devuelve el total de votos pertenecientes al partido.
     */
    public int gettVotos() {
        return tVotos;
    }

    /**
     * @param tVotos Establece el total de votos por partido.
     */
    public void settVotos(int tVotos) {
        this.tVotos = tVotos;
    }

    /**
     * @param  reset Establece cuando el sistema se reinicia.
     */
    public void setReset(boolean reset) {
        this.reset = reset;
    }
    
}