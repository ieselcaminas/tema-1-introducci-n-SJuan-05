package Metodos;

public class DiasMes {

    public static String Mes(String mes){

        switch (mes){

            case "Enero":
                return ("Tiene 31 dias");
            case "Febrero":
                return("Tiene 28 dias");
            case "Marzo":
                return("Tiene 31 dias");
            case "Abril":
                return("Tiene 30 dias");
            case "Mayo":
                return("Tiene 31 dias");
            case "Junio":
                return("Tiene 30 dias");
            case "Julio":
                return("Tiene 31 dias");
            case "Agosto":
                return("Tiene 31 dias");
            case "Septiembre":
                return("Tiene 30 dias");
            case "Octubre":
                return("Tiene 30 dias");
            case "Noviembre":
                return("Tiene 30 dias");
            case "Diciembre":
                return("Tiene 31 dias");

        }

        return mes;

    }


    public static void main(String[] args) {

        String mes;

        mes = Utilidades.leerCadena("Introduzca un mes y le diré cuantos dias tiene: ");

        System.out.println(Mes(mes));
    }
}
