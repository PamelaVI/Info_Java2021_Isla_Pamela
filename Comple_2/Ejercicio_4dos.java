import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class Ejercicio_4dos {
    public static void main(String[] args) {
        
    
    List<String>estudiando = new ArrayList<String>();

        estudiando.add("Andres");
        estudiando.add("Ramona");
        estudiando.add("Carlos");
        estudiando.add("Daniela");
        estudiando.add("Emanuel");
        estudiando.add("Florencia");
        estudiando.add("Gonzalo");
        estudiando.add("Pedro");
        estudiando.add("Irma");
        estudiando.add("Julian");
        estudiando.add("Dalma");
        estudiando.add("Dario");
        {
        System.out.println("La lista esta compuesta por los siguientes estudiantes:"+ estudiando);
        }
       // List<Integer> cursos= new ArrayList<Integer>(estudiando);
        List<String> primero = estudiando.subList(0, 4);
        List<String> segundo = estudiando.subList(4, 8);
        List<String> tercero = estudiando.subList(8, 12);
        System.out.println("El primer curso esta formado por los siguientes estudiantes: "+primero); 
        System.out.println("El segundo curso esta formado por los siguientes estudiantes:" +segundo);
        System.out.println("El tercer curso esta formado por los siguientes estudiantes :" +tercero);
      
    } 
}


    

