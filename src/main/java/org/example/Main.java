package org.example;
import java.util.Scanner;


public class Main {
    static int saciedad = 6;
    static int energia = 6;
    static int diversion = 6;
    public static void main(String[] args) {
        int opcion=menuPrincipal();
        while (opcion != 0) {
            if (opcion == 1) {
                mostrarEstado();
            }
            else if (opcion==2){
                comer();
            }
            else if (opcion==3){
                jugar();
            }

            opcion=menuPrincipal();
        }
    }

    private static int menuPrincipal(){
        int opcion;
        Scanner lector = new Scanner (System.in);
        do {
            System.out.println("1. Estado");
            System.out.println("2. Comer");
            System.out.println("3. Jugar");
            System.out.println("4. Dormir");
            System.out.println("----------------");
            System.out.println("0. Salir");
            System.out.println("Selecciona una opción del menú: ");
            opcion=lector.nextInt();

            if (opcion < 0 || opcion > 4) {
                System.out.println ("Introduce una opción válida");
            }
        }

        while (opcion < 0 || opcion > 4);
        return opcion;
        }
        private static void mostrarEstado(){
        System.out.println ("Estado de tu tamagotchi: ");
        System.out.println ("Estado de la saciedad: " + saciedad);
        System.out.println ("Estado de la energia: " + energia);
        System.out.println ("Estado de la diversion: " + diversion);


        if (saciedad > 5 && energia > 5 && diversion > 5) {
            System.out.println("El tamagotchi está contento");
        }

        else {System.out.println("El tamagotchi no está contento");}

        }

        private static void comer(){
        saciedad = saciedad +3;
        diversion = diversion -1;
        int saciedadMaxima = 10;
        if (saciedad > saciedadMaxima) {
            saciedad = saciedadMaxima;
        }
        mostrarEstado();
        }

        private static void jugar(){
        int diversionMaxima= 10;

        if (diversion < 10) {
            diversion = diversion + 3;
            saciedad = saciedad - 1;
            energia = energia - 1;

           if (diversion > diversionMaxima) {
               diversion = diversionMaxima;
            }
        mostrarEstado();
        }

        else {System.out.println ("Ahora no me apetece jugar.");}
        }

    }
