package com.sofka.ejercicio10;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Ejercicio 10");

        try {
            logger.info("Ingresa un texto o frase con espacios");
            String textoUsuario = scanner.nextLine().replace(" ", "");
            logger.info(textoUsuario);

        } catch (InputMismatchException exception) {
            logger.warning("Debes ingresar un texto o una frase");
        }
    }
}
