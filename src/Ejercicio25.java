import java.util.Scanner;

public class Ejercicio25 {
    public static void main(String[] args) {

        int num;
        int factorial;

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el número al que aplicarle el factorial");
        num = sc.nextInt();

        //for (num1 = 0; num1 == n
        for (int i = -num; i < num; i--) {
            factorial = num * i;
            System.out.println(factorial);
        }


    }
}
