
package carga_busqueda_datos;

import static carga_busqueda_datos.main.listaAlumnos;
import java.util.Scanner;

class Alumno {
    int documento;
    String nombre;
    String apellido;
    String materia;
    String horarioCursada;
    String diasCursada;
    String modalidad;

    public Alumno(int documento, String nombre,String apellido,String materia,String horarioCursada,
                  String diasCursada, String modalidad){
        
        this.documento = documento; 
        this.nombre = nombre; 
        this.apellido = apellido; 
        this.materia = materia; 
        this.horarioCursada = horarioCursada; 
        this.diasCursada = diasCursada; 
        this.modalidad = modalidad; 
    }
     // Método para mostrar los datos del alumno
    public void mostrarDatosAlumno() {
        
         System.out.println(" ");
         System.out.println("______________________________________________________ ");
         System.out.println(" ");
         System.out.println("                   Informe:                   ");
         System.out.println("______________________________________________________ ");
         System.out.println(" ");
         System.out.println("     Documento: " + documento);
         System.out.println("     Nombre: " + nombre);
         System.out.println("     Apellido: " + apellido);
         System.out.println("     Materia: " + materia);
         System.out.println("     Horario de Cursada: " + horarioCursada);
         System.out.println("     Días de Cursadas: " + diasCursada);
         System.out.println("     Modalidad: " + modalidad);
         System.out.println("______________________________________________________ ");
         System.out.println(" ");
    }
    
     public static void casoBuscarAlumno() {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el documento del alumno a buscar:");
        int documentoBuscado = in.nextInt();

        for (Alumno alumno : listaAlumnos) {
            if (alumno.documento== documentoBuscado){
                alumno.mostrarDatosAlumno();
                return; // Termina la función después de encontrar al primer alumno con el documento buscado
            }
        }
            // Si llega a este punto, significa que no se encontró ningún alumno con el documento buscado
            System.out.println(" ");
            System.out.println("______________________________________________________ ");
            System.out.println(" ");
            System.out.println("    No se encontró ningún alumno con ese documento.    ");
            System.out.println("______________________________________________________ ");
            System.out.println(" ");
     }
}
