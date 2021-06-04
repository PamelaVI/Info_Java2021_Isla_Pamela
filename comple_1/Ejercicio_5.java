import java.util.Scanner;

public class Ejercicio_5 {
    public  static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        int suma=0;
        System.out.print("Por favor ingresa un numero: ");
        int a=scan.nextInt();
        System.out.print("Por favor ingresa otro numero: ");
        int b=scan.nextInt();
        for (int i=1;i<=b;i++){
            suma=suma+a;
        }
        System.out.println("El producto es: "+suma);
        scan.close();
        
    }
    
}
