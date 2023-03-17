import java.util.Scanner;

public class ejercicio23{
    public static void main(String[] args) {
        int fila,columna,opera,i,j,total=0,totalr=0,totald=0,totalm=0,repetir;
        Scanner lectura=new Scanner(System.in);
        System.out.println("calculadora");
        String[][] calculadora=new String[][] {{"10","9","8","7"},{"6","5","4","3"},{"2","1","0","+"},{"-","/","*","="}};
        for(fila=0;fila<4;fila++){
            for(columna=0;columna<4;columna++){
                System.out.print(calculadora[fila][columna]+"\t");
            }
            System.out.println();
        }
        System.out.println("digita la operacion que quiere elegir suma:1,resta:2,division:3,multiplicacion:4");
      do{
        System.out.println("por favor digita tu operacion");
        opera=lectura.nextInt();
        if(opera==1){
            System.out.println("son maximo cinco numeros que se pueden sumar por vez");
            int[] suma=new int[5];
            for(i=0;i<5;i++){
                System.out.println("por favor digite los numeros ");
                suma[i]=lectura.nextInt();
            }
            for(j=0;j<5;j++){
                total+=suma[j];
            }
            System.out.println("tu total es "+total);
            
        }
        if(opera==2){
            System.out.println("son maximo dos numeros que se pueden restar por vez");
            int[] res=new int[2];
            for(int p=0;p<2;p++){
                System.out.println("por favor digite los numeros  el primero tiene que ser el mayor");
                res[p]=lectura.nextInt();
            }
            for(int s=0;s<1;s++){
                totalr=res[0]-res[1];  
            }
            System.out.println("tu total es "+totalr);
            
        }
        if(opera==3){
            System.out.println("son maximo dos numeros que se pueden dividir por vez");
            int[] divi=new int[2];
            for(int h=0;h<2;h++){
                System.out.println("por favor digite los numeros ");
                divi[h]=lectura.nextInt();
            }
            for(int l=0;l<2;l++){
                totald=divi[0]/divi[1];
            }
            System.out.println("tu total es "+totald);
        }
        if(opera==4){
            System.out.println("son maximo dos numeros que se pueden multiplicar por vez");
            int[] multi=new int[2];
            for(int m=0;m<2;m++){
                System.out.println("por favor digite los numeros ");
                multi[m]=lectura.nextInt();
            }
            for(int n=0;n<2;n++){
                totalm=multi[0]*multi[1];
            }
            System.out.println("tu total es "+totalm);
        }
        System.out.println("desea hace otra operacion si:1,no:2 ");
        repetir=lectura.nextInt();
      }while(repetir==1);
      lectura.close();
    }
}
