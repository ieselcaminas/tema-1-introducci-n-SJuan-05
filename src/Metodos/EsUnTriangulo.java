package Metodos;

public class EsUnTriangulo {

    /*
    public static boolean esTriangulo(int palo1, int palo2, int palo3) {

        boolean triangulo;

        if (palo3 > palo1 + palo2){

            triangulo = false;

        } else if (palo2 > palo1 + palo3){

            triangulo = false;

        } else if (palo1 > palo2 + palo3){

            triangulo = false;

        }else {

            triangulo = true;

        }

        return triangulo;
    }
*/

    /*
    public static boolean esTriangulo2(int palo1, int palo2, int palo3) {

        if (palo3 > palo1 + palo2){

            return false;

        } else if (palo2 > palo1 + palo3){

            return false;

        } else if (palo1 > palo2 + palo3){

            return false;

        }else {

            return true;

        }

    }
*/

    public static boolean esTriangulo3(int palo1, int palo2, int palo3) {

        if ((palo3 > palo1 + palo2) || (palo2 > palo1 + palo3) || (palo1 > palo2 + palo3)) {

            return false;

        } else {

            return true;

        }
    }


    public static void main(String[] args) {

        int palo1 = Utilidades.leerEntero("Longitud del primer palito: ");
        int palo2 = Utilidades.leerEntero("Longitud del segundo palito: ");
        int palo3 = Utilidades.leerEntero("Longitud del tercer palito: ");

        if (esTriangulo3(palo1, palo2, palo3)){

            System.out.println("Si puedo");

        } else {

            System.out.println("No puedo");

        }


    }

}
