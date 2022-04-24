package com.sofka.ejercicio11;

import java.util.Scanner;
import java.util.logging.Logger;

public class Ejercicio11 {
    private final Scanner scanner;
    public static final Logger logger = Logger.getLogger("com.sofka.ejercicio11");
    private String textoUsuario;

    public Ejercicio11() {
        this.scanner = new Scanner(System.in);
    }

    public void setTextoUsuario() {
        logger.info("Escribe un texto o frase para contar su tamaño y vocales");
        this.textoUsuario = scanner.nextLine();
    }

    public boolean esVocal(char ch) {
        ch = Character.toUpperCase(ch);
        return (ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U');
    }

    public void contarVocales(String texto) {
        int numVocales = 0;
        for (int index = 0; index < texto.length(); index++)
            if (esVocal(texto.charAt(index))) ++numVocales;

        logger.info("La longitud del texto es: " + texto.length());
        logger.info("Tiene un total de " + numVocales + " vocales");
    }


    public static void main(String[] args) {
        Ejercicio11 ejercicio11 = new Ejercicio11();
        ejercicio11.setTextoUsuario();
        ejercicio11.contarVocales(ejercicio11.textoUsuario);
    }

}
