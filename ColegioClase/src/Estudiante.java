
import java.util.ArrayList;

/**
 *
 * @author rabravo
 */
public class Estudiante {

    private String codigo;
    private String nombre;
    private String apellido;
    private String direccion;
    private Carrera carrera;
    private ArrayList<Curso> cursos = new ArrayList<>();

    //constructor variables primitivas
    public Estudiante(String codigo, String nombre, String apellido, String direccion) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public Carrera getCarrera() {
        return carrera;
    }

    //metodos set y get
    public void setCarrera(Carrera carrera) {
        this.carrera = carrera;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getDirección() {
        return direccion;
    }

    public void setDirección(String direccion) {
        this.direccion = direccion;
    }

    public void setCurso(Curso curso) {
        cursos.add(curso);
    }

    @Override
    public String toString() {
        return codigo + "\t " + nombre + " " + apellido + "\t " + direccion;
    }

}
