package com.sofka.ejercicio12;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio12 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Logger logger = Logger.getLogger("Ejercicio 12");

        logger.info("Ingresa la primer palabra");
        String palabraA = scanner.nextLine();

        logger.info("Ingresa la segunda palabra");
        String palabraB = scanner.nextLine();

        int resultado = palabraA.compareToIgnoreCase(palabraB);
        if(resultado == 0){
            logger.info("Las palabras son iguales");
        }else if(resultado > 0){
            logger.info("La primer palabra es mayor que la segunda");
        }else{
            // Si resultado < 0
            logger.info("La primer palabra es menor que la segunda");
        }
    }
}
