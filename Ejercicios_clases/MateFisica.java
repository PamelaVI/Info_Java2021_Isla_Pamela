import java.util.Scanner;
import java.util.*;

//Crear una función que realice la suma de 
//2 números dados.
//Observaciones:
//* Se deberán aplicar estilo de código 
//(Java) y uso de funciones.
//factorial

public class MateFisica {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Bienvenidos a Matefisica");
        System.out.println("¿Que tipo de operacion deseas realizar?");
        String menu=new String("Presione\n1-Sumar\n2-Restar\n3-Multiplicar\n4-Dividir\n5-Calcular_Factorial\n6-Velocidad\n7-Distancia\n8-Tiempo\n9-Diferencia_velocidad\n10-Fuerza\n11-Masa\n0-Salir");
        System.out.println(menu);
        System.out.print("Seleccione la opcion:");
        int opcion;
        opcion=scan.nextInt();
        switch (opcion){
            teclado =new Scanner(System.in){
                a= teclado.in;
                System.out.println("Ingrese el primer numero: ");
                b= teclado.in;
                System.out.println("Ingrese el segundo numero: ");
                
                case 1:
                int c= sumar(a,b);
                System.out.println(c);
                break;
                case 2:
                int c= restar(a,b);
                System.out.println(c);
                break;
                case 3:
                int c=multiplicar(a,b);
                System.out.println(c);
                break;
                case 4:
                int c=dividir(a,b);
                System.out.println(c);
                break;
                case 5:
                int c=factorizacion(a);
                System.out.println(c);
                break;
                case 6:
                int c=velocidades(a,b);
                System.out.println(c);
                break;
                case 7:
                int c=distancias(a,b);
                System.out.println(c);
                break;
                case 8:
                int c=tiempos(a,b);
                System.out.println(c);
                break;
                case 9:
                int c=difvel(a,b);
                System.out.println(c);
                break;
                case 10:
                int c=newton(a,b);
                System.out.println(c);
                break;
                case 11:
                int c=masado(a,b);
                System.out.println(c);
                case 0:
                break;
            
        }
        teclado.close();
    }
    //creamos la funcion sumar
    static int sumar(int sumando1,int sumando2){
        //creamos la variable que guarda 
        int total;
        //suma los valores y su resultado lo guarda
        total = sumando1 + sumando2;
        //devuelve  esta variable tipo int
        return total;
    }
    //creamos la funcion restar
    static int restar(int minuendo,int sustraendo){
        int diferencia;
        diferencia= minuendo - sustraendo;
        return diferencia;
    }
    //creamos la funcion multiplicar
    static int multiplicar(int multiplicando, int multiplicador){
        int producto;
        producto= multiplicando *multiplicador;
        return producto;
    }
    //creamos la funcion dividir
    static int dividir(int dividendo, int divisor ){
        int cociente;
        cociente= dividendo / divisor ;
        return cociente;
    }
    //creamos la funcion factorial
    static int factorizacion(int num){
        int factorial=1;
        for (int i = 1; i <= num; i ++) {
            factorial = factorial * i;
    
    }
}
    //formulas basicas de fisica
    //funcion Velocidad
    static int velocidades(int distancia, int tiempo){
        int velocidad;
        velocidad= distancia / tiempo;
        return velocidad;
    }
    //funcion distancia 
    static int distancias(int velocidad, int tiempo){
        int distancia;
        distancia= velocidad * tiempo;
        return distancia;
    }
    //funcion tiempo
    static int tiempos(int distancia,int velocidad){
        int tiempo;
        tiempo= distancia /velocidad;
        return tiempo;
    }
    //funcion  dif de velocidad
    static int difvel(int vf,int vi){
        int difvelocidad;
        difvelocidad= vf - vi;
        return difvelocidad;
    }

    //funcion fuerza
    static int newton(int masa, int aceleracion){
        int fuerza;
        fuerza= masa *aceleracion;
        return fuerza;

    }
    //funcion masa
    static int masado(int fuerza,int aceleracion){
        int masa;
        masa= fuerza/ aceleracion;
        return masa;
    }


}
}
