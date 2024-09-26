import java.util.Scanner;

public class Ejercicio27 {
    public static void main(String[] args) {

        int j = 0;
        int num;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        num = sc.nextInt();

        for (int i = 1; j <= i; j++) {

            System.out.println(j + " ");

        }

        /*
        (Otra forma de hacerlo)
        int num:
        String res = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el primer numero: ");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++){

            res += i + " ";

            System.out.println(res);

        }*/

    }

}

