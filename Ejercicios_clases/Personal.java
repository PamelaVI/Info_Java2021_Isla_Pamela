import java.util.*;
import java.util.Set;
import Lista_Empleados.java;

public class Personal {
    private String apellido;
    private String  nombre;
    private String fechanacimiento;
    private int dni;
    private int cuil;
    private String periodo_liq;
    private int monto;

    public Personal(){

    }
    public Personal(String apellido,String nombre, String fechanacimiento, int dni, int cuil, String periodo_liq, int monto){
        this.apellido=apellido;
        this.nombre=nombre;
        this.fechanacimiento=fechanacimiento;
        this.dni=dni;
        this.cuil=cuil;
        this.periodo_liq=periodo_liq;
        this.monto=monto;
    }
    public String getApellido(){
        return apellido;
    }
    public void setApellido(String apellido){
        this.apellido=apellido;
    }

    public String getNombre(){
        return nombre;

    }
    public  void setNombre(String nombre){
        this.nombre=nombre;
    }
    public String getFechanacimiento(){
        return fechanacimiento;
    }
    public void setFechanacimiento(String fechanacimiento){
        this.fechanacimiento=fechanacimiento;
    }
    public int getDni(){
        return dni;
    }
    public void setDni(int dni){
        this.dni=dni;
    }
    public int getCuil(){
        return cuil;
    }
    public void setCuil(int cuil){
        this.cuil=cuil;

    }
    public String getPeriodo_liq(){
        return periodo_liq;
    }
    public void setPeriodo_liq(String periodo_liq){
        this.periodo_liq=periodo_liq;
    }
    public int getMonto(){
        return monto;
    }
    public void setMonto(int monto){
        this.monto=monto;
    }

    System.out.println(Lista_Empleados);

   
}
