
package Entidades;
//        Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
//Número de páginas, y un constructor con todos los atributos pasados por parámetro y un

import java.util.Scanner;

//constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
//luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
//numero de páginas.

public class Libro {
    
    public String ISBN;
    public String titulo;
    public String autor;
    public int numeroPaginas;

    public Libro() {
    }
    
    public Libro( String ISBN, String titulo, String autor, int numeroPaginas){
        
        this.ISBN = ISBN;
        this.autor= autor;
        this.titulo= titulo;
        this.numeroPaginas = numeroPaginas; 
        
        
    }


    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPaginas=" + numeroPaginas + '}';
    }

    
    
   
    
    
}
