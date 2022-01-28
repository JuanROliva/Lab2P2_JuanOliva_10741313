package lab2p2_juanoliva_10741313;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_JuanOliva_10741313 {
    
    static ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
    
    public static void main(String[] args) {
        encabezado();
        boolean ciclo = true;
        while (ciclo) {
            String opc = menu();
            
            
            
        }
        
    }
    
    
    static void encabezado(){
        System.out.println("-----------------------------------------------------");
        System.out.println(" Universidad Tecnologica Centroamericana UNITEC");
        System.out.println(" Asignatura: Laboratorio Programacion II");
        System.out.println(" Alumno: Juan Rafael Oliva");
        System.out.println(" Cuenta: 10741313");
    }
    
    static String menu(){
        System.out.println("-----------------------------------------------------");
        System.out.println("""
                           1. Agregar un Animal
                           2. Modificar Animal
                           3. Eliminar Animal
                           4. Imprimir Animal en posicion especifica
                           5. Imprimir todos los animales
                           6. Imprimir por Nombre Cientifico
                           7. 
                           """);
        System.out.println("-----------------------------------------------------");
        System.out.println("Ingrese la opcion que desea ejecutar");
        Scanner lea = new Scanner(System.in);
        return lea.next();
    }
    
    
    static boolean eliminarAnimal(String nombreCientifico){
        nombreCientifico.toLowerCase();
        int pos = retornoPosicionAnimal(nombreCientifico);
        if (pos!=-1) {
            listaAnimales.remove(pos);
            return true;
        }else{
            return false;
        }
    }
    
    
    static boolean hayAnimales(){
        return listaAnimales.size()!=-1;
    }
    
    
    static int retornoPosicionAnimal(String nombreCientifico){
        nombreCientifico.toLowerCase();
        for (Animal a : listaAnimales) {
            if (a.getNombreCientifico().toLowerCase().equals(nombreCientifico)) {
                return listaAnimales.indexOf(a);
            }
        }
        return -1;
    }
    
}
