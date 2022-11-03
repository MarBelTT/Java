
package Servicio;
import Entidades.Cuenta;
import java.util.Scanner;
//c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
//d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
//y se la sumara a saldo actual.
//e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se la
//restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se pondrá el
//saldo actual en 0.
//f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
//usuario no saque más del 20%.
//g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
//h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
public class ServicioCuenta {
  Scanner leer= new Scanner(System.in);
  
    public Cuenta CrearCuenta(){
        Cuenta c1 = new Cuenta();
        System.out.println("Ingrese el número de cuenta: ");
        c1.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese el DNI del titular: ");
        c1.setDNI(leer.nextInt());
        System.out.println("Ingrese el Saldo Actual");
        c1.setSaldoActual(leer.nextInt());       
     
        return c1;
    }   
    public void ingresar(Cuenta c1){
        
        System.out.println("Monto a ingresar: ");
        double ingreso= leer.nextDouble();
        c1.setSaldoActual(ingreso + c1.getSaldoActual());
        System.out.println("El saldo actual es: " + c1.getSaldoActual());
}
    public void retirar(Cuenta c1){
        System.out.println("Monto a retirar: ");
        double retiro= leer.nextDouble();
        c1.setSaldoActual(c1.getSaldoActual() - retiro);
        System.out.println("El saldo actual es: " + c1.getSaldoActual());
    }    
        public void extraccionRapida(Cuenta c1){
            System.out.println("Extracción rápida - Monto a extraer: ");
            double extraccion= leer.nextDouble();
            double veintePorciento= (c1.getSaldoActual() * 0.2);
            if(extraccion<=veintePorciento){
                c1.setSaldoActual(c1.getSaldoActual()-extraccion);
                System.out.println("El saldo actual es: " + c1.getSaldoActual());
            } else { System.out.println("La extracción es mayor al 20%");
            
            }
            }
            public void ConsultarSaldo(Cuenta c1){
                System.out.println("Su saldo actual es: " + c1.getSaldoActual());
                
            }
          public void ConsultarDatos(Cuenta c1){
              System.out.println(c1.toString()); 
          }  
        }
        

    
    

