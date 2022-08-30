
import java.util.ArrayList;

/**
 * Esta es la clase que lleva el registro de cursos
 *
 * @author rabravo
 */
public class Curso {

    private String nombre;
    private String codigo;
    private Profesor profesor;
    public ArrayList<Estudiante> estudiantes = new ArrayList<>();

    //constructor
    public Curso(String nombre, String codigo) {
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

    public Profesor getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public void setEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes() {
        System.out.println("------ " + nombre.toUpperCase() + " ------");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i).toString());
        }
        if (estudiantes.isEmpty()) {
            System.out.println("  Sin estudiantes asignados");
        }
    }

    @Override
    public String toString() {
        return codigo + "\t " + nombre;
    }

}//fin clase curso
