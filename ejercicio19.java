import java.util.Scanner;

public class ejercicio19{
    public static void main(String[] args) {
        int n,total=0,i;
        Scanner nota=new Scanner(System.in);
        System.out.println("por favor ingrese la cantidad de notas sacadas");
        n=nota.nextInt();
        int [] vector= new int[n];
        for( i=0; i<n;i++){
            System.out.println("por favor ingrese la nota "+i);
            vector[i]=nota.nextInt();
        }
        for (i=0; i<n; i++){
            total=total+vector[i]/ n;
         }
         if(total<3){
            System.out.println("reprobaste");
         }
         else if (total==3 && total<4){
            
            System.out.println("pasaste raspando");
         }
         else if(total>4){
            
            System.out.println("aprobaste con buenos resultados");
         }
       nota.close();
    }
}