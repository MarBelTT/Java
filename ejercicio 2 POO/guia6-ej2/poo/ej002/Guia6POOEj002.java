
package guia6.poo.ej002;

import EntidadesEj002.Circunferencia;
import ServiceCircunferencia.ServiceCircunferencia;

public class Guia6POOEj002 {

    public static void main(String[] args) {
        
ServiceCircunferencia cs = new ServiceCircunferencia();
Circunferencia c1 = cs.crearCircunferencia();
cs.CalcularArea(c1);
cs.CalcularPerimetro(c1);


    }
    
}
