//Realizar un programa que al ejecutar se pueda ingresar 3 numeros enteros, para luego imprimirlos por pantalla 
import java.util.*;

public class Ejercicio2 {
    public static void main(String[]args){
        //creamos un objeto scanner que tomasra los valores de entrada por consola
        Scanner scan=new Scanner(System.in);
        int a =scan.nextInt();
        int b = scan.nextInt();
        int c =scan.nextInt();

        System.out.println("El primer numero ingresado es: "+ a);
        System.out.println("El segundo numero ingresado es: "+ b);
        System.out.println("El tercer numero ingresado es: " +c);
        scan.close();
    }
    
}
