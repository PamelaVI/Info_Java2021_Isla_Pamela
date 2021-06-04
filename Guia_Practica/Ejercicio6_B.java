import java.util.Scanner;

public class Ejercicio6_B {
    public static void  main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int continuar =1;
        int numero;
        do{
            System.out.println("Por favor,ingrese un numero:");
            numero=scan.nextInt();
            System.out.println("El numero ingresado es: "+numero);

            System.out.println("Si desea continuar presione 1,sino cualquier otro numero");
            continuar=scan.nextInt();
        }while (continuar ==1);
        scan.close();

        
    }
    
}
