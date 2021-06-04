//ejemplo de encapsulamiento

public class AnimalEncapsulamiento{
   
    private String nombre;
    private String tipo_alimento;
    private int edad;
    private int peso;

    public AnimalEncapsulamiento(String nombre,String tipo_alimento,int edad,int peso){
        this.nombre=nombre;
        this.tipo_alimento=tipo_alimento;
        this.edad=edad;
        this.peso=peso;
    }
    public String getNombre(){
        return nombre;
    }
    public void setNombre(String nombre){
        this.nombre=nombre;

    }

    public String getTipo_alimento(){
        return tipo_alimento;
    }
    public void setTipo_alimento(String tipo_alimento){
        this.tipo_alimento=tipo_alimento;

    }

    public int getEdad(){
        return edad;
    }
    public void setEdad(int edad){
        this.edad=edad;

    }

    public int getPeso(){
        return peso;
    }
    public void setPeso(int peso){
        this.peso=peso;

    }
}