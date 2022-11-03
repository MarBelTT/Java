
package ServicioLibro;

import Entidades.Libro;
import java.util.Scanner;

public class servicioLibro {
   
    private Scanner leer = new Scanner(System.in);
    
        public Libro RellenarLibro() {
            System.out.println("ISBN: ");
            String ISBN = leer.next();
            System.out.println("titulo: ");
            String titulo = leer.next();
            System.out.println("autor: ");
            String autor= leer.next();
            System.out.println("Número de páginas: ");
            int numeroPaginas = leer.nextInt();
            
            return new Libro(ISBN, titulo, autor, numeroPaginas);
        }
    
}
    
        
        
            
    
    
    

