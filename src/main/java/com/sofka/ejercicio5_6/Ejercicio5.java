package com.sofka.ejercicio5_6;

public class Ejercicio5 {

    public static void recorrerWhile() {
        int index = 1;
        while (index <= 100) {
            System.out.println(comprobarNumero(index));
            index++;
        }
    }

    public static void recorrerFor() {
        for (int index = 1; index <= 100 ; index++) {
            System.out.println(comprobarNumero(index));
        }
    }

    public static String comprobarNumero(int index) {
        return (index % 2 == 0) ? index + ": Par " : index + ": Impar ";
    }

    public static void main(String[] args) {
        System.out.println("**RECORRIDO WHILE**");
        recorrerWhile();
        System.out.println("\n**RECORRIDO FOR**");
        recorrerFor();
    }
}
