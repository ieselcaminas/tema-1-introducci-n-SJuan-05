package Ejercicios_para_practicar_2;

public class Ejercicio50 {
    public static void main(String[] args) {

        String div3 = "";
        String div5 = "";
        String div3_5 = "";

        for (int i = 1; i < 100; i++){

            if (i % 5 == 0){

                div5 = div5 + i + ", ";

            }

            if (i % 3 == 0){

                div3 = div3 + i + ", ";

            }

            if (i % 3 == 0 && i % 5 == 0){

                div3_5 = div3_5 + i + ", ";

            }

        }

        System.out.println("Divisores de 3: " + div3);

        System.out.println("Divisores de 5: " + div5);

        System.out.println("Divisores de 3 y 5: " + div3_5);

    }
}
