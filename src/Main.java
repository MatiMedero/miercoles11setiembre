import Controladora.Controladora;

import java.util.Scanner;

public class Main {
    static Scanner escaner = new Scanner(System.in);
    static Controladora cont = new Controladora();

    public static void main(String[] args) {

        int ingreso = 0;
        do{
            menu();
            System.out.println("Ingrese una opción (-1 para salir): ");
            ingreso = Integer.parseInt(escaner.nextLine());

            switch(ingreso){
                case 1:{
                    cont.altaLibro();
                    break;
                }
                case 2:{
                    cont.buscarLibro();
                    break;
                }
                case 3:{
                    cont.modificarLibro();
                    break;
                }
                case 4:{
                    cont.eliminarLibro();
                    break;
                }
                case 5:{
                    cont.listarLibros();
                    break;
                }
                case 6:{
                    cont.promedioAnioPublicacion();
                    break;
                }
                case 7:{
                    cont.buscarLibrosPorGenero();
                    break;
                }
                default:{
                    if(ingreso!=-1)
                        System.out.println("Ingrese una opción válida");
                }

            }

        }
        while(ingreso!=-1);
    }

    public static void menu(){
        System.out.println("MENU");
        System.out.println("1. Agregar libros");
        System.out.println("2. Buscar libros");
        System.out.println("3. Modificar libros");
        System.out.println("4. Eliminar libros");
        System.out.println("5. Listar libros");
        System.out.println("6. Calcular promedio");
        System.out.println("7. Clasificar por género");
    }
}