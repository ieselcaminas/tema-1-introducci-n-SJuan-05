import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {

        int num;
        int positivo = 0;

        Scanner sc = new Scanner(System.in);
        ;

        do {

            System.out.println("Ingrese un numero");
            num = sc.nextInt();

            if (num > 0) {

                positivo ++;

            }


        }  while(num != 0 );

        System.out.println("Positivos : " + positivo);

    }
}
