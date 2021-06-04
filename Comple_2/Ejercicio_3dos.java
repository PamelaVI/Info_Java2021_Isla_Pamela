import java.util.ArrayList;
import java.util.Scanner;
import java.util.Collections;
import java.util.List;


public class Ejercicio_3dos {
    public static void main(String[] args){
        ArrayList <Object> francesa=new ArrayList<Object>();

        francesa.add(1);
        francesa.add(2);
        francesa.add(3);
        francesa.add(4);
        francesa.add(5);
        francesa.add(6);
        francesa.add(7);
        francesa.add(8);
        francesa.add(9);
        francesa.add("J");
        francesa.add("Q");
        francesa.add("K");

        for (int i=0; i <francesa.size(); i++){
            System.out.println(francesa.get(i));
        }
        
        Collections.reverse(francesa);

        System.out.println("Las barajas en inverso son : " + francesa);
    
        Collections.shuffle(francesa);
        System.out.println("Las barajas mezcladas quedan: "+francesa);
    }

    
}
