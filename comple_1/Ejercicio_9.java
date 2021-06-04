import java.util.Scanner;

public class Ejercicio_9 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String frase= " Bienvenidos al Informatorio Java 2021";
        System.out.println(frase);
        int contador=0;
        char caracter;
        System.out.print("Introduce la letra que deseas contar las veces que aparece en tu frase:");
        caracter = sc.next().charAt(0);
        char[] conv = frase.toCharArray();
        for(int i = 0; i < frase.length(); i++){
            if(caracter == conv[i]){
                contador++;
            }
        }

        System.out.println("La frase \"" + frase + "\" contiene " +
                contador + " veces el carácter " + caracter);
                sc.close();
        
    }
   
}
