import java.util.Scanner;

public class ejercicio12 {
    public static void main(String[] args) {
        double not1=0;
        double not2=0;
        double not3=0;
        double promedio=0;
        Scanner lectura= new Scanner(System.in);
        System.out.println(" NOTA: LA COMA REMPLAZA AL PUNTO DECIMAL EN LAS RESPUESTAS ");
        System.out.println(" por favor ingrese la nota 1 ");
        not1=lectura.nextDouble();
        System.out.println(" por favor ingrese la nota 2 ");
        not2=lectura.nextDouble();
        System.out.println(" por favor ingrese la nota 3 ");
        not3=lectura.nextDouble();
        promedio=(not1+not2+not3)/3;
        if(promedio>=0.0 && promedio<1){
            System.out.println(" nota sacada "+ promedio+" la cual es pesima");
        } 
        else if(promedio>=1 && promedio<2){
            System.out.println(" nota sacada "+ promedio+" la cual es mala ");
        } 
        else if(promedio>=2 && promedio<3){
            System.out.println(" nota sacada "+ promedio+" la cual es regular ");
        }
        else if(promedio>=3 && promedio<4){
            System.out.println(" nota sacada "+ promedio+" la cual es bueno ");
        }
        else if(promedio>=4 && promedio<5){
            System.out.println(" nota sacada "+ promedio+" la cual es sobresaliente  ");
        }
        else if(promedio==5){
            System.out.println(" nota sacada "+ promedio+" la cual es con honores  ");
        }
        else{
            System.out.println(" a digitado un parametro incorrecto ");
        }
        lectura.close();
    }
}
