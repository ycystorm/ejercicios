import java.util.Scanner;

public class ejercicio9 {
    public static void main(String[] args) {
        double a=0;
        double b=0;
        double c=0;
        double m=0;
        double n=0;
        double total=0;
        Scanner lectura= new Scanner(System.in);
        System.out.println("por favor ingrese el valor de A ");
        a=lectura.nextDouble();
        System.out.println("por favor ingrese el valor de B ");
        b=lectura.nextDouble();
        System.out.println("por favor ingrese el valor de C ");
        c=lectura.nextDouble();
        System.out.println("por favor ingrese el valor de M ");
        m=lectura.nextDouble();
        System.out.println("por favor ingrese el valor de N ");
        n=lectura.nextDouble();

        total=m*n;
        if(total>0){
            System.out.println(" El resultado es "+(a+b)*c/a);
        }
        else if(total==0){
            System.out.println(" El resultado es "+((a-b)/c)*b);
        }
        else if(total<0){
            System.out.println(" El resultado es "+((a*b)-c)/c);
        }
        lectura.close();
    }
}
