import java.util.Scanner;
import java.util.List;
import java.util.Collections;
import java.util.ArrayList;



public class Ejercicio_5dos {
    public static void main(String[] args) {
        ArrayList<Integer> horastrabajadas=new java.util.ArrayList<Integer>();

        horastrabajadas.add(6);
        horastrabajadas.add(7);
        horastrabajadas.add(8);
        horastrabajadas.add(4);
        horastrabajadas.add(5);

        System.out.println("La lista de Horas trabajadas esta compuesta por: "+ horastrabajadas);


        ArrayList<Integer>valor=new ArrayList<Integer>();


        valor.add(350);
        valor.add(345);
        valor.add(550);
        valor.add(600);
        valor.add(320);


        System.out.println("La lista del valor por cada hora: "+ valor);

        ArrayList<Integer>sueldo=new ArrayList<Integer>();

        for (int i=0; i<horastrabajadas.size();i++){
            sueldo.add(horastrabajadas.get(i)*valor.get(i));

        }
        System.out.println("El monto de cada dia es :"+ sueldo);

        int monto=0;
        for (int i: sueldo){
            monto +=i;
        }
        System.out.println("El monto total es igual a : "+ monto);
    }
    
}
