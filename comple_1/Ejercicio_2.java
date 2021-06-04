import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[]args){
        Scanner scan=new Scanner (System.in);
        System.out.println("Ingrese el primer numero: ");
        int a=scan.nextInt();
        System.out.println("El numero ingresado es: "+a);

        System.out.println("Ingrese el segundo  numero: ");
        int b= scan.nextInt();
        System.out.println("El numero ingresado es :"+b);

        System.out.println("A continuacion el sistema realizara los siguientes calculos con los numeros ingresados :\n suma \n resta\n multiplicacion\n division\n resto");


        int suma= a+b;
        System.out.println( "El resultado de la suma es: "+suma );

        int resta= a-b;
        System.out.println("El resultado de la resta es:" + resta);

        int multiplicacion= a*b;
        System.out.println("El resultado de la multiplicacion  es: " + multiplicacion );

        int division= a/b;
        System.out.println("El resultado de la division es:" + division);
       
        int resto= a %b;
        System.out.println("El resto de la division es: " + resto);

        scan.close();


    }
    
}
