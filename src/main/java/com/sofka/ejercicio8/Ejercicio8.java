package com.sofka.ejercicio8;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio8 {

    private final Logger logger = Logger.getLogger("com.sofka.ejercicio8");
    private final Scanner scanner;

    private String opcionDia;

    public Ejercicio8() {
        this.scanner = new Scanner(System.in);
    }

    public void setOpcionDia() {
        logger.info("Escribe un dia de la semana");
        this.opcionDia = scanner.next().toLowerCase();
    }

    public void diaLaboral(String opcion) {
        switch (opcion) {
            case "lunes":
            case "jueves":
            case "martes":
            case "miercoles":
            case "viernes":
                logger.info("Dia laboral");
                break;
            case "sabado":
            case "domingo":
                logger.info("A descansar");
                break;
            default:
                logger.info(opcionDia + " no es un dia de la semana");
        }
    }

    public static void main(String[] args) {
        Ejercicio8 ejercicio8 = new Ejercicio8();
        ejercicio8.setOpcionDia();
        ejercicio8.diaLaboral(ejercicio8.opcionDia);
    }
}
