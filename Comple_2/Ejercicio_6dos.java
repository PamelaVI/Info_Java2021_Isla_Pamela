import java.util.*;
import java.util.Set;



class Ejercicio_6dos {
    String apellido;
    String nombre;
    int DNI;
    int hstrabajo;
    int diario;

    public Ejercicio_6dos(String apellido, String nombre,int DNI,int hstrabajo,int diario ){
        this.apellido=apellido;
        this.nombre=nombre;
        this.DNI= DNI;
        this.hstrabajo=hstrabajo;
        this.diario=diario;
    }
    public int calcular(int hstrabajo,int diario){
        return hstrabajo*diario;
    }
    
}
