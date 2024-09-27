package Ejercicios_refuerzo_2;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {

        int dia;
        int dia_mes = 0;
        int mes;
        int dias_acumulados = 0;

        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese un dia (1-31)");
        dia = entrada.nextInt();
        System.out.println("Ingrese un mes (1-12)");
        mes = entrada.nextInt();

        for (int i = mes + 1; i <= 12; i++){

            switch (mes) {

                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    dia_mes = 31;
                    break;
                case 2:
                    dia_mes = 28;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    dia_mes = 30;
                    break;
            }


            dias_acumulados = dias_acumulados + dia_mes;

        }

        switch (mes) {

            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dia_mes = 31;
                break;
            case 2:
                dia_mes = 28;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dia_mes = 30;
                break;
        }

        dias_acumulados = dias_acumulados + (dia_mes - dia);
        System.out.println("Los dias que faltan para nochevieja son " + dias_acumulados);







    }
}
