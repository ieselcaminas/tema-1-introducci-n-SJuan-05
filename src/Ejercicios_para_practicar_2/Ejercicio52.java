package Ejercicios_para_practicar_2;

import java.util.Scanner;

public class Ejercicio52 {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;
        int resultado;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero");
        num2 = sc.nextInt();

        resultado = num1 + num2;

        System.out.println("Introduzca el resultado");
        num3 = sc.nextInt();

        if (resultado == num3) {

            System.out.println("El resultado es: verdad");

        } else {

            System.out.println("El resultado es: falso");

        }

    }
}
