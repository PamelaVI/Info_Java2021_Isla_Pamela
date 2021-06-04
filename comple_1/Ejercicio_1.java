import java.util.Scanner;

public class Ejercicio_1 {
    public  static void main(String[] args) {
        Scanner Teclado =new Scanner(System.in);
        String usuario;
        System.out.println("Ingrese su nombre: ");
        usuario= Teclado.nextLine();
        System.out.println("Hola "+usuario);
        Teclado.close();
        
    }
    
}
