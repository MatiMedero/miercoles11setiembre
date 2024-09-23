package Modelo;

public class Libro {
    private String titulo;
    private String autor;
    private int anio;
    private String genero;

    // CONSTRUCTOR

    public Libro(String pTitulo, String pAutor, int pAnio, String pGenero){
        this.titulo=pTitulo;
        this.autor=pAutor;
        this.anio=pAnio;
        this.genero=pGenero;
    }

    // GETTERS Y SETTERS

    public String getTitulo(){
        return this.titulo;
    }
    public void setTitulo(String pTitulo){
        this.titulo=pTitulo;
    }
    public String getAutor(){
        return this.autor;
    }
    public void setAutor(String pAutor){
        this.autor=pAutor;
    }
    public int getAnio(){
        return this.anio;
    }
    public void setAnio(int pAnio){
        this.anio=pAnio;
    }
    public String getGenero(){
        return this.genero;
    }
    public void setGenero(String pGenero){
        this.genero=pGenero;
    }

    @Override
    public String toString() {
        return this.titulo + ", " +this.autor+ ", "+this.anio+", "+this.genero;
    }
}
