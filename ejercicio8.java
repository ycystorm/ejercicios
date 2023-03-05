import java.util.Scanner;

public class ejercicio8 {
    public static void main(String[] args) {
        double medida;
        Scanner lectura=new Scanner(System.in);
        System.out.println("por favor ingresar la medida del tornillo, el programa no lee puntos decimales sino que se reemplaza por la coma  ");
        medida=lectura.nextDouble();
        if(medida<1.5){
            System.out.println("el tornillo es mediano");
        }
        else if(medida>1.5){
            System.out.println("el tornillo es 3/4");
        }
        else if(medida==1.5){
            System.out.println("el tornillo es pequeño ");
        }
        System.out.println("gracias por usar el programa");
        lectura.close();
    }
    
}
