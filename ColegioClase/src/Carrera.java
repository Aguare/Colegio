
import java.util.ArrayList;

/**
 *
 * @author rabravo
 */
public class Carrera {

    private String nombre;
    private Colegio colegio;
    private ArrayList<Profesor> profesores = new ArrayList<>();
    //lista para inscribir estudiantes
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();

    //constructor
    public Carrera(String nombre) {
        this.nombre = nombre;

    }

    public void setEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    //Metodos set y get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Colegio getColegio() {
        return colegio;
    }

    public void setColegio(Colegio colegio) {
        this.colegio = colegio;
    }

    public void setProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public void mostrarEstudiantes() {
        System.out.println("------ " + nombre.toUpperCase() + " ------");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i).toString());
        }
    }
}
