package Metodos;

public class Salario {
    public static double calcularBruto(int horas, double precio){
        double bruto;

        if (horas<=35){

            bruto = horas * precio;

        } else {

            bruto = 35 * precio;
            bruto += (horas - 35) * precio * 1.5;

        }

        return bruto;

    }

    public static double calcularImpuestos(double bruto) {

        double impuestos;

        if (bruto <= 500) {
            impuestos = 0;
        }else if (bruto <= 900){
            //Cobra entre 500 y 900, de los primeros 500 no paga nada
            impuestos = (bruto - 500) * 0.25;
        }else {
            //Si cobra más de 900
            impuestos = (400 * 0.25) + (bruto - 500 - 400) * 0.45;
        }

        return impuestos;
    }


    public static void main(String[] args) {

        int horas;
        double precio;
        double bruto;
        double impuestos;

        horas = Utilidades.leerEntero("Introduce las horas: ");
        precio = Utilidades.leerDoble("Introduce el precio por hora: ");


        bruto = calcularBruto(horas, precio);
        impuestos = calcularImpuestos(bruto);

        System.out.println("Pago bruto: " + bruto);
        System.out.println("Salario neto: " + (bruto - impuestos));
        System.out.println("Impuestos: " + impuestos);

    }
}
