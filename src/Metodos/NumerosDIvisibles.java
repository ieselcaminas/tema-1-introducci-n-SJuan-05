package Metodos;

public class NumerosDIvisibles {

    public static String Divsibles (int num){

        String resultado = "";

        for (int i = 1; i <= num; i++){

            if (num % i == 0){

                resultado = resultado + i + " ";

            }

        }

        return resultado;
    }

    public static void main(String[] args) {

        int num;

        num = Utilidades.leerEntero("Introduce un número y le indicaré sus divisores: ");

        System.out.println(Divsibles(num));


    }

}
