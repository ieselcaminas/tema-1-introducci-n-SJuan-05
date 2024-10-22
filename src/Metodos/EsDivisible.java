package Metodos;

public class EsDivisible {
    public static boolean esDivisible(int num, int num2) {

        if (num % num2 == 0){

            return true;

        } else {

            return false;

        }

    }

    public static void main(String[] args) {

        int num = Utilidades.leerEntero("Introduzca un número");
        int num2 = Utilidades.leerEntero("Introduzca otro número y le diremos si es divisible por el primer número que has introducido");

        if (esDivisible(num, num2)) {

            System.out.println("Es divisible");

        } else {

            System.out.println("No es divisible");

        }

    }
}
