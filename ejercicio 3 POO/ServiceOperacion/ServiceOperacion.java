
package ServiceOperacion;
//Método para crearOperacion(): que le pide al usuario los dos números y los guarda en
//los atributos del objeto.

import Entidades.Operacion;
import java.util.Scanner;

//e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
//f) Método restar(): calcular la resta de los números y devolver el resultado al main
//g) Método multiplicar(): primero válida que no se haga una multiplicación por cero, si
//fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error. Si
//no, se hace la multiplicación y se devuelve el resultado al main
//h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
//una división por cero, el método devuelve 0 y se le informa al usuario el error se le
//informa al usuario. Si no, se hace la división y se devuelve el resultado al main.
public class ServiceOperacion {
    
    public Operacion crearOperacion(){
      Operacion o1 = new Operacion();
      Scanner leer = new Scanner(System.in);
        System.out.println("introduce el numero 1: ");
        o1.setNumero1(leer.nextInt());
        System.out.println("introduce el numero 2: ");
        o1.setNumero2(leer.nextInt());
       
        return o1;
    }
    public void sumar(Operacion o1){
        int suma = ( o1.getNumero1() + o1.getNumero2() );
        System.out.println("la suma es: " + suma);
    }
    public void restar(Operacion o1){
        int resta = o1.getNumero1() - o1.getNumero2();
         System.out.println("la resta es: " + resta);
    }
    public void multiplicar(Operacion o1){
        int multiplicacion=0;
        if (o1.getNumero1() == 0 || o1.getNumero2() == 0 ){
            System.out.println("el resultado es 0, error en la multipliación ");
            
        } else {
           multiplicacion = o1.getNumero1() * o1.getNumero2();
            System.out.println("la multiplicacion es : " + multiplicacion);
        }
       
    }
     public void dividir(Operacion o1){
        int division=0;
        if (o1.getNumero1() == 0 || o1.getNumero2() == 0 ){
            System.out.println("el resultado es 0, error en la division ");
            
        } else {
           division = o1.getNumero1() / o1.getNumero2();
            System.out.println("la division es: " + division);
        }
       
    }
    
}









