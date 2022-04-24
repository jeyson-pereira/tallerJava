package com.sofka.ejercicio15;

import java.util.Scanner;

public class Ejercicio15 {
    private final Scanner scanner;

    public Ejercicio15() {
        this.scanner = new Scanner(System.in);
    }

    public void menuSwitch() {
        boolean isLooping = true;
        do {
            mostrarMenu();
            System.out.println("Ingresa una opcion:");
            String opcionUsuario = scanner.next();
            switch (opcionUsuario) {
                case "1":
                case "2":
                case "3":
                case "4":
                case "5":
                case "6":
                case "7":
                    break;
                case "8":
                    isLooping = false;
                    break;
                default:
                    System.out.println("No es una opción valida dentro del menu");
            }
        } while (isLooping);
    }

    public void mostrarMenu() {
        System.out.println(
            "***** GESTIÓN CINEMATOGRAFICA*****" +
            "\n1 - NUEVO ACTOR" +
            "\n2 - BUSCAR ACTOR" +
            "\n3 - ELIMINAR ACTOR" +
            "\n4 - MODIFICAR ACTOR" +
            "\n5 - VER TODOS LOS ACTORES" +
            "\n6 - VER PELICULAS DE LOS ACTORES" +
            "\n7 - VER CATEGORIA DE LAS PELICULAS DE LOS ACTORES" +
            "\n8 - SALIR"
        );
    }

    public static void main(String[] args) {
        Ejercicio15 ejercicio15 = new Ejercicio15();
        ejercicio15.menuSwitch();
    }
}
