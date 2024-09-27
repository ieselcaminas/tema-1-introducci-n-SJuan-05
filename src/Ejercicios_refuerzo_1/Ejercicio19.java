package Ejercicios_refuerzo_1;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        int distancia;
        int velocidad_maxima;
        int num_segundos;

        int distancia_km;
        int num_horas;
        int velocidad_media;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la distancia (metros): ");
        distancia = entrada.nextInt();

        System.out.println("Ingrese el número de segundos (segundos): ");
        num_segundos = entrada.nextInt();
        //con estos dos primeros datos sacaremos los km/h Ej: 50km


        System.out.println("Ingrese la velocidad maxima (km/h) a la que puede ir: ");
        velocidad_maxima = entrada.nextInt();
        //con este dato sacaremos la velocidad maxima, si fueran 40 km/h con el ejemplo de antes nos pondrían una multa


        distancia_km = distancia / 1000;
        num_horas = num_segundos / 3600;
        velocidad_media = distancia_km / num_horas;


        if (velocidad_media < velocidad_maxima) {

            System.out.println("Bien");

        } else if (velocidad_media > velocidad_maxima){

            System.out.println("multa");

        } else if (velocidad_media > velocidad_maxima * 0.20){

            System.out.println("puntos");

        }


















    }
}
