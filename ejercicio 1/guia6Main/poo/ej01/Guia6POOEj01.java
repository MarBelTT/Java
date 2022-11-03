
package guia6.poo.ej01;

import Entidades.Libro;
import ServicioLibro.servicioLibro;
import java.util.Scanner;

public class Guia6POOEj01 {

    public static void main(String[] args) {
       
//        Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese los datos del libro : ");
      
        servicioLibro relleno = new servicioLibro();
        Libro libro1= relleno.RellenarLibro();
        System.out.println(libro1.toString());
     
      
       
        
    
    }}
