
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author rabravo
 */
public class ControlColegio {

    private Colegio colegio;
    private Scanner entrada = new Scanner(System.in);

    public ControlColegio(Colegio colegio) {
        this.colegio = colegio;
        inicializarDatos();
    }

    public void inicializarDatos() {
        //Agregando carreras
        colegio.setCarreras(new Carrera("Sistemas"));
        colegio.setCarreras(new Carrera("Electricidad"));
        colegio.setCarreras(new Carrera("Contador"));
        colegio.setCarreras(new Carrera("Marketing"));

        //Agregando Profesores
        colegio.agregarProfesor(new Profesor("Rudy Bravo", "UMG-1"));
        colegio.agregarProfesor(new Profesor("Von Neumann", "UMG-2"));
        colegio.agregarProfesor(new Profesor("Carlos Ruíz", "UMG-3"));

        //Agregando Estudiantes
        colegio.getEstudiantes().add(new Estudiante("EST-15", "José", "Orozco", "San Marcos"));
        colegio.getEstudiantes().add(new Estudiante("EST-25", "Daniel", "Pérez", "San Marcos"));
        colegio.getEstudiantes().add(new Estudiante("EST-63", "Moisés", "Juárez", "San Marcos"));
        colegio.getEstudiantes().add(new Estudiante("EST-77", "María", "Bravo", "San Marcos"));
        colegio.getEstudiantes().add(new Estudiante("EST-88", "Pedro", "Alvarado", "San Marcos"));

        //Agregando Cursos
        colegio.agregarCurso(new Curso("Matemática 1", "MAT-1"));
        colegio.agregarCurso(new Curso("Matemática 2", "MAT-2"));
        colegio.agregarCurso(new Curso("Matemática 3", "MAT-3"));
        colegio.agregarCurso(new Curso("Programación 1", "SYS-1"));
        colegio.agregarCurso(new Curso("Programación 2", "SYS-2"));
    }

    public void inscribirAlumno() {
        String codigo, nombre, apellido, direccion, buscarCarrera;
        System.out.println("------INSCRIPCION DE ALUMNOS------");
        System.out.print("Ingresar el código: ");
        codigo = entrada.nextLine();
        System.out.print("\nIngresar el nombre: ");
        nombre = entrada.nextLine();
        System.out.print("\nIngresar el apellido: ");
        apellido = entrada.nextLine();
        System.out.print("\nIngresar la dirección: ");
        direccion = entrada.nextLine();
        Estudiante estudiante = new Estudiante(codigo, nombre, apellido, direccion);
        colegio.mostrarCarrera();
        System.out.println("Seleccione la carrera:  ");
        buscarCarrera = entrada.nextLine();
        Carrera c = colegio.buscarCarrera(buscarCarrera);
        if (c == null) {
            System.out.println("¡Error! La carrera ingresada no existe");
        } else {
            System.out.println("Estudiante inscrito");
            colegio.inscribirEstudiante(estudiante, c);
        }
    }

    public void agregarCarrera() {
        System.out.println("-------AGREGAR CARRERA-------");
        System.out.println("Ingrese el nombre de la nueva carrera: ");
        String nuevaCarrera = entrada.next();
        if (colegio.buscarCarrera(nuevaCarrera) == null) {
            colegio.setCarreras(new Carrera(nuevaCarrera));
            System.out.println("¡Exito! La carrera ha sido registrada");
        } else {
            System.out.println("¡Error! La carrera ya existe");
        }
    }

    public void mostrarEstudiantesPorCurso() {
        ArrayList<Curso> cursos = colegio.getCursos();
        for (Curso curso : cursos) {
            curso.mostrarEstudiantes();
        }
    }

    public void agregarProfesor() {
        System.out.println("--------AGREGAR PROFESOR--------");
        System.out.print("Ingrese el Código: ");
        String codigo = entrada.nextLine();
        System.out.print("\nIngrese el Nombre: ");
        String nombre = entrada.nextLine();
        Profesor prof = colegio.buscarProfesor(codigo);
        if (prof == null) {
            colegio.agregarProfesor(new Profesor(nombre, codigo));
            System.out.println("El profesor ha sido registrado");
        } else {
            System.out.println("El profesor ya está registrado");
        }
    }

    public void asignarCarreraProf() {
        System.out.println("--------PROFESORES SIN CARRERA ASIGNADA--------");
        ArrayList<Profesor> profesores = colegio.getProfesores();
        int n = 0;
        for (Profesor prof : profesores) {
            if (prof.getCarrera() == null) {
                System.out.println(prof.toString());
                n++;
            }
        }
        if (n >= 1) {
            System.out.print("Ingrese el código del profesor que desea asignar: ");
            String codigo = entrada.nextLine();
            Profesor p = colegio.buscarProfesor(codigo);
            if (p != null && p.getCarrera() == null) {
                colegio.mostrarCarrera();
                System.out.println("Ingrese la carrera que desea asignar: ");
                String carrera = entrada.nextLine();
                Carrera car = colegio.buscarCarrera(carrera);
                if (car != null) {
                    p.setCarrera(car);
                    System.out.println("Carrera asignada con éxito");
                } else {
                    System.out.println("La carrera ingresada no existe");
                }
            } else {
                System.out.println("El profesor no existe");
            }
        } else {
            System.out.println("No hay profesores para asignar carrera");
        }
    }

    public void asignarProfCurso() {
        colegio.mostrarProfesores();
        System.out.print("Ingrese el código del profesor que desea asignar: ");
        String codigo = entrada.nextLine();
        Profesor p = colegio.buscarProfesor(codigo);
        if (p != null) {
            ArrayList<Curso> cursos = colegio.getCursos();
            System.out.println("--------CURSOS SIN PROFESOR ASIGNADO--------");
            for (Curso curso : cursos) {
                if (curso.getProfesor() == null) {
                    System.out.println(curso.toString());
                }
            }
            System.out.println("Ingrese el código del curso que desea asignar: ");
            String codCurso = entrada.nextLine();
            Curso cur = colegio.buscarCurso(codCurso, "");
            if (cur != null && cur.getProfesor() == null) {
                cur.setProfesor(p);
                System.out.println("Se ha asignado el profesor al curso");
            } else {
                System.out.println("El curso no existe");
            }
        } else {
            System.out.println("El profesor no existe");
        }
    }

    public void agregarCurso() {
        System.out.println("--------AGREGAR CURSO--------");
        System.out.print("Ingrese el código: ");
        String codigo = entrada.nextLine();
        System.out.print("\nIngrese el nombre:");
        String nombre = entrada.nextLine();
        Curso curso = colegio.buscarCurso(codigo, nombre);
        if (curso == null) {
            colegio.agregarCurso(new Curso(nombre, codigo));
            System.out.println("El curso se ha registrado correctamente");
        } else {
            System.out.println("El curso ya está registrado");
        }
    }

    public Colegio getColegio() {
        return colegio;
    }
}
