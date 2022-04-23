package com.sofka.ejercicio1_2;

import java.util.Scanner;

public class Ejercicio1 {
    private Integer num1;
    private Integer num2;
    private final Scanner scanner;

    public Ejercicio1() {
        this.scanner = new Scanner(System.in);
    }

    public void setNum1() {
        System.out.println("Ingresa valor del primer numero: ");
        this.num1 = scanner.nextInt();
    }

    public void setNum2() {
        System.out.println("Ingresa valor del segundo numero: ");
        this.num2 = scanner.nextInt();
    }

    public void comparaNumeros(Integer num1, Integer num2) {
        if (num1.equals(num2)) {
            System.out.println("Los números son iguales");
            return;
        }
        String result = (num1 > num2) ? "Es mayor: " + num1 : "Es mayor: " + num2;
        System.out.println(result);
    }

    public static void main(String[] args) {
        Ejercicio1 ejercicio = new Ejercicio1();
        System.out.println("Número mayor entre 15 y 30");
        ejercicio.comparaNumeros(15,30);
        ejercicio.setNum1();
        ejercicio.setNum2();
        ejercicio.comparaNumeros(ejercicio.num1, ejercicio.num2);
    }
}
