package org.example;
import java.util.Scanner;


public class Main {
    static int saciedad = 6;
    static int energia = 6;
    static int diversion = 6;
    public static void main(String[] args) {
        int opcion=menuPrincipal();
        while (opcion != 0 && !finDelJuego()) {
            if (opcion == 1) {
                mostrarEstado();
            }
            else if (opcion==2){
                comer();
            }
            else if (opcion==3){
                jugar();
            }
            else if (opcion ==4) {
                dormir();
            }
            else if (opcion ==5) {
                acariciar();
            }

            if (!finDelJuego()) {
                opcion = menuPrincipal();
            }
        }
        if (finDelJuego()) {
            System.out.println ("¡Fin del juego! ¡El tamagotchi ha MUERTO!");
            System.out.println("(x_x) :( Game Over ):");
            System.out.println(" /|_|\\");
            System.out.println(" | |");
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
            System.out.println("5. Acariciar");
            System.out.println("----------------");
            System.out.println("0. Salir");
            System.out.println("Selecciona una opción del menú: ");
            opcion=lector.nextInt();

            if (opcion < 0 || opcion > 5) {
                System.out.println ("Introduce una opción válida");
            }
        }

        while (opcion < 0 || opcion > 5);
        return opcion;
        }
        private static void mostrarEstado(){
        System.out.println ("Estado de tu tamagotchi: ");
        System.out.println ("Estado de la saciedad: " + saciedad);
        System.out.println ("Estado de la energia: " + energia);
        System.out.println ("Estado de la diversion: " + diversion);


        if (saciedad > 5 && energia > 5 && diversion > 5) {
            System.out.println("El tamagotchi está contento");
            System.out.println(" (•‿•) ¡Estoy feliz!");
            System.out.println ("/|_|\\");
            System.out.println (" | |");
        }

        else if (diversion <= 4) {
            System.out.println("El tamagotchi no está contento");
            System.out.println("(-︵-) Estoy aburrido");
            System.out.println("/|_|\\ ¡Juega conmigo!");
            System.out.println(" / \\");
        }
        else if (saciedad <= 4) {
            System.out.println ("El tamagotchi está hambriento");
            System.out.println("(•︵•) ¡Tengo hambre!");
            System.out.println("/|x|\\");
            System.out.println(" | |\n");
        }
        else if (energia <= 4){
            System.out.println ("El tamagotchi está cansado");
            System.out.println("(-_-) Zzz");
            System.out.println("/|_|\\");
            System.out.println(" | |\n");
        }

        }

        private static void comer(){
        saciedad = saciedad +4;
        diversion = diversion -1;
        int saciedadMaxima = 10;
        if (saciedad > saciedadMaxima) {
            saciedad = saciedadMaxima;
        }
        limitarEstadisticas();
        mostrarEstado();
        }

        private static void jugar(){
        int diversionMaxima= 10;

        if (diversion < 10) {
            diversion = diversion + 3;
            saciedad = saciedad - 2;
            energia = energia - 1;

           if (diversion > diversionMaxima) {
               diversion = diversionMaxima;
            }
        limitarEstadisticas();
        mostrarEstado();
        }

        else {System.out.println ("Ahora no me apetece jugar.");}
        }

        private static void dormir() {
            int energiaMaxima = 10;
            if (energia < 10) {
                energia = energia + 4;
                saciedad = saciedad - 2;
                diversion = diversion - 1;

                if (energia > energiaMaxima) {
                    energia = energiaMaxima;
                }
                limitarEstadisticas();
                mostrarEstado();}


            else{
                    System.out.println(" Ahora no tengo sueño ");
                }
            }

        private static void acariciar(){
        int diversionMaxima=10;
        if (diversion < 10) {
            diversion=diversion+2;
                if (diversion > diversionMaxima) {
                    diversion=diversionMaxima;
                }
            limitarEstadisticas();
            mostrarEstado();
        }
        else {System.out.println ("Ahora no necesito más mimos");}

        }

    private static void limitarEstadisticas() {

        if (saciedad > 10) {
            saciedad = 10;
        } else if (saciedad < 0) {
            saciedad = 0;
        }

        if (energia > 10) {
            energia = 10;
        } else if (energia < 0) {
            energia = 0;
        }

        if (diversion > 10) {
            diversion = 10;
        } else if (diversion < 0) {
            diversion = 0;
        }
    }

    private static boolean finDelJuego(){
        boolean finDelJuego = false;
        if (energia==0 || saciedad ==0 || diversion==0) {
            finDelJuego = true;
        }
        return finDelJuego;
    }


    }
