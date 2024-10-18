
package carga_busqueda_datos;
import static carga_busqueda_datos.main.listaAsignaturas;
import java.util.Scanner;

class Asignatura {
    String docenteAcargo;
    String nombreAsignatura;
    int alumnosTotales;
    int cargaHoraria;
    String horarioAsignatura;
    String diasAsignados;
    String modalidadAsignatura;

    public Asignatura (String docenteAcargo, String nombreAsignatura, int alumnosTotales, int cargaHoraria, String horarioAsignatura,
                  String diasAsignados, String modalidadAsignatura){
        
        this.docenteAcargo = docenteAcargo; 
        this.nombreAsignatura = nombreAsignatura; 
        this.alumnosTotales = alumnosTotales; 
        this.cargaHoraria = cargaHoraria; 
        this.horarioAsignatura = horarioAsignatura; 
        this.diasAsignados = diasAsignados; 
        this.modalidadAsignatura = modalidadAsignatura; 
    }
     // Método para mostrar los datos de la asignatura
    public void mostrarDatosAsignatura() {
         System.out.println(" ");
         System.out.println("______________________________________________________ ");
         System.out.println(" ");
         System.out.println("                     Informe:                     ");
         System.out.println("______________________________________________________ ");
         System.out.println(" ");
         System.out.println("     Docente a cargo: " + docenteAcargo);
         System.out.println("     Nombre de la asignatura: " + nombreAsignatura);
         System.out.println("     Total de Alumnos que cursan la asignatura: " + alumnosTotales);
         System.out.println("     Total de carga horaria de Materia: " + cargaHoraria);
         System.out.println("     Horario de Cursada: " + horarioAsignatura);
         System.out.println("     Días de Cursadas: " + diasAsignados);
         System.out.println("     Modalidad: " + modalidadAsignatura); 
         System.out.println("______________________________________________________ ");
         System.out.println(" ");
    }
    
     public static void casoBuscarAsignatura() {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el nombre de la asignatura a buscar:");
        String asignaturaBuscada = in.nextLine();

        for (Asignatura asignatura : listaAsignaturas) {
            if (asignatura.nombreAsignatura.equals(asignaturaBuscada)){
                asignatura.mostrarDatosAsignatura();
                return; // Termina la función después de encontrar a la asignatura con el nombre buscado
            }
        }
            // Si llega a este punto, significa que no se encontró ningúna asignatura con el nombre buscado
            System.out.println(" ");
            System.out.println("______________________________________________________ ");
            System.out.println(" ");
            System.out.println("  No se encontró ningúna asignatura con ese nombre.  ");
            System.out.println("______________________________________________________ ");
            System.out.println(" ");
     }
}

