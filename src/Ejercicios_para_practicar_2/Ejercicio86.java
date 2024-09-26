package Ejercicios_para_practicar_2;


import java.util.Scanner;

public class Ejercicio86 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero: ");
        num = sc.nextInt();

        do {

            if (num % 2 == 0) {

                num = num / 2;
                System.out.println("Es par: " + num);

            } else {

                num = (num * 3) + 1;
                System.out.println("Es impar: " + num);

            }



        } while (num != 1);

    }
}
