import java.util.Scanner;


public class Ejercicio_7 {
    public static void main(String[] args) {

        String newCadena=new String("");
        String scan="bienvenidos al informatorio 2021, etapa 3";
        System.out.println(scan);
        int i=0;
        while(i< scan.length()){
            newCadena=newCadena +scan.toUpperCase().charAt(i);
            i++;
        }
        System.out.println(newCadena);
        
    }
    
}
