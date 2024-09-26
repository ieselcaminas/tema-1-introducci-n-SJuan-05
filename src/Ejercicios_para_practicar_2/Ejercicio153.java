package Ejercicios_para_practicar_2;

import java.util.Scanner;

public class Ejercicio153 {
    public static void main(String[] args) {

        double num1;
        double num2;

        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        num1 = sc.nextDouble();
        System.out.print("Ingrese el segundo numero: ");
        num2 = sc.nextDouble();

        if (num1 > 0 && num1 < 1 && num2 > 0 && num2 < 1) {

            System.out.println("Los números introducidos están entre 0 y 1");

        } else {

            System.out.println("Los números introducidos no estan entre 0 y 1");

        }


    }
}
