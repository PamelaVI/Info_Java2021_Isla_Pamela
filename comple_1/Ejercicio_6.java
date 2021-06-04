import java.util.Scanner;

public class Ejercicio_6 {
    public static void main(String[]args){
        Scanner scan=new Scanner(System.in);
        int base;
        int exponente;
        int potencia;
        potencia =1;
        System.out.println("Ingrese la base de la potencia: ");
        base=scan.nextInt();
        System.out.println("Ingrese el exponente de la potencia:");
        exponente=scan.nextInt();
        while (0<exponente){
            potencia=potencia*base;
            exponente --;//esto hace que al valor del exponente se le reste 1
        }
        System.out.println("La potencia es :"+potencia);
        scan.close();
    }

    
}
