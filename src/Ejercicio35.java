import java.util.Scanner;

public class Ejercicio35 {
    public static void main(String[] args) {

        int num1;
        int num2;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        num1 = sc.nextInt();

        System.out.println("Ingrese por cuanto lo quieres dividir");
        num2 = sc.nextInt();

        do {

            num1 = num1 - num2;

        } while (num1 >= num2);

        System.out.println("La resta de los numeros es: " + num1);

    }
}
