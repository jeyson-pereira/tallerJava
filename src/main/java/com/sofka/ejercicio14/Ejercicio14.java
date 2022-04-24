package com.sofka.ejercicio14;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio14 {
    private final Scanner scanner;
    private Integer numeroInicio;
    private static final Logger logger = Logger.getLogger("com.sofka.ejercicio14");

    public Ejercicio14() {
        this.scanner = new Scanner(System.in);
    }

    public void setNumeroInicio() {
        try {
            logger.info("Ingresa un numero menor a mil");
            this.numeroInicio = scanner.nextInt();
        } catch (InputMismatchException e) {
            e.getCause();
            logger.warning("Debes ingresar un numero");
        }
    }

    public void imprimirNumeros(Integer num) {
        int maxNumero = 1000;
        for (int i = num; i <= maxNumero; i++) {
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        Ejercicio14 ejercicio14 = new Ejercicio14();
        ejercicio14.setNumeroInicio();
        ejercicio14.imprimirNumeros(ejercicio14.numeroInicio);
    }
}
