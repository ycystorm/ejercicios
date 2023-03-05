import java.util.Scanner;

public class ejercicio2 {
    public static void main(String[] args) {
        int edad;
        //instanciar la clase escaner//
        Scanner lectura=new Scanner(System.in);
        System.out.println("bienvenido a la discote mis primeros amigos ");
        System.out.println("por favor diga su edad ");
        edad=lectura.nextInt();
        if(edad>=18){
            System.out.println(" puede ingresar  a la discoteca  ");
        }else{
            System.out.println("no puede ingresar a la discoteca ");
        }
        lectura.close();
    }
}
