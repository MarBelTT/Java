
package guia6.pooej004;
//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
//base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con

import Entidades.Rectangulo;

//los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
//superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
//tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
//altura. Se deberán además definir los métodos getters, setters y constructores
//correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.
public class Guia6POOej004 {

    public static void main(String[] args) {
    
        Rectangulo r1=new Rectangulo();
        r1.CrearRectangulo();
        r1.superficieRectangulo(r1);
        r1.perimetroRectangulo(r1);
        r1.dibujarRectangulo(r1);
    }
    
}
