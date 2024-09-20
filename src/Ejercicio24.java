import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {

        float num1 = 0F;
        float sum_notas = 0F;
        float num_notas = 0F;
        float media_notas;
        boolean diez;

        Scanner entrada = new Scanner(System.in);

        do {

                System.out.println("Ingrese la nota: ");
                num1 = entrada.nextInt();

                if (num1 >= 0 && num1 <= 10){

                    num_notas ++;
                    sum_notas = sum_notas + num1;

                    if (num1 == 10){

                        diez = true;

                    }

                }


        } while (num1 != -1);

        if (diez = true){

            System.out.println("Hay un 10");

        }


        media_notas = sum_notas / num_notas;

        System.out.println("La nota media de las notas que has introducido es: " + media_notas);



    }
}
