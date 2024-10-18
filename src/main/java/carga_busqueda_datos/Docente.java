package carga_busqueda_datos;
import static carga_busqueda_datos.main.listaDocentes;
import java.util.Scanner;

class Docente {
    int documentoDocente;
    String nombreDocente;
    String apellidoDocente;
    String materiaAsignada;
    String horarioDictada;
    String diasDictada;
    String modalidadDictada;

    public Docente(int documentoDocente, String nombreDocente,String apellidoDocente,String materiaAsignada,String horarioDictada,
                  String diasDictada, String modalidadDictada){
        
        this.documentoDocente = documentoDocente; 
        this.nombreDocente = nombreDocente; 
        this.apellidoDocente = apellidoDocente; 
        this.materiaAsignada = materiaAsignada; 
        this.diasDictada = diasDictada; 
        this.horarioDictada = horarioDictada; 
        this.modalidadDictada = modalidadDictada; 
    }
     // Método para mostrar los datos del Docente
    public void mostrarDatosDocente() {
        
         System.out.println(" ");
         System.out.println("______________________________________________________ ");
         System.out.println(" ");
         System.out.println("                   Informe:                   ");
         System.out.println("______________________________________________________ ");
         System.out.println(" ");
         System.out.println("     Documento Docente: " + documentoDocente);
         System.out.println("     Nombre Docente: " + nombreDocente);
         System.out.println("     Apellido Docente: " + apellidoDocente);
         System.out.println("     Materia que Dicta: " + materiaAsignada);
         System.out.println("     Horario de Cursada: " + horarioDictada);
         System.out.println("     Días que dicta: " + diasDictada);
         System.out.println("     Modalidad: " + modalidadDictada);
         System.out.println("______________________________________________________ ");
         System.out.println(" ");
    }
    
     public static void casoBuscarDocente() {
        Scanner in = new Scanner(System.in);
        System.out.print("Ingrese el documento del Docente a buscar:");
        int documentoDocenteBuscado = in.nextInt();

        for (Docente docente : listaDocentes) {
            if (docente.documentoDocente== documentoDocenteBuscado){
                docente.mostrarDatosDocente();
                return; // Termina la función después de encontrar al primer docente con el documento buscado
            }
        }
            // Si llega a este punto, significa que no se encontró ningún docente con el documento buscado
            System.out.println(" ");
            System.out.println("______________________________________________________ ");
            System.out.println(" ");
            System.out.println("  No se encontró ningún docente con ese documento.  ");
            System.out.println("______________________________________________________ ");
            System.out.println(" ");
     }
}
