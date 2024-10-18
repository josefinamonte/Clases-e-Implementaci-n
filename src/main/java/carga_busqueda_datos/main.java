
package carga_busqueda_datos;
import static carga_busqueda_datos.main.listaAlumnos;
import static carga_busqueda_datos.main.listaDocentes;
import static carga_busqueda_datos.main.listaAsignaturas;
import java.util.ArrayList;
import java.util.Scanner;


public class main {
   static ArrayList<Alumno> listaAlumnos;
   static ArrayList<Docente> listaDocentes;
   static ArrayList<Asignatura> listaAsignaturas;

   public static void main(String[] args) {        
       listaAlumnos= new ArrayList<>();
       listaDocentes= new ArrayList<>();
       listaAsignaturas= new ArrayList<>();
        
       int opcion;//declaro variable
       Scanner in = new Scanner(System.in);

      do{
          menu();//llamo procedimiento
          opcion=in.nextInt();
          in.nextLine(); // Limpiar el buffer

          switch (opcion) {
              case 1:
                    casoCargaAlumnos();//llamo a procedimiento
                  break;
               case 2:
                    casoCargaDocentes();//llamo a procedimiento
                  break;
                case 3:
                    casoCargaAsignaturas();//llamo a procedimiento
                  break;
              case 4:
                    Alumno.casoBuscarAlumno();//llamo procedimiento
                  break;
              case 5:
                    Docente.casoBuscarDocente();//llamo procedimiento
                  break;
              case 6:
                    Asignatura.casoBuscarAsignatura();//llamo procedimiento
                  break;

               default:
                   break;
          }
      } while(opcion!=7);

      in.close();
   }

   public static void menu(){
       
        System.out.println("");
        System.out.println("******************************************************");
        System.out.println("********************  Bienvenido  ********************");
        System.out.println("******************************************************");
        System.out.println("______________________________________________________ ");
        System.out.println("                                                   ");
        System.out.println("                        Menu                       ");
        System.out.println("______________________________________________________ ");
        System.out.println("        ");
        System.out.println("        ");
        System.out.println("1 - Carga de Alumnos           4 - Buscar Alumno");
        System.out.println("2 - Carga de Docentes          5 - Buscar Docente");
        System.out.println("3 - Carga de Asignaturas       6 - Buscar Asignatura");
        System.out.println("                               7 - Salir");
        System.out.println("");
        System.out.println("______________________________________________________ ");
        System.out.println("");
   }
   
    public static void casoCargaAlumnos() {
     Scanner in = new Scanner(System.in); // Crear un objeto Scanner para ingresar datos

         System.out.println(" ");
         System.out.println("______________________________________________________ ");
         System.out.println(" ");
         System.out.println("               Carga de Alumno:                ");
         System.out.println("______________________________________________________ ");
         System.out.println(" ");   
         
         System.out.print("Ingrese documento del alumno: ");
         int documento = in.nextInt();
         in.nextLine(); // Limpiar el buffer

        System.out.print("Ingrese nombre del alumno: ");
        String nombre = in.nextLine();

        System.out.print("Ingrese apellido del alumno: ");
        String apellido = in.nextLine();

        System.out.print("Ingrese materia que cursa el alumno: ");
        String materia = in.nextLine();
        
        System.out.print("Ingrese horio de cursada de la materia que "
                          + "cursa el alumno: ");
        String horarioCursada = in.nextLine();
        
        System.out.print("Ingrese el dia de cursada de la materia que "
                          + "cursa el alumno: ");
        String diasCursada = in.nextLine();
         
        System.out.print("Ingresela modalidad: "
                         + " [virtual, hibrido, presencial] "
                         + "de cursada de la materia que cursa el alumno: ");
        String modalidad = in.nextLine(); 
        System.out.print("");
        System.out.println("______________________________________________________ ");

        // Crear un objeto Alumno con los datos ingresados
        Alumno nuevoAlumno = new Alumno(documento, nombre, apellido, materia, horarioCursada, diasCursada, modalidad);
        listaAlumnos.add(nuevoAlumno); // Agregar el nuevo alumno a la lista
        System.out.println(" ");
        System.out.println("______________________________________________________ ");
        System.out.println(" ");
        System.out.println("           ¡Alumno agregado exitosamente!           ");
        System.out.println("______________________________________________________ ");
        System.out.println(" ");

    }
    public static void casoCargaDocentes() {
     Scanner in = new Scanner(System.in); // Crear un objeto Scanner para ingresar datos

        System.out.print("Ingrese documento del Docente: ");
        int documentoDocente = in.nextInt();
        in.nextLine(); // Limpiar el buffer
                 
        System.out.print("Ingrese nombre del Docente: ");
        String nombreDocente = in.nextLine();

        System.out.print("Ingrese apellido del Docente: ");
        String apellidoDocente = in.nextLine();

        System.out.print("Ingrese materia que le asignaron al docente: ");
        String materiaAsignada= in.nextLine();
        
        System.out.print("Ingrese horio de cursada de la materia que dicta el docente: ");
        String horarioDictada = in.nextLine();
        
        System.out.print("Ingrese el dia de cursada de la materia que dicta el docente: ");
        String diasDictada = in.nextLine();
         
        System.out.print("Ingresela modalidad (virtual, hibrido, presencial) de cursada de la materia que dicta el docente: ");
        String modalidadDictada = in.nextLine(); 

        // Crear un objeto Docente con los datos ingresados
        Docente nuevoDocente = new Docente(documentoDocente, nombreDocente, apellidoDocente, materiaAsignada, horarioDictada, diasDictada, modalidadDictada);
        listaDocentes.add(nuevoDocente); // Agregar el nuevo docente a la lista
        
        System.out.println(" ");
        System.out.println("______________________________________________________ ");
        System.out.println(" ");
        System.out.println("¡Docente agregado exitosamente!");
        System.out.println("______________________________________________________ ");
        System.out.println(" ");

    }
       public static void casoCargaAsignaturas() {
        Scanner in = new Scanner(System.in); // Crear un objeto Scanner para ingresar datos
        
        System.out.print("Ingrese nombre del Docente a cargo de la asignatura: ");
        String docenteAcargo = in.nextLine();

        System.out.print("Ingrese nombre de la signatura que desea cargar: ");
        String nombreAsignatura = in.nextLine();
        in.nextLine(); // Limpiar el buffer
        
        System.out.print("Ingrese el total de alumnos anotados a la asignatura: ");
        int alumnosTotales = in.nextInt();

        System.out.print("Ingrese la carga horaria total de la materia: ");
        int cargaHoraria= in.nextInt();
        
        System.out.print("Ingrese horio de cursada de la materia: ");
        String horarioAsignatura = in.nextLine();
        
        System.out.print("Ingrese el dia de cursada de la materia: ");
        String diasAsignados = in.nextLine();
                 
        System.out.print("Ingresela modalidad (virtual, hibrido, presencial) de cursada de la materia que dicta el docente: ");
        String modalidadAsignatura = in.nextLine();
        in.nextLine(); // Limpiar el buffer

        // Crear un objeto Asignatura con los datos ingresados
        Asignatura nuevaAsignatura = new Asignatura(docenteAcargo, nombreAsignatura, alumnosTotales, cargaHoraria, horarioAsignatura, diasAsignados, modalidadAsignatura);
        listaAsignaturas.add(nuevaAsignatura); // Agregar la nueva asignatura a la lista
        System.out.println(" ");
        System.out.println("______________________________________________________ ");
        System.out.println(" ");
        System.out.println("¡Asignatura agregada exitosamente!");
        System.out.println("______________________________________________________ ");
        System.out.println(" ");
    }
    
}