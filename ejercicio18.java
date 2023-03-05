import java.util.Scanner;

public class ejercicio18 {
    public static void main(String[] args) {
        int n=0;
        Scanner fruteria= new Scanner(System.in);
        System.out.println(" por favor ingrese el numero de frutas a registrar ");
        n=fruteria.nextInt();
        String [] frutas =new String[n];
        for(int i=0; i<n; i++){
            System.out.println("digite el nombre de la fruta ene la posicion "+i);
            frutas[i]=fruteria.next();
        }
        System.out.println(" tus productos son :");
        for(int j=0; j<frutas.length; j++ ){
            System.out.println(frutas[j]);
        }
        fruteria.close();
}
}
