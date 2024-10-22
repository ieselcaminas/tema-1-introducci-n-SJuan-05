package Metodos;

public class DescuentoRealizado {

    public static double Descuento(double num1, double num2) {

        double descuento;

        descuento = (num1 - num2) / num1 * 100;

        return descuento;

    }

    public static void main(String[] args) {

        double num1;
        double num2;

        num1 = Utilidades.leerEntero("Introduzca el precio real: ");
        num2 = Utilidades.leerEntero("Introduzca el precio rebajado: ");


        System.out.println("Descuento: " + Descuento(num1, num2));


    }
}
