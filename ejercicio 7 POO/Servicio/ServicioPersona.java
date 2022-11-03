
package Servicio;
//• Metodo crearPersona(): el método crear persona, le pide los valores de los atributos al
//usuario y después se le asignan a sus respectivos atributos para llenar el objeto
//Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o O.
//Si no es correcto se deberá mostrar un mensaje
//• Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
//kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20, significa
//que la persona está por debajo de su peso ideal y la función devuelve un -1. Si la
//fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la persona
//está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado de la
//fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
//función devuelve un 1.
//• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
//un booleano.
import Entidades.Persona;
import java.util.Scanner;



public class ServicioPersona {
    Scanner leer = new Scanner(System.in);
    public Persona crearPersona(){
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre: ");
        p1.setNombre(leer.next());
        System.out.println("Ingrese edad: ");
        p1.setEdad(leer.nextInt());
       
       Boolean hombreOmujer= false;
       String mujer = "f";
       String hombre = "m";
       String sexo;
           do{
               System.out.println("ingrese la letra m para hombre o la letra f para mujer");
             sexo= leer.next();
             if(sexo.equals(mujer) || sexo.equals(hombre)){
                 hombreOmujer= true;
             } 
           }while( hombreOmujer==false  ); 
        if(sexo.equals(hombre) ){
            p1.setSexo("Hombre");
        } else if(sexo.equals(mujer) ){
            p1.setSexo("Mujer");
        }
        
        return p1;
          
           }
        public void calcularIMC(Persona p1){
        System.out.println("Ingrese el peso: ");
        p1.setPeso(leer.nextDouble());
        System.out.println("Introduzca la altura en numero sin coma: ");
        p1.setAltura(leer.nextInt());
        double IMC = (p1.getPeso()/(Math.pow(p1.getAltura()*0.01, 2)));
            System.out.println("IMC: " + IMC);
        if(IMC < 20) {
            System.out.println("Está por debajo del peso ideal");
            IMC = -1;
        } else if(IMC <= 25 && IMC >= 20){
            System.out.println("Está en peso ideal");
            IMC = 0;
        } else if(IMC > 25 ) {
            System.out.println("Está por arriba del peso ideal");
            IMC = 1;
        }
    }
    //• Método esMayorDeEdad(): indica si la persona es mayor de edad. La función devuelve
//un booleano.
    
    public void esMayorDeEdad(Persona p1){
        boolean MayorDeEdad;
      if  (p1.getEdad() < 18 ){
          MayorDeEdad = false;
          System.out.println("Menor de edad");
      } else {
          MayorDeEdad = true;
          System.out.println("Mayor de edad");
      }
        
    }
}
