import java.util.Escanner;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio_1dos {
    public static void main(String[] args) {
        ArrayList<String>capitales =new ArrayList<String>();

        capitales.add("Parana");
        capitales.add("Bariloche");
        capitales.add("San Fernando del valle de Catamarca");
        capitales.add("San Miguel de Tucuman");
        capitales.add("Resistencia");
        capitales.add("Santa Rosa");
        capitales.add("San Miguel de Tucuman");
        capitales.add("Ushuaia");
        capitales.add("General Pinedo");
        capitales.add("La Plata");

        for (int i = 0; i < capitales.size();i++){
            System.out.println("#"+""+ (i+1)+"-" + "" +"" +capitales.get(i));
        }
        
    }
    
}
