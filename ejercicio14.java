import java.util.Scanner;

public class ejercicio14{
    public static void main(String[] args) {
        double far,conversion;
        Scanner lectura = new Scanner(System.in);
       System.out.println("por favor ingrese los grados para la convercion");
       far=Double.parseDouble(lectura.nextLine());
       System.out.println(" el resultado de la conversion es ");
       conversion= ( far - 32)*5/9 + 273.15;
       System.out.println(conversion +" f ");
       lectura.close();
    }
}