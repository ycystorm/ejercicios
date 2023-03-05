import java.util.Scanner;

public class ejercicio3{
    public static void main(String[] args) {
         int tor;
        System.out.println("tenemos tres tipos de tornillos  a,b y c elija em concecuencia ");
        System.out.println("para elegir el tipo a coloque 1, para elegir el tipo b coloque 2, para elegir el tipo c coloque 3");
         Scanner lectura= new Scanner(System.in);
         tor=lectura.nextInt();
         if(tor==1){
            System.out.println("tu pedido es el tornillo tipo a cullo valor es 1000");
         }
         else if(tor==2){
            System.out.println("tu pedido es el tornillo tipo b cullo valor es 1500");
         }
         
         else if(tor==3){
            System.out.println("tu pedido es el tornillo tipo c cullo valor es 2000");
         }
         else{
            System.out.println("no has elegido ninguno de los pedidos ");
         }
         lectura.close();
    }
    
 }