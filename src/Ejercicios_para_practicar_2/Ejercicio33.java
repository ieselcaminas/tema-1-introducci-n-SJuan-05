package Ejercicios_para_practicar_2;

import java.util.Scanner;

public class Ejercicio33 {
    public static void main(String[] args) {

        int num;
        int digito;
        int sum = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num = sc.nextInt();


        do {

            digito = num % 10;
            sum = sum + digito;
            num = num / 10;

        } while (num >= 10);

        sum = sum + digito;

        System.out.println("La suma de los numeros es: " + sum);

    }

}
