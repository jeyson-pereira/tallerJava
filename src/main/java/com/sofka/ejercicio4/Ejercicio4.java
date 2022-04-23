package com.sofka.ejercicio4;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio4 {
    private Double precio;
    private final Double iva;
    private final Scanner scanner;
    private static final Logger logger = Logger.getLogger("com.sofka.ejercicio4");

    public Ejercicio4() {
        this.iva = 0.21;
        this.scanner = new Scanner(System.in);
    }

    public void setPrecio() {
        try {
            logger.info("Ingresa el precio del producto");
            this.precio = scanner.nextDouble();
        } catch (InputMismatchException e) {
            e.getCause();
            logger.warning("Debes ingresar un numero");
        }
    }

    public void precioFinal(Double precio) {
        double result = precio * iva;
        logger.warning("El precio final del producto es: " + result);
    }

    public static void main(String[] args) {
        Ejercicio4 ejercicio4 = new Ejercicio4();
        ejercicio4.setPrecio();
        ejercicio4.precioFinal(ejercicio4.precio);
    }
}
