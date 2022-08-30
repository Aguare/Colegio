
/**
 *
 * @author rabravo
 */
public class Profesor {

    private String nombre;
    private String codigo;
    private Carrera carrera;
    //constructor

    public Profesor(String nombre, String codigo) {
        this.nombre = nombre;
        this.codigo = codigo;
    }

    //metodos set y get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return codigo + "\t " + nombre;
    }

}
