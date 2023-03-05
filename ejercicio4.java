import java.util.Scanner;

public class ejercicio4 {
    public static void main(String[] args) {
       int genero=0;
     Scanner  lectura= new Scanner(System.in);
     System.out.println("si eres hombre coloca 1 si no coloca 2");
     genero=lectura.nextInt();
     if(genero==1){
        System.out.println("gloria a los hombres");
     }
     else if(genero==2){
        System.out.println("gloria a las mujeres ");
     }
     else{
        System.out.println("no has eligido el parametro correcto");
     }
     lectura.close();
    }
}
