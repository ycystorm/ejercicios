import java.util.Scanner;

public class ejercicio11 {
    public static void main(String[] args) {
        double edad = 0;
        Scanner lectura = new Scanner(System.in);
        System.out.println(
                "NOTA : SI SUEDAD ESTA POR EJEMPLO EN UN AÑO Y DOS MESES COLOCA 1,2 UNO CORRESPONDE AL AÑO Y DOS AL MES SI CUMPLE CON ESTE EJEMPLO O PARECIDO POR FAVOR HACER LO INDICADO ");
        System.out.println("POR FAVOR DIGITE SU EDAD ");
        edad=lectura.nextDouble();
        if(edad>=0.0 && edad<1){
            System.out.println("  es un bebe de "+edad+" meses ");
        } 
        else if(edad>=1 && edad<10){
            System.out.println(" usted es un niño de "+edad+" años ");
        } 
        else if(edad>=10 && edad<15){
            System.out.println(" usted es un adolecente de "+edad+" años ");
        }
        else if(edad>=15 && edad<18){
            System.out.println(" usted es un joven de "+edad+" años ");
        }
        else if(edad>=18){
            System.out.println(" usted  es un adulto de "+edad+" años ");
        }
        else{
            System.out.println(" a digitado un parametro incorrecto ");
        }
        lectura.close();
    }
}