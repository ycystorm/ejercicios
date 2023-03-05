import java.util.Scanner;

public class ejercicio10 {
    public static void main(String[] args) {
        double pasajes = 0;
        double comida = 0;
        double hospedaje = 0;
        double atracciones = 0;
        double visa = 0;
        double gastos = 0;

        Scanner lectura = new Scanner(System.in);
        System.out.println(
                "este es un programa que le permite calcular el valor total de su viaje y le dara una respuesta correspondiente NOTA : NO AGREGE PUNTOS DECIMALES A LOS VALORES SI NO COLOQUELOS DE CORRIDO ");
        System.out.println("por favor ingrese el valor de los pasajes");
        pasajes = lectura.nextDouble();
        System.out.println("por favor ingrese el valor de la comida");
        comida = lectura.nextDouble();
        System.out.println("por favor ingrese el valor del hospedaje");
        hospedaje = lectura.nextDouble();
        System.out.println("por favor ingrese el precio de las atracciones que quiere tomar en el viaje ");
        atracciones = lectura.nextDouble();
        System.out.println("por favor ingrese el precio  del tramite de visa");
        visa = lectura.nextDouble();
        gastos = pasajes + comida + hospedaje + atracciones + visa;
        if (gastos < 3000000) {
            System.out.println("las vacaciones son ahorrativas");
        } else if (gastos == 3000000) {
            System.out.println("las vacaciones son normales");
        } else if (gastos > 3000000) {
            System.out.println("las vacaciones son elevadas");
        }
        lectura.close();
    }
}