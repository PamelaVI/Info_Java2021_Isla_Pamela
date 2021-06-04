import java.util.Scanner;

public class Ejercicio_4 {
    public  static void main(String[] args) {
        long Factorial =1;
        int num;
        Scanner numero=new Scanner(System.in);
        System.out.print("Introduce un numero: ");
        num=numero.nextInt();
        for(int i=num;i>0;i--){
            Factorial=Factorial*i;

        }
        System.out.println("El factorial de "  + num + " es: "+ Factorial);
        numero.close();
        
    }
    
}
