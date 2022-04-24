package com.sofka.ejercicio9;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio9 {
    public static void concaternarFrases(String frase) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Ejercicio 9");

        try {
            logger.info("Introduce una frase: ");
            String fraseUsuario = scanner.nextLine();
            logger.info(() -> frase.concat(fraseUsuario));
        } catch (InputMismatchException exception) {
            exception.getCause();
            logger.warning("Debes ingresar un texto con una frase");
            scanner.nextLine();
        }
    }

    public static void main(String[] args) {
        String frase = "La sonrisa sera la mejor arma contra la tristeza, ";
        String fraseEditada = frase.replace("a", "e");
        concaternarFrases(fraseEditada);
    }
}
