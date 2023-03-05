import java.util.Scanner;

public class ejercicio6 {
    public static void main(String[] args) {
        double num1=0;
        double num2=0;
        Scanner lectura=new Scanner(System.in);
        System.out.println("este es un programa que te permitira descubrir que numero es mayo , menor o si son iguales ");
        System.out.println("ingrese el numero 1");
        num1=lectura.nextDouble();
        System.out.println("ingrese el numero 2");
        num2=lectura.nextDouble();
        if(num1>num2){
            System.out.println("el"+num1+"es mayor que "+num2);
        }
        else if(num1<num2){
            System.out.println("el"+num1+"es menor que "+num2);
        }else if(num1==num2){
            System.out.println("ambos numeros son iguales  ");
        }
        lectura.close();
    
    }
}
