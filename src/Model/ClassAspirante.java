package Model;

/**
 *
 * @author san rc
 */
public class ClassAspirante {
    private String nombreAspirante;
    private boolean aceptado;

    public ClassAspirante(String nombreAspirante) {//solo resive un parametro pero todos sera no aceptados
        this.nombreAspirante = nombreAspirante;
        this.aceptado = false;
    }

    public String getNombreAspirante() {
        return nombreAspirante;
    }

    public void setNombreAspirante(String nombreAspirante) {
        this.nombreAspirante = nombreAspirante;
    }

    public boolean isAceptado() {
        return aceptado;
    }

    public void setAceptado(boolean aceptado) {
        this.aceptado = aceptado;
    }

}
