
package guia6.poo.ej005;
//Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
//numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero). Las

import Entidades.Cuenta;
import Servicio.ServicioCuenta;

//operaciones asociadas a dicha clase son:
//a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
//b) Agregar los métodos getters y setters correspondientes
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
public class Guia6POOEj005 {

    public static void main(String[] args) {
    
        ServicioCuenta s1 = new ServicioCuenta();
        Cuenta c1= s1.CrearCuenta();
        s1.ingresar(c1);
        s1.retirar(c1);
        s1.extraccionRapida(c1);
        s1.ConsultarSaldo(c1);
        s1.ConsultarDatos(c1);
        
        
    }
    
}
