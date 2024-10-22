package Metodos;

public class MasGrande {
    public static int masGrande(int a, int b) {

        if (a>b) {
            return a;
        }else{
            return b;
        }
    }
    public static void main(String[] args) {

        int numero = Utilidades.leerEntero("Introduce un número entero: ");
        int numero2 = Utilidades.leerEntero("Introduce un número entero: ");

        int elMasGramde = masGrande(numero, numero2);
        System.out.println("El numero más grande es: " + elMasGramde);


    }

}
