import java.util.Scanner;

public class Ejercicio31 {
    public static void main(String[] args) {

        int num;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {

                System.out.println(num + " es divisible por " + i);

            }

        }

    }
}