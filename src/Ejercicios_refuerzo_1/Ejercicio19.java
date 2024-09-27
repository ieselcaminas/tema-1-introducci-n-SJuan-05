package Ejercicios_refuerzo_1;

import java.util.Scanner;

public class Ejercicio19 {
    public static void main(String[] args) {

        int distancia;
        int velocidad_maxima;
        int num_segundos;

        int distancia_km;
        int velocidad_km;
        int num_horas

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese el distancia (metros): ");
        distancia = entrada.nextInt();

        System.out.println("Ingrese el velocidad maxima (km/h): ");
        velocidad_maxima = entrada.nextInt();

        System.out.println("Ingrese el número de segundos (segundos): ");
        num_segundos = entrada.nextInt();

        num_horas = num_segundos / 3600;
        velocidad_km = velocidad_maxima / num_horas;









    }
}
