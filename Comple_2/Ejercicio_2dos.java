import java.util.Scanner;
import java.util.ArrayList;

public class Ejercicio_2dos {
    public  static void main (String[]args){
        
        ArrayList <Integer> enteritos=new ArrayList<Integer>();


        enteritos.add(15);
        enteritos.add(25);
        enteritos.add(35);
        enteritos.add(45);
        enteritos.add(55);

        for (int i=0; i <enteritos.size(); i++){
            System.out.println(enteritos.get(i));
        
        }
        System.out.println("La lista esta compuesta por los siguientes elementos:"+ enteritos.size());

        enteritos.add(0,5);
        enteritos.add(65);

        for (int i=0; i <enteritos.size(); i++){
            System.out.println(enteritos.get(i));
        
    }
    System.out.println("La lista esta compuesta ahora por los siguientes elementos:"+ enteritos.size());

}
    
}
