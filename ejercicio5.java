import java.util.Scanner;

public class ejercicio5 {
    public static void main(String[] args) {
        double num1,num2,suma,resta,multi,divi;
        int operacion;
        //instanciamos la clase escaner
        Scanner registrar=new Scanner(System.in);
        System.out.println("ingrese el primer numero");
        num1=registrar.nextDouble();
        System.out.println("por favor ingrese el segundo numero ");
        num2=registrar.nextDouble();
        System.out.println("elija una de las siguientes operacones con el respectivo numero suma es 1/ resta es 2,  multiplicacion es 3, division es 4");
        operacion=registrar.nextInt();
        switch(operacion){
            case 1:
            suma=num1+num2;
            System.out.println("usted elijio sumar el resultado es "+ suma );
            break;
            case 2:
            resta=num1-num2;
            System.out.println("usted elijio restar el resultado es "+ resta );
            break;
            case 3:
            multi=num1*num2;
            System.out.println("usted elijio multiplicar el resultado es "+ multi );
            break;
            case 4:
            divi=num1/num2;
            System.out.println("usted elijio dividir el resultado es "+ divi );
            break;
            default:
            System.out.println("usted eligio una operacion incorrecta");
            break;

        }
        System.out.println("gracias por utilizar el programa ");
        registrar.close();
        

    }
}
