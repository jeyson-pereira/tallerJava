package com.sofka.ejercicio3;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio3 {
    private final Double pi;
    private Double radio;
    private final Scanner scanner;
    private static final Logger logger = Logger.getLogger("com.sofka.ejercicio3");

    public Ejercicio3() {
        this.scanner = new Scanner(System.in);
        this.pi = Math.PI;
    }

    public void setRadio() {
        logger.info("Digita el radio del circulo");
        this.radio = scanner.nextDouble();
    }

    public void calcularRadio(Double radio) {
        double result = pi * (Math.pow(radio, 2));
        logger.info("El resultado es: " + result);
    }

    public static void main(String[] args) {
        Ejercicio3 ejercicio3 = new Ejercicio3();
        ejercicio3.setRadio();
        ejercicio3.calcularRadio(ejercicio3.radio);
    }
}
