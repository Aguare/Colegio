
import java.util.Scanner;

/**
 * Clase principal para el colegio
 *
 * @author rabravo
 */
public class PrincipalColegio {

    public static ControlColegio control;

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        control = new ControlColegio(new Colegio("LA ESPERANZA", "SAN MARCOS"));
        mostrarMenu();
    }

    //metodo para inscribir al estudiante
    public static void mostrarMenu() {
        Scanner entrada = new Scanner(System.in);
        int opcion = 0;
        do {
            borrarPantalla();
            System.out.println("Bienvenidos al programa del colegio");
            System.out.println("*********MENU DE OPCIONES*********");
            System.out.println("1.  Inscribir alumnos");
            System.out.println("2.  Agregar carrera al colegio");
            System.out.println("3.  Agregar profesor");
            System.out.println("4.  Asignar profesores a una carrera");
            System.out.println("5.  Agregar Curso");
            System.out.println("6.  Asignar profesores a cursos");
            System.out.println("7.  Asignar estudiante a curso");
            System.out.println("8.  Mantenimiento de cursos");
            System.out.println("9.  Mostrar los datos de un curso");
            System.out.println("10. Mostar los estudiantes por curso");
            System.out.println("11. Mostar todos los estudiantes");
            System.out.println("12. Salir del programa");
            System.out.println("-----------------------------------");
            System.out.println("Ingrese su opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();
            switch (opcion) {
                case 1 -> {
                    control.inscribirAlumno();
                }
                case 2 -> {
                    control.agregarCarrera();
                }
                case 3 -> {
                    control.agregarProfesor();
                }
                case 4 -> {
                    control.asignarCarreraProf();
                }
                case 5 -> {
                    control.agregarCurso();
                }
                case 6 -> {
                    control.asignarProfCurso();
                }
                case 7 -> {
                    
                }
                case 10 -> {
                    control.mostrarEstudiantesPorCurso();
                }
                case 11 -> {
                    control.getColegio().mostrarEstudiantes();
                }
                case 12 -> {
                    System.out.println("Ha elegio salir del programa");
                    System.out.println("Esperamos que vuelva");
                }
                default -> {
                    System.out.println("Opción Inválida");
                }
            }//fi7n del case
        } while (opcion != 12);
    }//fin de metodo menu;

    public static void borrarPantalla() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }
}//fin de clase principal
