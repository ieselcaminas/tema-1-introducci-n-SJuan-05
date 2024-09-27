package Ejercicios_refuerzo_1;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        double distancia;
        double velocidad_maxima;
        double num_segundos;

        double distancia_km;
        double num_horas;
        double velocidad_media;

        double puntos;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la distancia (metros): ");
        distancia = entrada.nextDouble();

        System.out.println("Ingrese el número de segundos (segundos): ");
        num_segundos = entrada.nextDouble();
        //con estos dos primeros datos sacaremos los km/h Ej: 50km


        System.out.println("Ingrese la velocidad maxima (km/h) a la que puede ir: ");
        velocidad_maxima = entrada.nextDouble();
        //con este dato sacaremos la velocidad maxima, si fueran 40 km/h con el ejemplo de antes nos pondrían una multa


        distancia_km = distancia / 1000;
        num_horas = num_segundos / 3600;
        velocidad_media = distancia_km / num_horas;

        puntos = velocidad_maxima * 0.20;

        if (velocidad_media < velocidad_maxima) {

            System.out.println("Bien");

        } else if (velocidad_media > velocidad_maxima && velocidad_media < puntos) {

            System.out.println("multa");

        } else if (velocidad_media > puntos) {

            System.out.println("puntos");

        }


    }
}
