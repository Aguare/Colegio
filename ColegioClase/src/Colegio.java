
import java.util.ArrayList;

/**
 * Clase de colegio
 *
 * @author rabravo
 */
public class Colegio {

    private String nombre;
    private String direccion;

    private ArrayList<Carrera> carreras = new ArrayList<>();
    private ArrayList<Estudiante> estudiantes = new ArrayList<>();
    private ArrayList<Curso> cursos = new ArrayList<>();
    private ArrayList<Profesor> profesores = new ArrayList<>();

    //constructor
    public Colegio(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
    }

    public Carrera buscarCarrera(String nombre) {
        for (Carrera carrera : carreras) {
            if (carrera.getNombre().equalsIgnoreCase(nombre)) {
                return carrera;
            }
        }
        return null;

    }

    public void mostrarCarrera() {
        System.out.println("------Carreras Disponibles------");
        for (int i = 0; i < carreras.size(); i++) {
            System.out.println((i + 1) + ". " + carreras.get(i).getNombre());
        }
        System.out.println("--------------------------------");
    }

    public void mostrarEstudiantes() {
        System.out.println("------LISTADO DE ESTUDIANTES INSCRITOS------");
        for (int i = 0; i < estudiantes.size(); i++) {
            System.out.println((i + 1) + ". " + estudiantes.get(i).toString());
        }
        System.out.println("--------------------------------------------");
    }

    public void mostrarProfesores() {
        System.out.println("------LISTADO DE PROFESORES------");
        for (int i = 0; i < profesores.size(); i++) {
            System.out.println((i + 1) + ". " + profesores.get(i).toString());
        }
        System.out.println("--------------------------------------------");
    }

    //medoto inscripcion
    public void inscribirEstudiante(Estudiante estudiante, Carrera carrera) {
        estudiantes.add(estudiante);
        carrera.setEstudiante(estudiante);
        estudiante.setCarrera(carrera);
    }

    public void agregarCurso(Curso curso) {
        cursos.add(curso);
    }

    public void agregarProfesor(Profesor profesor) {
        profesores.add(profesor);
    }

    public Profesor buscarProfesor(String codigo) {
        for (Profesor profesor : profesores) {
            if (profesor.getCodigo().equalsIgnoreCase(codigo)) {
                return profesor;
            }
        }
        return null;
    }

    public Curso buscarCurso(String codigo, String nombre) {
        for (Curso curso : cursos) {
            if (curso.getCodigo().equalsIgnoreCase(codigo) || curso.getNombre().equalsIgnoreCase(nombre)) {
                return curso;
            }
        }
        return null;
    }

    //metodos set y get
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEstudiantes(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void setCarreras(Carrera carrera) {
        carreras.add(carrera);
    }

    public ArrayList<Carrera> getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList<Carrera> carreras) {
        this.carreras = carreras;
    }

    public ArrayList<Estudiante> getEstudiantes() {
        return estudiantes;
    }

    public void setEstudiantes(ArrayList<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    public ArrayList<Curso> getCursos() {
        return cursos;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }

    public ArrayList<Profesor> getProfesores() {
        return profesores;
    }

    public void setProfesores(ArrayList<Profesor> profesores) {
        this.profesores = profesores;
    }

}//Fin de la Clase Colegio
