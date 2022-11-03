
package ServicioCafetera;
//• Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima.
//• Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
//tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
//cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
//método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
//cuanto quedó la taza.
//• Método vaciarCafetera(): pone la cantidad de café actual en cero.
//• Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
//recibe y se añade a la cafetera la cantidad de café indicada.
import Entidades.Cafetera;
import java.util.Scanner;


public class ServicioCafetera {
  Scanner leer = new Scanner(System.in);  
  
    public Cafetera llenarCafetera(){
        Cafetera c1 = new Cafetera();
        System.out.println("Ingrese la capacidad máxima de la cafetera: ");
        c1.setCapacidadMaxima(leer.nextInt());
        c1.setCantidadActual(c1.getCapacidadMaxima()) ;
        System.out.println("La cantidad actual de café es :" + c1.getCantidadActual()); 
        return  c1;
        
    }
    public void ServirTaza(Cafetera c1){
        System.out.println("Para servir taza de café. Ingrese la capacidad de la taza: ");
        int taza= leer.nextInt();
        if (taza> c1.getCantidadActual()) {
            System.out.println("La cantidad actual de café es menor al tamaño de la taza. Se sirvió " + c1.getCantidadActual() + " en la taza");     
        }
        else {
            c1.setCantidadActual(c1.getCantidadActual()- taza);
            System.out.println("La taza pudo llenarse sin problemas");
            System.out.println("La cantidad actual de café es: "+ c1.getCantidadActual());
        }
        }
        public void VaciarCafetera(Cafetera c1 ){
            c1.setCantidadActual(0);
            System.out.println("La cafetera ha sido vaciada"); 
        }
        public void agregarCafe(Cafetera c1){
            System.out.println("Ingrese la cantidad de café a agregar en la cafetera: ");
            int añadirCafe = leer.nextInt();
            c1.setCantidadActual(añadirCafe);
            System.out.println("La cantidad actual de cafe es: " + c1.getCantidadActual());
        }
    }
    

