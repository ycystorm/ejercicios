import java.util.Scanner;

public class ejercicio15 {
    public static void main(String[] args) throws Exception {
        int moneda;
        int aleatorio;
        System.out.println("juego del casillerazo");
        System.out.println("lansa una moneda, cara:1 y sello:2");
        Scanner registrar = new Scanner(System.in);
        moneda = registrar.nextInt();
        // utilizamos el metodo math.random para dar un numero aleatorio, antes tenemos
        // que especificar el emetodo int para no devolver decimales
        aleatorio = (int) (Math.random() * 2) + 1;
        if (aleatorio == 1 && moneda == 1) {
            //hago una comparcion entre la consola y la eleccion de la persina 
            System.out.println("salio cara has ganado");
        } else if (aleatorio == 2 && moneda == 2) {
            System.out.println("salio sello has ganado");
        } else if (aleatorio == 1 && moneda == 2) {
            System.out.println("salio cara has perdido");
        } else if (aleatorio == 2 && moneda == 1) {
            System.out.println("salio sello has perdido");
        }

        System.out.println("Gracias por jugar");

        // Limpiar Buffer
        registrar.close();
    }
}
