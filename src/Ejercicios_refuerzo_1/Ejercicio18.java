package Ejercicios_refuerzo_1;

import java.util.Scanner;

public class Ejercicio18 {
    public static void main(String[] args) {

        int num;
        int num_par = 0;
        int num_impar = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();

        if (num % 2 == 0) {

            for (int i = 2; i <= 10; i = i + 2) {

                num_par = num + i;

                System.out.println(num_par);

            }

        }

        if (num % 2 != 0) {

            num_impar = num + 1;

            System.out.println(num_impar);

            for (int i = 1; i <= 4; i++) {

                int sumar2 = 2;
                num_impar = num_impar + sumar2;

                System.out.println(num_impar);

            }

        }



    }

}

