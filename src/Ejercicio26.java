import java.util.Scanner;

public class Ejercicio26 {
    public static void main(String[] args) {

        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un numero: ");
        num = sc.nextInt();


        for (int i = 1; i >= 10; i++) {

            System.out.println(num + " x " + i + " y " + (num + i));

        }
    }
}
