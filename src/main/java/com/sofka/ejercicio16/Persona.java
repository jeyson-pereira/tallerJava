package com.sofka.ejercicio16;

class Persona {
    private String nombre;
    private int edad;
    private String dni;
    private char sexo;
    private double peso;
    private double altura;
    private final static char SEXO_DEFAULT = 'H';

    public static final int PESO_IDEAL = 0;
    public static final int DELGADEZ = -1;
    public static final int SOBREPESO = 1;

    //Contructores
    //Constructor por defecto
    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.sexo = SEXO_DEFAULT;
        this.peso = 0;
        this.altura = 0;
    }

    //Constructor con nombre, edad y sexo, el resto por defecto.
    public Persona(String nombre, int edad, char sexo) {
        this(nombre, edad, sexo, 0, 0);
    }

    //Constructor con todos los atributos como parámetro.
    public Persona(String nombre, int edad, char sexo, double peso, double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.altura = altura;
        generarDni();
        this.sexo = sexo;
        comprobarSexo();
    }

    //Metodos privados de clase
    //Comprobación de sexo ingresado
    private void comprobarSexo() {
        //Si el sexo no es una H o una M, por defecto es H
        if (sexo != 'H' && sexo != 'M') {
            this.sexo = SEXO_DEFAULT;
        }
    }

    //Generar DNI
    private void generarDni() {
        final int divisor = 23;

        //Generar número random de 8 digitos
        int numDni = ((int) Math.floor(Math.random() * (100000000 - 10000000) + 10000000));
        int result = numDni - (numDni / divisor * divisor);

        //Calculamos la letra del dni
        char letraDni = generaLetraDni(result);

        //Parsear el dni a String
        dni = Integer.toString(numDni) + letraDni;
    }

    private char generaLetraDni(int res) {
        char[] letras = {
                'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'
        };
        return letras[res];
    }

    //Metodos publicos
    // (Setters)
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    //Devuelve informacion del objeto en una cadena de texto
    @Override
    public String toString() {
        String sexoNombre;
        if (this.sexo == 'H') {
            sexoNombre = "Hombre";
        } else {
            sexoNombre = "Mujer";
        }
        return "Informacion de la persona:\n"
                + "Nombre: " + nombre + "\n"
                + "Sexo: " + sexoNombre + "\n"
                + "Edad: " + edad + " años\n"
                + "DNI: " + dni + "\n"
                + "Peso: " + peso + " kg\n"
                + "Altura: " + altura + " metros\n";
    }

    //Devuelve un booleano indicando si es mayor de edad
    public boolean esMayorDeEdad() {
        boolean mayor = edad >= 18;
        return mayor;
    }

    //Calcular peso ideal de la persona con su peso y altura
    public int calcularIMC() {
        //Calculamos el peso de la persona
        double pesoActual = peso / (Math.pow(altura, 2));
        //Segun el peso, devuelve un entero (-1,0,1)
        if (pesoActual >= 20 && pesoActual <= 25) {
            return PESO_IDEAL;
        } else if (pesoActual < 20) {
            return DELGADEZ;
        } else {
            return SOBREPESO;
        }
    }

}
