package lab2p2_juanoliva_10741313;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab2P2_JuanOliva_10741313 {
    
    static ArrayList<Animal> listaAnimales = new ArrayList<Animal>();
    static Scanner lea = new Scanner(System.in);
    
    
    public static void main(String[] args) {
        encabezado();
        boolean ciclo = true;
        while (ciclo) {
            String opc = menu();
            switch (opc) {
                case "1":
                    agregarAnimal();
                    break;
                default:
                    throw new AssertionError();
            }
            
            
            
            
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
                           7. Alimentar Animal
                           """);
        System.out.println("-----------------------------------------------------");
        System.out.print("Ingrese la opcion que desea ejecutar: ");
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
    
    //Identifica si la lista contiene uno o mas animales
    static boolean hayAnimales(){
        return listaAnimales.size()!=-1;
    }
    
    //retorna la posicion del animal si concide con el nombre cientifico
    static int retornoPosicionAnimal(String nombreCientifico){
        nombreCientifico.toLowerCase();
        for (Animal a : listaAnimales) {
            if (a.getNombreCientifico().toLowerCase().equals(nombreCientifico)) {
                return listaAnimales.indexOf(a);
            }
        }
        return -1;
    }
    
    
    //Metodo para agregar un animal
    static  void agregarAnimal(){
        System.out.println("Ingrese los siguientes datos del Animal");
        Animal a = animal();
        listaAnimales.add(new Animal(a.getNombreCientifico(), a.getNombreComun(),
                a.getHabitat(),a.getAlimentacion(), a.getDescripcionRasgos(), 
                a.getDistribucionGeografica(), a.getVida()));
        System.out.println("Animal agregado exitosamente");
    }
    
    
    //Metodo para validad si la cadena corresponde a numero
    static  boolean validacionStringNumeros(String c){
        boolean condicion = true;
        for (int i = 0; i < c.length(); i++) {
            if (! Character.isDigit(c.charAt(i))) {
                condicion = false;
                break;
            }
        }
        return condicion;
    }
    
    static String solicitudNombreCientifico(){
        System.out.print("Ingrese el nombre cientifico: ");
        return lea.next();
    }
    
    
    static  String subMenuModificarAnimal(){
        System.out.println("-----------------------------------------------------");
        System.out.println("""
                           1. Modificar un atributo
                           2. Modificar todos los elementos
                           """);
        System.out.println("-----------------------------------------------------");
        System.out.print("Ingrese la opcion que desea ejecutar: ");
        return lea.next();
    }
    
    static void modificarAnimal(int pos){
        String opc = subMenuModificarAnimal();
        Animal a = listaAnimales.get(pos);
        System.out.println("a");
        switch (opc) {
            case "1":
                modificacionAtributos(a);
                break;
                
            case "2":
                System.out.println("Modificando todos los atributos");
                System.out.println("-----------------------------------------------------");
                Animal m = animal();
                a.setNombreCientifico(m.getNombreCientifico());
                a.setNombreComun(m.getNombreComun());
                a.setHabitat(m.getHabitat());
                a.setAlimentacion(m.getAlimentacion());
                a.setDescripcionRasgos(m.getDescripcionRasgos());
                a.setDistribucionGeografica(m.getDistribucionGeografica());
                a.setVida(m.getVida());
                System.out.println("Actulizados todos los atributos del Animal");
                break;
            default:
                System.out.print("Opcion invalida, regresando al Menu principal");
        }
    }
    
    static Animal animal(){
        System.out.print("Ingrese el Nombre Cientifico: ");
        String nombreCientifico = lea.next();
        System.out.print("Ingrese el Nombre Comun: ");
        String nombreComun = lea.next();
        System.out.print("Ingrese el Habitat: ");
        String habitat = lea.next();
        System.out.print("Ingrese la Alimentacion: ");
        String alimentacion = lea.next();
        System.out.print("Ingrese Rasgos Caracteristicos: ");
        String descripcionRasgos = lea.next();
        System.out.print("Ingrese Distribucion Geografica: ");
        String distribucionGeografica = lea.next();
        System.out.print("Ingrese la cantidad de vida (Valor > 0) : ");
        String vidaString = lea.next();
        while (!validacionStringNumeros(vidaString)) {
            System.out.println("Ingrese en valor numerico > 0");
            vidaString = lea.next();
        }
        int vida = Integer.parseInt(vidaString);
        Animal a = new Animal(nombreCientifico, nombreComun, habitat, alimentacion, descripcionRasgos, distribucionGeografica, vida);
        return a;
    }
    
    static void modificacionAtributos(Animal a){
        System.out.print("""
                                 Que desea modificar
                                 -----------------------------------------------------
                                 1. Nombre Cientifico
                                 2. Nombre Comun
                                 3. Habitat
                                 4. Alimentacion
                                 5. Rasgos Caracterisiticos
                                 6. Distribucion Geografica
                                 7. Vida
                                 -----------------------------------------------------
                                """);
                System.out.print("Ingrese la opcion que desea ejecutar: ");
                String opc1 = lea.next();
                switch (opc1) {
                    case "1" -> {
                        System.out.print("Ingrese el nuevo nombre cientifico: ");
                        a.setNombreCientifico(lea.next());
                        System.out.println("Nombre Cientifico Cambiado exitosamente");
                    }
                    case "2" -> {
                        System.out.print("Ingrese el nuevo nombre comun: ");
                        a.setNombreComun(lea.next());
                        System.out.println("Nombre Comun Cambiado exitosamente");
                    }
                    case "3" -> {
                        System.out.print("Ingrese el nuevo habitat: ");
                        a.setHabitat(lea.next());
                        System.out.println("Habitat Cambiado exitosamente");
                    }
                    case "4" -> {
                        System.out.print("Ingrese la nueva alimentacion: ");
                        a.setAlimentacion(lea.next());
                        System.out.println("Alimentacion Cambiada exitosamente");
                    }
                    case "5" -> {
                        System.out.print("Ingrese los nuevos rasgos: ");
                        a.setDescripcionRasgos(lea.next());
                        System.out.println("Rasgos cambiados exitosamente");
                    }
                    case "6" -> {
                        System.out.print("Ingrese la nueva Distribucion Geografica: ");
                        a.setDistribucionGeografica(lea.next());
                        System.out.println("Distribucion cambiada exitosamente");
                    }
                    case "7" -> {
                        System.out.print("Ingrese la nueva vida: ");
                        String vidaString = lea.next();
                        while (!validacionStringNumeros(vidaString)) {
                            System.out.println("Ingrese en valor numerico > 0");
                            vidaString = lea.next();
                        }
                        a.setVida(Integer.parseInt(vidaString));
                        System.out.println("Vida cambiada exitosamente");
                    }
                    default -> System.out.print("Opcion incorrecta, Regresando a Menu Principal ");
                }
    }
    
    
}
