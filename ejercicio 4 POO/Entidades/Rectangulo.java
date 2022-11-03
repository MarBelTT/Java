
package Entidades;

//Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado

import java.util.Scanner;

//base y un atributo privado altura. La clase incluirá un método para crear el rectángulo con
//los datos del Rectángulo dados por el usuario. También incluirá un método para calcular la
//superficie del rectángulo y un método para calcular el perímetro del rectángulo. Por último,
//tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la
//altura. Se deberán además definir los métodos getters, setters y constructores
//correspondientes.
//Superficie = base * altura / Perímetro = (base + altura) * 2.
public class Rectangulo {
    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
Scanner leer = new Scanner(System.in);


public Rectangulo CrearRectangulo(){
    
Rectangulo r1 = new Rectangulo(base, altura);
System.out.println("ingrese la base del rectangulo");
this.base= leer.nextDouble();
System.out.println("ingrese la altura del rectangulo");     
this.altura= leer.nextDouble();

return r1;
}
public void superficieRectangulo(Rectangulo r1){
  double  superficie= r1.getBase() * r1.getAltura();
    System.out.println("la superficie del rectangulo es: " + superficie);
}
 
public void perimetroRectangulo(Rectangulo r1){
    
    double perimetro = (r1.getBase() + r1.getAltura())*2;
    System.out.println("el perímetro es : " + perimetro);
            }
    public void dibujarRectangulo(Rectangulo r1){
        
        for (int i=0; i<r1.getBase(); i++){
            System.out.print(" * ");}
        
            System.out.println("");
            
            for (int i=0; i<r1.getBase()-1; i++){
            System.out.print(" * ");
                for(int j = 0 ; j<r1.getAltura()-1; j++){
                    System.out.print(" ");
            }
            System.out.println(" * ");
            }
             for (int i=0; i<r1.getBase(); i++){
            System.out.print(" * ");
            }   
             System.out.println("");
        } 
        
    }



