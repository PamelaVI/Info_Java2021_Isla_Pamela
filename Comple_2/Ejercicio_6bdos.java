import Ejercicio_6dos.java;
import java.util.*;

public class Ejercicio_6bdos {
    public  static void main(String[] args) {
        Set<Ejercicio_6dos>personas=new HashSet<Ejercicio_6dos>();

        Map<Integer,Integer> sueldo=new HashMap();
        Ejercicio_6dos per1=new Ejercicio_6dos("Perez","Juan",27765867,15, 1346);
        Ejercicio_6dos per2=new Ejercicio_6dos("Robles ","Pedro",32456789, 24, 2333);
        Ejercicio_6dos per3= new Ejercicio_6dos("Cisneros", "Marcos",23345678,25,3245);
        Ejercicio_6dos per4=new Ejercicio_6dos("Diaz"," Juan",32456700, 12,5678);
        Ejercicio_6dos per5=new Ejercicio_6dos("Isla","Paola",32111980, 23,4567);
        Ejercicio_6dos per6=new Ejercicio_6dos ("Valenzuela", "Maria",123098123, 10, 8765);
        Ejercicio_6dos per7=new Ejercicio_6dos("Zabala","Marcos", 76345098, 9, 1346);
        Ejercicio_6dos per8=new Ejercicio_6dos("Coronel", "Marcelo",12375951, 20, 1348);
        Ejercicio_6dos per9 =new Ejercicio_6dos("Cabre", "Nicolas", 9832175, 15, 9861);
        Ejercicio_6dos per10= new Ejercicio_6dos("Simons", "Carlos", 9730456, 25, 10000);

        personas.add(per1);
        personas.add(per2);
        personas.add(per3);
        personas.add(per4);
        personas.add(per5);
        personas.add(per6);
        personas.add(per7);
        personas.add(per8);
        personas.add(per9);
        personas.add(per10);

        for (Ejercicio_6dos ejercicio:personas){
            System.out.println("Apellido y Nombre:  "+ejercicio.apellido+"  -  "+ejercicio.nombre+" - "+"Dni: " + ejercicio.DNI + " - "+"Horas trabajadas:  "+ejercicio.hstrabajo+ " - " +"Valor por hora:  "+ejercicio.diario);
        }
    for (Ejercicio_6dos ejercicio:personas){
        sueldo.put(ejercicio.DNI,ejercicio.calcular(ejercicio.hstrabajo,ejercicio.diario));
    }
    sueldo.forEach((k,v)-> System.out.println("DNI: " + k + "  Sueldo:  " + v));;


        
    }
    
}
