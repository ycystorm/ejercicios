import java.util.Scanner;
public class ejercico1 {
    public static void main(String[] args){
        int anioActual=0;
        int fechaNacimiento=0;
        String nombre;
        int total=0;
        System.out.println("digita tu nombre");
        /*parte para ejecutar el metodo scanner */
        Scanner registrar = new Scanner(System.in);
        /*ingresa el nombre */
        nombre=registrar.nextLine();
        System.out.println("digita tu  año de nacimiento");
        fechaNacimiento=registrar.nextInt();
        System.out.println("digita el año actual ");
        anioActual=registrar.nextInt();
        total=anioActual-fechaNacimiento;
        System.out.println(nombre +" tu edad actual es "+ total);
        registrar.close(); 
    } 
}
