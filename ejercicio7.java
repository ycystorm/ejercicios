import java.util.Scanner;

public class ejercicio7 {
    public static void main(String[] args) {
        int num1;
        Scanner lectura=new Scanner(System.in);
        System.out.println("los meses se  representan del 1 al 12 ");
        System.out.println("por favor ingrese el numero correspondiente");
        num1=lectura.nextInt();
        switch(num1){
            case 1: 
            System.out.println("el mes es enero");
            break;
            case 2: 
            System.out.println("el mes es febrero");
            break;
            case 3: 
            System.out.println("el mes es marzo");
            break;
            case 4: 
            System.out.println("el mes esabril");
            break;
            case 5: 
            System.out.println("el mes es mayo");
            break;
            case 6: 
            System.out.println("el mes es junio");
            break;
            case 7: 
            System.out.println("el mes es julio");
            break;
            case 8: 
            System.out.println("el mes esagosto");
            break;
            case 9: 
            System.out.println("el mes es septiembre");
            break;
            case 10: 
            System.out.println("el mes es octubre");
            break;
            case 11: 
            System.out.println("el mes es noviembre");
            break;
            case 12: 
            System.out.println("el mes es diciembre");
            break;
            default:
            System.out.println("no ingreso ningun parametro coincidente");
            break;
        }
            lectura.close();

    }
}
