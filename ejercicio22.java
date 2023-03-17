import java.util.Scanner;

public class ejercicio22 {
    public static void main(String[] args) {
        int columna,fila,i,j;
        Scanner lectura=new Scanner(System.in);
        String [] [] triqui=new String [3][3];
        for(fila=0;fila<3;fila++){
            for(columna=0;columna<3;columna++){
                System.out.println(" respuesta jugador 1");
                triqui[fila][columna]=lectura.next();
                System.out.println("respuesta del jugador 2 ");
                triqui[fila][columna]=lectura.next();
            }
        }
        for(i=0;i<3;i++){
            System.out.println("\n");
            for(j=0;j<3;j++){
              System.out.println(triqui[i][j]+"\t");
            }
        }
        lectura.close();
    }
}
