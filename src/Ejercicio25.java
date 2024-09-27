import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        int num;
        long factorial = 1;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número al que aplicarle el factorial");
        num = sc.nextInt();

        //for (num1 = 0; num1 == n
        for (int i = 1; i <= num; i++) {
            factorial = factorial * i;
            ;
        }

        System.out.println("El factorial de " + num + " es " + factorial);
    }
}
