import java.util.Scanner;

public class Ejercicio_8 {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        String nombre;
        String edad; 
        String direccion;
        String ciudad;
        System.out.println("Introduce un Nombre y Apellido: ");
        nombre=scan.nextLine().toUpperCase();
        System.out.println("Introduce tu edad:");
        edad=scan.nextLine();
        System.out.println("Introduce tu direccion:");
        direccion=scan.nextLine().toUpperCase();
        System.out.println("Introduce tu ciudad:");
        ciudad=scan.nextLine().toUpperCase();
        System.out.println(""+ciudad+" - "+""+direccion+" - "+""+edad+"  años  - "+""+nombre);
        scan.close();
    }
}
