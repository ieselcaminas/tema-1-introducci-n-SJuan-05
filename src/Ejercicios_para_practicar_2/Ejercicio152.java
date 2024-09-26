package Ejercicios_para_practicar_2;

import java.util.Scanner;

public class Ejercicio152 {
    public static void main(String[] args) {

        int num1;
        int num2;
        int num3;
        int num4;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        num1 = sc.nextInt();
        System.out.println("Ingrese el segundo numero: ");
        num2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero: ");
        num3 = sc.nextInt();
        System.out.println("Ingrese el cuarto numero: ");
        num4 = sc.nextInt();

        if (num1 == num2 && num2 == num3 && num3 == num4) {

            System.out.println("Los cuatro números son iguales");

        } else {

            System.out.println("No son iguales los cuatro números");

        }


    }
}
