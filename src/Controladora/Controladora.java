package Controladora;

import Modelo.Libro;

import java.util.ArrayList;
import java.util.Scanner;

public class Controladora {

    private ArrayList<Libro> libros = new ArrayList<Libro>();
    private static Scanner escaner = new Scanner(System.in);
    public void altaLibro(){
        System.out.println("** ALTA LIBRO **");
        String titulo, autor, genero;
        int anio;

        do{
            System.out.println("Ingrese título");
            titulo = escaner.nextLine();
            if(existeTitulo(titulo)!=null)
                System.out.println("El título ya existe");
        }
        while(titulo.isEmpty() || existeTitulo(titulo)!=null);

        do{
            System.out.println("Ingrese autor");
            autor = escaner.nextLine();
        }
        while(autor.isEmpty());

        do{
            System.out.println("Ingrese anio");
            try{
                anio = Integer.parseInt(escaner.nextLine());
            }
            catch(Exception e){
                anio=0;
            }
        }
        while(anio==0);

        do{
            System.out.println("Ingrese género");
            genero = escaner.nextLine();
        }
        while(genero.isEmpty());

        Libro unLibro = new Libro(titulo, autor, anio, genero);
        libros.add(unLibro);
    }
    public void buscarLibro(){
        System.out.println("Ingrese el título del libro");
        String titulo = escaner.nextLine();

        if(existeTitulo(titulo)!=null){
            Libro l = existeTitulo(titulo);
            System.out.println(l.toString());
        }
        else{
            System.out.println("No se encontró el libro");
        }
    }
    public void modificarLibro(){
        System.out.println("Ingrese el título del libro");
        String tituloABuscar = escaner.nextLine();
        String titulo, autor, genero;
        int anio;
        Libro l;
        if(existeTitulo(tituloABuscar)!=null){
            l = existeTitulo(tituloABuscar);

            do{
                System.out.println("Ingrese título");
                titulo = escaner.nextLine();
                if(existeTitulo(titulo)!=null)
                    System.out.println("El título ya existe");
            }
            while(existeTitulo(titulo)!=null);
            if(titulo.isEmpty())
                titulo=l.getTitulo();
            l.setTitulo(titulo);

            System.out.println("Ingrese autor");
            autor = escaner.nextLine();
            if(autor.isEmpty())
                autor=l.getAutor();
            l.setAutor(autor);

            System.out.println("Ingrese anio");
            try{
                anio = Integer.parseInt(escaner.nextLine());
            }
            catch(Exception e){
                anio=0;
            }
            if(anio==0)
                anio=l.getAnio();
            l.setAnio(anio);

            System.out.println("Ingrese género");
            genero = escaner.nextLine();
            if(genero.isEmpty())
                genero=l.getGenero();
            l.setGenero(genero);

        }
        else{
            System.out.println("No se encontró el libro");
        }
    }
    public void eliminarLibro(){
        System.out.println("Ingrese el título del libro");
        String tituloABuscar = escaner.nextLine();
        if(existeTitulo(tituloABuscar)!=null) {
            libros.remove(existeTitulo(tituloABuscar));
            System.out.println("Eliminado con éxito");
        }
        else{
            System.out.println("No se pudo eliminar");
        }
    }
    public void listarLibros(){
        for (Libro l : libros) {
            System.out.println(l.toString());
        }
    }
    public void promedioAnioPublicacion(){
        int suma = 0;
        for(int i = 0;i<libros.size();i++){
           suma+=libros.get(i).getAnio();
        }
        System.out.println("El promedio de años de libros es: "+(suma/libros.size()));
    }
    public void buscarLibrosPorGenero(){
        System.out.println("Ingrese un género");
        String genero = escaner.nextLine();

        for(Libro l : buscarPorGenero(genero)){
            System.out.println(l.toString());
        }
    }
    private Libro existeTitulo(String pTitulo){
        for(Libro l : libros){
            if(l.getTitulo().equals(pTitulo))
                return l;
        }
        return null;
    }
    private ArrayList<Libro> buscarPorGenero(String pGenero){
        ArrayList<Libro> librosPorGenero = new ArrayList<>();
        for(int i =0;i<libros.size();i++){
            if(libros.get(i).getGenero().equals(pGenero))
                librosPorGenero.add(libros.get(i));
        }
        return librosPorGenero;
    }
}
