package org.example;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuPrincipal();
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
    }
