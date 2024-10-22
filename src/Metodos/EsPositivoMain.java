package Metodos;

public class EsPositivoMain {
    public static boolean esPositivo(int a){

        if (a >= 0){

            return true;

        } else {

            return false;

        }
    }

    public static void main(String[] args) {

        int numero = Utilidades.leerEntero("Introduce un número entero: ");

        if (esPositivo(numero)){

            System.out.println("El número es positivo");

        } else {

            System.out.println("El número es negativo");

        }



    }
}
