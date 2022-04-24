package com.sofka.ejercicio13;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;


public class Ejercicio13 {
    public static void main(String[] args) {
        Logger logger = Logger.getLogger("Ejercicio 13");

        Date now = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String date = dateFormat.format(now);
        logger.info(date);
    }
}
