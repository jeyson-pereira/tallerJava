package com.sofka.ejercicio7;

/*
Lee un número por teclado y comprueba que este numero es mayor o igual
que cero, si no lo es lo volverá a pedir (do while), después muestra ese número por consola.
 */

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio7{
    private final Scanner scanner;
    private final Logger logger = Logger.getLogger("com.sofka.ejercicio7");
    private float number;

    public Ejercicio7() {
        this.scanner = new Scanner(System.in);
    }

    public void setNumber() {
        logger.info("Ingresa un numero");
        this.number = scanner.nextFloat();
    }

    public void numMayorIgualCero() {
        do {
            setNumber();
        } while (this.number < 0);
        logger.info("El numero elegido fue: " + this.number);
    }

    public static void main(String[] args) {
        Ejercicio7 ejercicio7 = new Ejercicio7();
        ejercicio7.numMayorIgualCero();
    }
}
