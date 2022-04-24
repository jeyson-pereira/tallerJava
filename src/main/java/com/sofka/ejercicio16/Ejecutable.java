package com.sofka.ejercicio16;

import java.util.Scanner;

public class Ejecutable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Introducimos los datos
        System.out.println("Introduce el nombre");
        String nombre = scanner.next();

        System.out.println("Introduce la edad");
        int edad = scanner.nextInt();

        System.out.println("Introduce el sexo (H o M)");
        char sexo = scanner.next().charAt(0);

        System.out.println("Introduce el peso");
        double peso = scanner.nextDouble();

        System.out.println("Introduce la altura");
        double altura = scanner.nextDouble();

        //Creamos objetos con cada constructor
        Persona persona1 = new Persona(nombre, edad, sexo, peso, altura);
        Persona persona2 = new Persona(nombre, edad, sexo);
        Persona persona3 = new Persona();

        //Insertar datos incompletos de persona2 con metodos set
        persona2.setPeso(74.6);
        persona2.setAltura(1.66);

        //Insertar datos incompletos de persona3 con metodos set
        persona3.setNombre("Juan");
        persona3.setEdad(25);
        persona3.setSexo('H');
        persona3.setPeso(58.3);
        persona3.setAltura(1.72);

        //Llamado de metodos
        System.out.println("Persona1");
        System.out.println(persona1.toString());
        imprimirPesoIdealIMC(persona1);
        ImprimirMayorDeEdad(persona1);
        System.out.println("-------------------");
        System.out.println("Persona2");
        System.out.println(persona2.toString());
        imprimirPesoIdealIMC(persona2);
        ImprimirMayorDeEdad(persona2);
        System.out.println("-------------------");
        System.out.println("Persona3");
        System.out.println(persona3.toString());
        imprimirPesoIdealIMC(persona3);
        ImprimirMayorDeEdad(persona3);
    }

    public static void imprimirPesoIdealIMC(Persona p) {
        int imc = p.calcularIMC();
        switch (imc) {
            case Persona.PESO_IDEAL:
                System.out.println("La persona esta en su peso ideal");
                break;
            case Persona.DELGADEZ:
                System.out.println("La persona esta por debajo de su peso ideal");
                break;
            case Persona.SOBREPESO:
                System.out.println("La persona esta por encima de su peso ideal");
                break;
        }
    }

    public static void ImprimirMayorDeEdad(Persona p) {
        String result = (p.esMayorDeEdad())
                ? "La persona es mayor de edad"
                :"La persona no es mayor de edad";

        System.out.println(result);
    }
}
