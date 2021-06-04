import java.util.*;
import java.util.ArrayList;

public class Ejercicio_7dos {
    public static void main(String[]args){
        fizzBuzzFuncion(1,8);
    }
    public static void fizzBuzzFuncion(int iniciar,int finalizar){
        ArrayList<String>lista;
        lista=new ArrayList();
        for(int i=iniciar; i<finalizar;i++){
            if(i%2==0 && i % 3==0){
                lista.add("FizzBuzz");
            }else if (i%2==0){
                lista.add("Fizz");
            }else if (i % 3==0){
                lista.add("Buzz");
            }else{
                lista.add(String.valueOf(i));
            }

            }
            System.out.println(lista);
            }

            
            
        
    
}
