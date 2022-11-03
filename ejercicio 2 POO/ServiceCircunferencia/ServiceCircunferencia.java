
package ServiceCircunferencia;
import EntidadesEj002.Circunferencia;
import java.util.Scanner;

//Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
//objeto.
//d) Método area(): para calcular el área de la circunferencia (���� = � ∗ ������).
//e) Método perimetro(): para calcular el perímetro (��������� = � ∗ � ∗ �����).


public class ServiceCircunferencia {
    
    public Circunferencia crearCircunferencia() {
    Circunferencia c1 = new Circunferencia();
    Scanner leer= new Scanner(System.in);
        System.out.println("ingrese el radio : ");
        c1.setRadio(leer.nextDouble());
        return c1;
}

 public void CalcularArea(Circunferencia c1) {
    double area= Math.PI * Math.pow( c1.getRadio(), 2);
     System.out.println("el area es : " + area );
   
}   
    public void CalcularPerimetro(Circunferencia c1){
        double perimetro = 2 * Math.PI * c1.getRadio() ;
        System.out.println("el perímetro es: " + perimetro);
    }
}