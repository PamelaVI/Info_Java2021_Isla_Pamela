import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int continuar =1;
        int numero;
        while(continuar ==1){
            System.out.println("Por favor ,ingrese un numero: ");
            numero=scan.nextInt();
            System.out.println("El numero ingresadp es : "+ numero);
            System.out.println("Si desea continuar presione 1 , sino cualquier otro numero");
            continuar= scan.nextInt();
        }
        scan.close();
        
    }
    
}
