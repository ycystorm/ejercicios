//se importa la clase Scanner
import java.util.Scanner;
public class ejercicio13 {
    public static void main(String[] args) throws Exception {
        
        int seleccion;
        int aleatorio;
        System.out.println("juego de piedra, papel o tijera");
        System.out.println("seleccion: piedra:1, papel:2, tijera:3");
        Scanner registrar=new Scanner(System.in);
        seleccion=registrar.nextInt();
        aleatorio=(int) (Math.random()*3)+1;
         // utilizamos el metodo math.random para dar un numero aleatorio, antes tenemos
        // que especificar el emetodo int para no devolver decimales
          //hago una comparcion entre la consola y la eleccion de la persona, metodo para comparar && 
        if(aleatorio==1 && seleccion==1){
            System.out.println("respuesta tijera");
            System.out.println("has ganado");
        }
        else if(aleatorio==2 && seleccion==1){
            System.out.println("respuesta papel");
            System.out.println("has perdido");
        }
        else if(aleatorio==3 && seleccion==1){
            System.out.println("empate");
        }
        else if(aleatorio==2 && seleccion==2){
            System.out.println("respuesta piedra");
            System.out.println("has ganado");
        }
        else if(aleatorio==1 && seleccion==2){
            System.out.println("respuesta tijera");
            System.out.println("has perdido");
        }
        else if(aleatorio==3 && seleccion==2){
            System.out.println("empate");
        }
        else if(aleatorio==3 && seleccion==3){
            System.out.println("respuesta piedra");
            System.out.println("has perdido");
        }
        else if(aleatorio==2 && seleccion==3){
            System.out.println("respuesta papel");
            System.out.println("has ganado");
        }
        else if(aleatorio==1 && seleccion==3){
            System.out.println("empate");
        }
        System.out.println("Gracias por jugar");

        //Limpiar Buffer
        registrar.close();
    }
}

